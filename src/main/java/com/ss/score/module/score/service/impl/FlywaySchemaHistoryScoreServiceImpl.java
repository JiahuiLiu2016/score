package com.ss.score.module.score.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ss.score.module.score.domain.dto.FlywaySchemaHistoryScoreCreateDTO;
import com.ss.score.module.score.domain.dto.FlywaySchemaHistoryScoreUpdateDTO;
import com.ss.score.module.score.domain.entity.FlywaySchemaHistoryScore;
import com.ss.score.module.score.domain.vo.FlywaySchemaHistoryScoreVO;
import com.ss.score.module.score.mapper.FlywaySchemaHistoryScoreMapper;
import com.ss.score.module.score.service.IFlywaySchemaHistoryScoreService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *  服务实现类
 *
 * @author ljh
 * @since 2025-02-03
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class FlywaySchemaHistoryScoreServiceImpl extends ServiceImpl<FlywaySchemaHistoryScoreMapper, FlywaySchemaHistoryScore> implements IFlywaySchemaHistoryScoreService {

    @Override
    public List<FlywaySchemaHistoryScoreVO> listVO() {
        return baseMapper.selectListVO();
    }

    @Override
    public FlywaySchemaHistoryScoreVO getByIdVO(Long id) {
        return baseMapper.selectByIdVO(id);
    }

    @Override
    public void saveByDTO(FlywaySchemaHistoryScoreCreateDTO dto) {
        FlywaySchemaHistoryScore entity = new FlywaySchemaHistoryScore();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.insert(entity);
    }

    @Override
    public void updateByDTO(FlywaySchemaHistoryScoreUpdateDTO dto) {
        FlywaySchemaHistoryScore entity = new FlywaySchemaHistoryScore();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.updateById(entity);
    }

    @Override
    public void deleteById(Long id) {
        baseMapper.deleteById(id);
    }
}
