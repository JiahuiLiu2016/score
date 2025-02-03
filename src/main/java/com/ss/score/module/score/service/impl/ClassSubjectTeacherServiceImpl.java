package com.ss.score.module.score.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ss.score.module.score.domain.dto.ClassSubjectTeacherCreateDTO;
import com.ss.score.module.score.domain.dto.ClassSubjectTeacherUpdateDTO;
import com.ss.score.module.score.domain.entity.ClassSubjectTeacher;
import com.ss.score.module.score.domain.vo.ClassSubjectTeacherVO;
import com.ss.score.module.score.mapper.ClassSubjectTeacherMapper;
import com.ss.score.module.score.service.IClassSubjectTeacherService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 记录班级、学科和教师的关联信息 服务实现类
 *
 * @author ljh
 * @since 2025-02-03
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ClassSubjectTeacherServiceImpl extends ServiceImpl<ClassSubjectTeacherMapper, ClassSubjectTeacher> implements IClassSubjectTeacherService {

    @Override
    public List<ClassSubjectTeacherVO> listVO() {
        return baseMapper.selectListVO();
    }

    @Override
    public ClassSubjectTeacherVO getByIdVO(Long id) {
        return baseMapper.selectByIdVO(id);
    }

    @Override
    public void saveByDTO(ClassSubjectTeacherCreateDTO dto) {
        ClassSubjectTeacher entity = new ClassSubjectTeacher();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.insert(entity);
    }

    @Override
    public void updateByDTO(ClassSubjectTeacherUpdateDTO dto) {
        ClassSubjectTeacher entity = new ClassSubjectTeacher();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.updateById(entity);
    }

    @Override
    public void deleteById(Long id) {
        baseMapper.deleteById(id);
    }
}
