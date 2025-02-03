package com.ss.score.module.score.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ss.score.module.score.domain.dto.ClassCreateDTO;
import com.ss.score.module.score.domain.dto.ClassUpdateDTO;
import com.ss.score.module.score.domain.entity.Class;
import com.ss.score.module.score.domain.vo.ClassVO;
import com.ss.score.module.score.mapper.ClassMapper;
import com.ss.score.module.score.service.IClassService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 存储班级的信息 服务实现类
 *
 * @author ljh
 * @since 2025-02-03
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ClassServiceImpl extends ServiceImpl<ClassMapper, Class> implements IClassService {

    @Override
    public List<ClassVO> listVO() {
        return baseMapper.selectListVO();
    }

    @Override
    public ClassVO getByIdVO(Long id) {
        return baseMapper.selectByIdVO(id);
    }

    @Override
    public void saveByDTO(ClassCreateDTO dto) {
        Class entity = new Class();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.insert(entity);
    }

    @Override
    public void updateByDTO(ClassUpdateDTO dto) {
        Class entity = new Class();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.updateById(entity);
    }

    @Override
    public void deleteById(Long id) {
        baseMapper.deleteById(id);
    }
}
