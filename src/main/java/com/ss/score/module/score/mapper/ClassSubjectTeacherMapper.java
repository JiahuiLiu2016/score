package com.ss.score.module.score.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ss.score.module.score.domain.entity.ClassSubjectTeacher;
import com.ss.score.module.score.domain.vo.ClassSubjectTeacherVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 记录班级、学科和教师的关联信息 Mapper 接口
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface ClassSubjectTeacherMapper extends BaseMapper<ClassSubjectTeacher> {

    /**
     * voList
     *
     * @return voList
     */
    List<ClassSubjectTeacherVO> selectListVO();

    /**
     * selectVOById
     *
     * @param id id
     * @return vo
     */
    ClassSubjectTeacherVO selectByIdVO(@Param("id") Long id);

}