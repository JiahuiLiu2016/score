package com.ss.score.module.score.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ss.score.module.score.domain.entity.FlywaySchemaHistoryScore;
import com.ss.score.module.score.domain.vo.FlywaySchemaHistoryScoreVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *  Mapper 接口
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface FlywaySchemaHistoryScoreMapper extends BaseMapper<FlywaySchemaHistoryScore> {

    /**
     * voList
     *
     * @return voList
     */
    List<FlywaySchemaHistoryScoreVO> selectListVO();

    /**
     * selectVOById
     *
     * @param id id
     * @return vo
     */
    FlywaySchemaHistoryScoreVO selectByIdVO(@Param("id") Long id);

}