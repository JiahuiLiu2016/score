package com.ss.score.module.score.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ss.score.module.score.domain.entity.Teacher;
import com.ss.score.module.score.domain.vo.TeacherVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 存储教师的基本信息 Mapper 接口
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface TeacherMapper extends BaseMapper<Teacher> {

    /**
     * voList
     *
     * @return voList
     */
    List<TeacherVO> selectListVO();

    /**
     * selectVOById
     *
     * @param id id
     * @return vo
     */
    TeacherVO selectByIdVO(@Param("id") Long id);

}