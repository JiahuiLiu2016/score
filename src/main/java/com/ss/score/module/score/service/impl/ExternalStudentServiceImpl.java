package com.ss.score.module.score.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ss.score.module.score.domain.dto.ExternalStudentCreateDTO;
import com.ss.score.module.score.domain.dto.ExternalStudentUpdateDTO;
import com.ss.score.module.score.domain.entity.ExternalStudent;
import com.ss.score.module.score.domain.vo.ExternalStudentVO;
import com.ss.score.module.score.mapper.ExternalStudentMapper;
import com.ss.score.module.score.service.IExternalStudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 存储外校学生的基本信息 服务实现类
 *
 * @author ljh
 * @since 2025-02-03
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ExternalStudentServiceImpl extends ServiceImpl<ExternalStudentMapper, ExternalStudent> implements IExternalStudentService {

    @Override
    public List<ExternalStudentVO> listVO() {
        return baseMapper.selectListVO();
    }

    @Override
    public ExternalStudentVO getByIdVO(Long id) {
        return baseMapper.selectByIdVO(id);
    }

    @Override
    public void saveByDTO(ExternalStudentCreateDTO dto) {
        ExternalStudent entity = new ExternalStudent();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.insert(entity);
    }

    @Override
    public void updateByDTO(ExternalStudentUpdateDTO dto) {
        ExternalStudent entity = new ExternalStudent();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.updateById(entity);
    }

    @Override
    public void deleteById(Long id) {
        baseMapper.deleteById(id);
    }
}
