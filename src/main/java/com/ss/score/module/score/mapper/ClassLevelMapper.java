package com.ss.score.module.score.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ss.score.module.score.domain.entity.ClassLevel;
import com.ss.score.module.score.domain.vo.ClassLevelVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 定义班级的层次信息 Mapper 接口
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface ClassLevelMapper extends BaseMapper<ClassLevel> {

    /**
     * voList
     *
     * @return voList
     */
    List<ClassLevelVO> selectListVO();

    /**
     * selectVOById
     *
     * @param id id
     * @return vo
     */
    ClassLevelVO selectByIdVO(@Param("id") Long id);

}