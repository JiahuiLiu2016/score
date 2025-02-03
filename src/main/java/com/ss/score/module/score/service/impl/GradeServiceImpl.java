package com.ss.score.module.score.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ss.score.module.score.domain.dto.GradeCreateDTO;
import com.ss.score.module.score.domain.dto.GradeUpdateDTO;
import com.ss.score.module.score.domain.entity.Grade;
import com.ss.score.module.score.domain.vo.GradeVO;
import com.ss.score.module.score.mapper.GradeMapper;
import com.ss.score.module.score.service.IGradeService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 存储学生的成绩信息 服务实现类
 *
 * @author ljh
 * @since 2025-02-03
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class GradeServiceImpl extends ServiceImpl<GradeMapper, Grade> implements IGradeService {

    @Override
    public List<GradeVO> listVO() {
        return baseMapper.selectListVO();
    }

    @Override
    public GradeVO getByIdVO(Long id) {
        return baseMapper.selectByIdVO(id);
    }

    @Override
    public void saveByDTO(GradeCreateDTO dto) {
        Grade entity = new Grade();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.insert(entity);
    }

    @Override
    public void updateByDTO(GradeUpdateDTO dto) {
        Grade entity = new Grade();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.updateById(entity);
    }

    @Override
    public void deleteById(Long id) {
        baseMapper.deleteById(id);
    }
}
