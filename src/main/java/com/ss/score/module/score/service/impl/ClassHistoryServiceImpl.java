package com.ss.score.module.score.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ss.score.module.score.domain.dto.ClassHistoryCreateDTO;
import com.ss.score.module.score.domain.dto.ClassHistoryUpdateDTO;
import com.ss.score.module.score.domain.entity.ClassHistory;
import com.ss.score.module.score.domain.vo.ClassHistoryVO;
import com.ss.score.module.score.mapper.ClassHistoryMapper;
import com.ss.score.module.score.service.IClassHistoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 记录本校学生的分班信息 服务实现类
 *
 * @author ljh
 * @since 2025-02-03
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ClassHistoryServiceImpl extends ServiceImpl<ClassHistoryMapper, ClassHistory> implements IClassHistoryService {

    @Override
    public List<ClassHistoryVO> listVO() {
        return baseMapper.selectListVO();
    }

    @Override
    public ClassHistoryVO getByIdVO(Long id) {
        return baseMapper.selectByIdVO(id);
    }

    @Override
    public void saveByDTO(ClassHistoryCreateDTO dto) {
        ClassHistory entity = new ClassHistory();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.insert(entity);
    }

    @Override
    public void updateByDTO(ClassHistoryUpdateDTO dto) {
        ClassHistory entity = new ClassHistory();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.updateById(entity);
    }

    @Override
    public void deleteById(Long id) {
        baseMapper.deleteById(id);
    }
}
