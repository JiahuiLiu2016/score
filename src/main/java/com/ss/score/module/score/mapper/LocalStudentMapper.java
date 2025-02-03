package com.ss.score.module.score.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ss.score.module.score.domain.entity.LocalStudent;
import com.ss.score.module.score.domain.vo.LocalStudentVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 存储本校学生的基本信息 Mapper 接口
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface LocalStudentMapper extends BaseMapper<LocalStudent> {

    /**
     * voList
     *
     * @return voList
     */
    List<LocalStudentVO> selectListVO();

    /**
     * selectVOById
     *
     * @param id id
     * @return vo
     */
    LocalStudentVO selectByIdVO(@Param("id") Long id);

}