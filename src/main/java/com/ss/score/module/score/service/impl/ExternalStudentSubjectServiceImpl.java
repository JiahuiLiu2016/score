package com.ss.score.module.score.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ss.score.module.score.domain.dto.ExternalStudentSubjectCreateDTO;
import com.ss.score.module.score.domain.dto.ExternalStudentSubjectUpdateDTO;
import com.ss.score.module.score.domain.entity.ExternalStudentSubject;
import com.ss.score.module.score.domain.vo.ExternalStudentSubjectVO;
import com.ss.score.module.score.mapper.ExternalStudentSubjectMapper;
import com.ss.score.module.score.service.IExternalStudentSubjectService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 记录外校学生的学科选择信息 服务实现类
 *
 * @author ljh
 * @since 2025-02-03
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ExternalStudentSubjectServiceImpl extends ServiceImpl<ExternalStudentSubjectMapper, ExternalStudentSubject> implements IExternalStudentSubjectService {

    @Override
    public List<ExternalStudentSubjectVO> listVO() {
        return baseMapper.selectListVO();
    }

    @Override
    public ExternalStudentSubjectVO getByIdVO(Long id) {
        return baseMapper.selectByIdVO(id);
    }

    @Override
    public void saveByDTO(ExternalStudentSubjectCreateDTO dto) {
        ExternalStudentSubject entity = new ExternalStudentSubject();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.insert(entity);
    }

    @Override
    public void updateByDTO(ExternalStudentSubjectUpdateDTO dto) {
        ExternalStudentSubject entity = new ExternalStudentSubject();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.updateById(entity);
    }

    @Override
    public void deleteById(Long id) {
        baseMapper.deleteById(id);
    }
}
