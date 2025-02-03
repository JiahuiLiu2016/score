package com.ss.score.module.score.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ss.score.module.score.domain.dto.AcademicYearCreateDTO;
import com.ss.score.module.score.domain.dto.AcademicYearUpdateDTO;
import com.ss.score.module.score.domain.entity.AcademicYear;
import com.ss.score.module.score.domain.vo.AcademicYearVO;
import com.ss.score.module.score.mapper.AcademicYearMapper;
import com.ss.score.module.score.service.IAcademicYearService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 记录学年的信息 服务实现类
 *
 * @author ljh
 * @since 2025-02-03
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AcademicYearServiceImpl extends ServiceImpl<AcademicYearMapper, AcademicYear> implements IAcademicYearService {

    @Override
    public List<AcademicYearVO> listVO() {
        return baseMapper.selectListVO();
    }

    @Override
    public AcademicYearVO getByIdVO(Long id) {
        return baseMapper.selectByIdVO(id);
    }

    @Override
    public void saveByDTO(AcademicYearCreateDTO dto) {
        AcademicYear entity = new AcademicYear();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.insert(entity);
    }

    @Override
    public void updateByDTO(AcademicYearUpdateDTO dto) {
        AcademicYear entity = new AcademicYear();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.updateById(entity);
    }

    @Override
    public void deleteById(Long id) {
        baseMapper.deleteById(id);
    }
}
