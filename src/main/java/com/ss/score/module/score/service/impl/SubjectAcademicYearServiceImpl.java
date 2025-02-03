package com.ss.score.module.score.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ss.score.module.score.domain.dto.SubjectAcademicYearCreateDTO;
import com.ss.score.module.score.domain.dto.SubjectAcademicYearUpdateDTO;
import com.ss.score.module.score.domain.entity.SubjectAcademicYear;
import com.ss.score.module.score.domain.vo.SubjectAcademicYearVO;
import com.ss.score.module.score.mapper.SubjectAcademicYearMapper;
import com.ss.score.module.score.service.ISubjectAcademicYearService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 记录学科在哪些学年有效 服务实现类
 *
 * @author ljh
 * @since 2025-02-03
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SubjectAcademicYearServiceImpl extends ServiceImpl<SubjectAcademicYearMapper, SubjectAcademicYear> implements ISubjectAcademicYearService {

    @Override
    public List<SubjectAcademicYearVO> listVO() {
        return baseMapper.selectListVO();
    }

    @Override
    public SubjectAcademicYearVO getByIdVO(Long id) {
        return baseMapper.selectByIdVO(id);
    }

    @Override
    public void saveByDTO(SubjectAcademicYearCreateDTO dto) {
        SubjectAcademicYear entity = new SubjectAcademicYear();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.insert(entity);
    }

    @Override
    public void updateByDTO(SubjectAcademicYearUpdateDTO dto) {
        SubjectAcademicYear entity = new SubjectAcademicYear();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.updateById(entity);
    }

    @Override
    public void deleteById(Long id) {
        baseMapper.deleteById(id);
    }
}
