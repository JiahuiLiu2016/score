package com.ss.score.module.score.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ss.score.module.score.domain.entity.JointExamSchool;
import com.ss.score.module.score.domain.vo.JointExamSchoolVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 记录参与联考的学校信息 Mapper 接口
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface JointExamSchoolMapper extends BaseMapper<JointExamSchool> {

    /**
     * voList
     *
     * @return voList
     */
    List<JointExamSchoolVO> selectListVO();

    /**
     * selectVOById
     *
     * @param id id
     * @return vo
     */
    JointExamSchoolVO selectByIdVO(@Param("id") Long id);

}