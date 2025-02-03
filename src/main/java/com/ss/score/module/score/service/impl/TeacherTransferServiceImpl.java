package com.ss.score.module.score.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ss.score.module.score.domain.dto.TeacherTransferCreateDTO;
import com.ss.score.module.score.domain.dto.TeacherTransferUpdateDTO;
import com.ss.score.module.score.domain.entity.TeacherTransfer;
import com.ss.score.module.score.domain.vo.TeacherTransferVO;
import com.ss.score.module.score.mapper.TeacherTransferMapper;
import com.ss.score.module.score.service.ITeacherTransferService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 记录教师在一个学年内的调动信息 服务实现类
 *
 * @author ljh
 * @since 2025-02-03
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TeacherTransferServiceImpl extends ServiceImpl<TeacherTransferMapper, TeacherTransfer> implements ITeacherTransferService {

    @Override
    public List<TeacherTransferVO> listVO() {
        return baseMapper.selectListVO();
    }

    @Override
    public TeacherTransferVO getByIdVO(Long id) {
        return baseMapper.selectByIdVO(id);
    }

    @Override
    public void saveByDTO(TeacherTransferCreateDTO dto) {
        TeacherTransfer entity = new TeacherTransfer();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.insert(entity);
    }

    @Override
    public void updateByDTO(TeacherTransferUpdateDTO dto) {
        TeacherTransfer entity = new TeacherTransfer();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.updateById(entity);
    }

    @Override
    public void deleteById(Long id) {
        baseMapper.deleteById(id);
    }
}
