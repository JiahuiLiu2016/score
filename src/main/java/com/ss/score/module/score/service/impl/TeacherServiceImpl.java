package com.ss.score.module.score.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ss.score.module.score.domain.dto.TeacherCreateDTO;
import com.ss.score.module.score.domain.dto.TeacherUpdateDTO;
import com.ss.score.module.score.domain.entity.Teacher;
import com.ss.score.module.score.domain.vo.TeacherVO;
import com.ss.score.module.score.mapper.TeacherMapper;
import com.ss.score.module.score.service.ITeacherService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 存储教师的基本信息 服务实现类
 *
 * @author ljh
 * @since 2025-02-03
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements ITeacherService {

    @Override
    public List<TeacherVO> listVO() {
        return baseMapper.selectListVO();
    }

    @Override
    public TeacherVO getByIdVO(Long id) {
        return baseMapper.selectByIdVO(id);
    }

    @Override
    public void saveByDTO(TeacherCreateDTO dto) {
        Teacher entity = new Teacher();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.insert(entity);
    }

    @Override
    public void updateByDTO(TeacherUpdateDTO dto) {
        Teacher entity = new Teacher();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.updateById(entity);
    }

    @Override
    public void deleteById(Long id) {
        baseMapper.deleteById(id);
    }
}
