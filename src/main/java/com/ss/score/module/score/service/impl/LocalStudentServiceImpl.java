package com.ss.score.module.score.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ss.score.module.score.domain.dto.LocalStudentCreateDTO;
import com.ss.score.module.score.domain.dto.LocalStudentUpdateDTO;
import com.ss.score.module.score.domain.entity.LocalStudent;
import com.ss.score.module.score.domain.vo.LocalStudentVO;
import com.ss.score.module.score.mapper.LocalStudentMapper;
import com.ss.score.module.score.service.ILocalStudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 存储本校学生的基本信息 服务实现类
 *
 * @author ljh
 * @since 2025-02-03
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class LocalStudentServiceImpl extends ServiceImpl<LocalStudentMapper, LocalStudent> implements ILocalStudentService {

    @Override
    public List<LocalStudentVO> listVO() {
        return baseMapper.selectListVO();
    }

    @Override
    public LocalStudentVO getByIdVO(Long id) {
        return baseMapper.selectByIdVO(id);
    }

    @Override
    public void saveByDTO(LocalStudentCreateDTO dto) {
        LocalStudent entity = new LocalStudent();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.insert(entity);
    }

    @Override
    public void updateByDTO(LocalStudentUpdateDTO dto) {
        LocalStudent entity = new LocalStudent();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.updateById(entity);
    }

    @Override
    public void deleteById(Long id) {
        baseMapper.deleteById(id);
    }
}
