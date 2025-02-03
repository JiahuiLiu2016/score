package com.ss.score.module.score.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ss.score.module.score.domain.entity.School;
import com.ss.score.module.score.domain.vo.SchoolVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 存储学校的基本信息 Mapper 接口
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface SchoolMapper extends BaseMapper<School> {

    /**
     * voList
     *
     * @return voList
     */
    List<SchoolVO> selectListVO();

    /**
     * selectVOById
     *
     * @param id id
     * @return vo
     */
    SchoolVO selectByIdVO(@Param("id") Long id);

}