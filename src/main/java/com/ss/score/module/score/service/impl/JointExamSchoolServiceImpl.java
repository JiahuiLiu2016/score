package com.ss.score.module.score.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ss.score.module.score.domain.dto.JointExamSchoolCreateDTO;
import com.ss.score.module.score.domain.dto.JointExamSchoolUpdateDTO;
import com.ss.score.module.score.domain.entity.JointExamSchool;
import com.ss.score.module.score.domain.vo.JointExamSchoolVO;
import com.ss.score.module.score.mapper.JointExamSchoolMapper;
import com.ss.score.module.score.service.IJointExamSchoolService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 记录参与联考的学校信息 服务实现类
 *
 * @author ljh
 * @since 2025-02-03
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class JointExamSchoolServiceImpl extends ServiceImpl<JointExamSchoolMapper, JointExamSchool> implements IJointExamSchoolService {

    @Override
    public List<JointExamSchoolVO> listVO() {
        return baseMapper.selectListVO();
    }

    @Override
    public JointExamSchoolVO getByIdVO(Long id) {
        return baseMapper.selectByIdVO(id);
    }

    @Override
    public void saveByDTO(JointExamSchoolCreateDTO dto) {
        JointExamSchool entity = new JointExamSchool();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.insert(entity);
    }

    @Override
    public void updateByDTO(JointExamSchoolUpdateDTO dto) {
        JointExamSchool entity = new JointExamSchool();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.updateById(entity);
    }

    @Override
    public void deleteById(Long id) {
        baseMapper.deleteById(id);
    }
}
