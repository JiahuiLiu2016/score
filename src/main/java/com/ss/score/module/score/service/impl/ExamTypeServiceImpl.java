package com.ss.score.module.score.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ss.score.module.score.domain.dto.ExamTypeCreateDTO;
import com.ss.score.module.score.domain.dto.ExamTypeUpdateDTO;
import com.ss.score.module.score.domain.entity.ExamType;
import com.ss.score.module.score.domain.vo.ExamTypeVO;
import com.ss.score.module.score.mapper.ExamTypeMapper;
import com.ss.score.module.score.service.IExamTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 存储考试类型的信息 服务实现类
 *
 * @author ljh
 * @since 2025-02-03
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ExamTypeServiceImpl extends ServiceImpl<ExamTypeMapper, ExamType> implements IExamTypeService {

    @Override
    public List<ExamTypeVO> listVO() {
        return baseMapper.selectListVO();
    }

    @Override
    public ExamTypeVO getByIdVO(Long id) {
        return baseMapper.selectByIdVO(id);
    }

    @Override
    public void saveByDTO(ExamTypeCreateDTO dto) {
        ExamType entity = new ExamType();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.insert(entity);
    }

    @Override
    public void updateByDTO(ExamTypeUpdateDTO dto) {
        ExamType entity = new ExamType();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.updateById(entity);
    }

    @Override
    public void deleteById(Long id) {
        baseMapper.deleteById(id);
    }
}
