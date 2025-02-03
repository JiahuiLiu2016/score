package com.ss.score.module.score.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ss.score.module.score.domain.dto.SchoolCreateDTO;
import com.ss.score.module.score.domain.dto.SchoolUpdateDTO;
import com.ss.score.module.score.domain.entity.School;
import com.ss.score.module.score.domain.vo.SchoolVO;
import com.ss.score.module.score.mapper.SchoolMapper;
import com.ss.score.module.score.service.ISchoolService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 存储学校的基本信息 服务实现类
 *
 * @author ljh
 * @since 2025-02-03
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SchoolServiceImpl extends ServiceImpl<SchoolMapper, School> implements ISchoolService {

    @Override
    public List<SchoolVO> listVO() {
        return baseMapper.selectListVO();
    }

    @Override
    public SchoolVO getByIdVO(Long id) {
        return baseMapper.selectByIdVO(id);
    }

    @Override
    public void saveByDTO(SchoolCreateDTO dto) {
        School entity = new School();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.insert(entity);
    }

    @Override
    public void updateByDTO(SchoolUpdateDTO dto) {
        School entity = new School();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.updateById(entity);
    }

    @Override
    public void deleteById(Long id) {
        baseMapper.deleteById(id);
    }
}
