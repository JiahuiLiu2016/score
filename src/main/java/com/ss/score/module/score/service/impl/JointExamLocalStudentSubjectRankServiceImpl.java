package com.ss.score.module.score.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ss.score.module.score.domain.dto.JointExamLocalStudentSubjectRankCreateDTO;
import com.ss.score.module.score.domain.dto.JointExamLocalStudentSubjectRankUpdateDTO;
import com.ss.score.module.score.domain.entity.JointExamLocalStudentSubjectRank;
import com.ss.score.module.score.domain.vo.JointExamLocalStudentSubjectRankVO;
import com.ss.score.module.score.mapper.JointExamLocalStudentSubjectRankMapper;
import com.ss.score.module.score.service.IJointExamLocalStudentSubjectRankService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 记录联考时本校学生各科的排名信息 服务实现类
 *
 * @author ljh
 * @since 2025-02-03
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class JointExamLocalStudentSubjectRankServiceImpl extends ServiceImpl<JointExamLocalStudentSubjectRankMapper, JointExamLocalStudentSubjectRank> implements IJointExamLocalStudentSubjectRankService {

    @Override
    public List<JointExamLocalStudentSubjectRankVO> listVO() {
        return baseMapper.selectListVO();
    }

    @Override
    public JointExamLocalStudentSubjectRankVO getByIdVO(Long id) {
        return baseMapper.selectByIdVO(id);
    }

    @Override
    public void saveByDTO(JointExamLocalStudentSubjectRankCreateDTO dto) {
        JointExamLocalStudentSubjectRank entity = new JointExamLocalStudentSubjectRank();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.insert(entity);
    }

    @Override
    public void updateByDTO(JointExamLocalStudentSubjectRankUpdateDTO dto) {
        JointExamLocalStudentSubjectRank entity = new JointExamLocalStudentSubjectRank();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.updateById(entity);
    }

    @Override
    public void deleteById(Long id) {
        baseMapper.deleteById(id);
    }
}
