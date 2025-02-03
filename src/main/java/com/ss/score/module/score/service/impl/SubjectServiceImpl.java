package com.ss.score.module.score.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ss.score.module.score.domain.dto.SubjectCreateDTO;
import com.ss.score.module.score.domain.dto.SubjectUpdateDTO;
import com.ss.score.module.score.domain.entity.Subject;
import com.ss.score.module.score.domain.vo.SubjectVO;
import com.ss.score.module.score.mapper.SubjectMapper;
import com.ss.score.module.score.service.ISubjectService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 存储学科的信息 服务实现类
 *
 * @author ljh
 * @since 2025-02-03
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SubjectServiceImpl extends ServiceImpl<SubjectMapper, Subject> implements ISubjectService {

    @Override
    public List<SubjectVO> listVO() {
        return baseMapper.selectListVO();
    }

    @Override
    public SubjectVO getByIdVO(Long id) {
        return baseMapper.selectByIdVO(id);
    }

    @Override
    public void saveByDTO(SubjectCreateDTO dto) {
        Subject entity = new Subject();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.insert(entity);
    }

    @Override
    public void updateByDTO(SubjectUpdateDTO dto) {
        Subject entity = new Subject();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.updateById(entity);
    }

    @Override
    public void deleteById(Long id) {
        baseMapper.deleteById(id);
    }
}
