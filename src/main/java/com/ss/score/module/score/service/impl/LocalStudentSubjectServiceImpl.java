package com.ss.score.module.score.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ss.score.module.score.domain.dto.LocalStudentSubjectCreateDTO;
import com.ss.score.module.score.domain.dto.LocalStudentSubjectUpdateDTO;
import com.ss.score.module.score.domain.entity.LocalStudentSubject;
import com.ss.score.module.score.domain.vo.LocalStudentSubjectVO;
import com.ss.score.module.score.mapper.LocalStudentSubjectMapper;
import com.ss.score.module.score.service.ILocalStudentSubjectService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 记录本校学生的学科选择信息 服务实现类
 *
 * @author ljh
 * @since 2025-02-03
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class LocalStudentSubjectServiceImpl extends ServiceImpl<LocalStudentSubjectMapper, LocalStudentSubject> implements ILocalStudentSubjectService {

    @Override
    public List<LocalStudentSubjectVO> listVO() {
        return baseMapper.selectListVO();
    }

    @Override
    public LocalStudentSubjectVO getByIdVO(Long id) {
        return baseMapper.selectByIdVO(id);
    }

    @Override
    public void saveByDTO(LocalStudentSubjectCreateDTO dto) {
        LocalStudentSubject entity = new LocalStudentSubject();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.insert(entity);
    }

    @Override
    public void updateByDTO(LocalStudentSubjectUpdateDTO dto) {
        LocalStudentSubject entity = new LocalStudentSubject();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.updateById(entity);
    }

    @Override
    public void deleteById(Long id) {
        baseMapper.deleteById(id);
    }
}
