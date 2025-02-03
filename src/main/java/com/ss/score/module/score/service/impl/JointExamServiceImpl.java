package com.ss.score.module.score.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ss.score.module.score.domain.dto.JointExamCreateDTO;
import com.ss.score.module.score.domain.dto.JointExamUpdateDTO;
import com.ss.score.module.score.domain.entity.JointExam;
import com.ss.score.module.score.domain.vo.JointExamVO;
import com.ss.score.module.score.mapper.JointExamMapper;
import com.ss.score.module.score.service.IJointExamService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 记录联考的信息 服务实现类
 *
 * @author ljh
 * @since 2025-02-03
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class JointExamServiceImpl extends ServiceImpl<JointExamMapper, JointExam> implements IJointExamService {

    @Override
    public List<JointExamVO> listVO() {
        return baseMapper.selectListVO();
    }

    @Override
    public JointExamVO getByIdVO(Long id) {
        return baseMapper.selectByIdVO(id);
    }

    @Override
    public void saveByDTO(JointExamCreateDTO dto) {
        JointExam entity = new JointExam();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.insert(entity);
    }

    @Override
    public void updateByDTO(JointExamUpdateDTO dto) {
        JointExam entity = new JointExam();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.updateById(entity);
    }

    @Override
    public void deleteById(Long id) {
        baseMapper.deleteById(id);
    }
}
