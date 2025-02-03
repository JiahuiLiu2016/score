package com.ss.score.module.score.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ss.score.module.score.domain.dto.ClassLevelCreateDTO;
import com.ss.score.module.score.domain.dto.ClassLevelUpdateDTO;
import com.ss.score.module.score.domain.entity.ClassLevel;
import com.ss.score.module.score.domain.vo.ClassLevelVO;
import com.ss.score.module.score.mapper.ClassLevelMapper;
import com.ss.score.module.score.service.IClassLevelService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 定义班级的层次信息 服务实现类
 *
 * @author ljh
 * @since 2025-02-03
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ClassLevelServiceImpl extends ServiceImpl<ClassLevelMapper, ClassLevel> implements IClassLevelService {

    @Override
    public List<ClassLevelVO> listVO() {
        return baseMapper.selectListVO();
    }

    @Override
    public ClassLevelVO getByIdVO(Long id) {
        return baseMapper.selectByIdVO(id);
    }

    @Override
    public void saveByDTO(ClassLevelCreateDTO dto) {
        ClassLevel entity = new ClassLevel();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.insert(entity);
    }

    @Override
    public void updateByDTO(ClassLevelUpdateDTO dto) {
        ClassLevel entity = new ClassLevel();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.updateById(entity);
    }

    @Override
    public void deleteById(Long id) {
        baseMapper.deleteById(id);
    }
}
