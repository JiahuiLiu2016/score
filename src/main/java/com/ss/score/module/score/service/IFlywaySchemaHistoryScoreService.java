package com.ss.score.module.score.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ss.score.module.score.domain.dto.FlywaySchemaHistoryScoreCreateDTO;
import com.ss.score.module.score.domain.dto.FlywaySchemaHistoryScoreUpdateDTO;
import com.ss.score.module.score.domain.entity.FlywaySchemaHistoryScore;
import com.ss.score.module.score.domain.vo.FlywaySchemaHistoryScoreVO;

import java.util.List;

/**
 *  服务类
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface IFlywaySchemaHistoryScoreService extends IService<FlywaySchemaHistoryScore> {

    /**
     * 列表
     * @return list
     */
    List<FlywaySchemaHistoryScoreVO> listVO();

    /**
     * getByIdVO
     *
     * @param id id
     * @return vo
     */
    FlywaySchemaHistoryScoreVO getByIdVO(Long id);

    /**
     * 新增
     * @param dto FlywaySchemaHistoryScoreCreateDTO
     */
    void saveByDTO(FlywaySchemaHistoryScoreCreateDTO dto);

    /**
     * 更新
     * @param dto FlywaySchemaHistoryScoreUpdateDTO
     */
    void updateByDTO(FlywaySchemaHistoryScoreUpdateDTO dto);

    /**
     * 删除
     * @param id id
     */
    void deleteById(Long id);
}