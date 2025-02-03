package com.ss.score.module.score.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ss.score.module.score.domain.dto.JointExamLocalStudentTotalRankCreateDTO;
import com.ss.score.module.score.domain.dto.JointExamLocalStudentTotalRankUpdateDTO;
import com.ss.score.module.score.domain.entity.JointExamLocalStudentTotalRank;
import com.ss.score.module.score.domain.vo.JointExamLocalStudentTotalRankVO;
import com.ss.score.module.score.mapper.JointExamLocalStudentTotalRankMapper;
import com.ss.score.module.score.service.IJointExamLocalStudentTotalRankService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 记录联考时本校学生的总分排名信息 服务实现类
 *
 * @author ljh
 * @since 2025-02-03
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class JointExamLocalStudentTotalRankServiceImpl extends ServiceImpl<JointExamLocalStudentTotalRankMapper, JointExamLocalStudentTotalRank> implements IJointExamLocalStudentTotalRankService {

    @Override
    public List<JointExamLocalStudentTotalRankVO> listVO() {
        return baseMapper.selectListVO();
    }

    @Override
    public JointExamLocalStudentTotalRankVO getByIdVO(Long id) {
        return baseMapper.selectByIdVO(id);
    }

    @Override
    public void saveByDTO(JointExamLocalStudentTotalRankCreateDTO dto) {
        JointExamLocalStudentTotalRank entity = new JointExamLocalStudentTotalRank();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.insert(entity);
    }

    @Override
    public void updateByDTO(JointExamLocalStudentTotalRankUpdateDTO dto) {
        JointExamLocalStudentTotalRank entity = new JointExamLocalStudentTotalRank();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.updateById(entity);
    }

    @Override
    public void deleteById(Long id) {
        baseMapper.deleteById(id);
    }
}
