package com.ss.score.module.score.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ss.score.module.score.domain.entity.Grade;
import com.ss.score.module.score.domain.vo.GradeVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 存储学生的成绩信息 Mapper 接口
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface GradeMapper extends BaseMapper<Grade> {

    /**
     * voList
     *
     * @return voList
     */
    List<GradeVO> selectListVO();

    /**
     * selectVOById
     *
     * @param id id
     * @return vo
     */
    GradeVO selectByIdVO(@Param("id") Long id);

}