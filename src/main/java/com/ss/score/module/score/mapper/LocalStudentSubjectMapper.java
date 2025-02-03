package com.ss.score.module.score.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ss.score.module.score.domain.entity.LocalStudentSubject;
import com.ss.score.module.score.domain.vo.LocalStudentSubjectVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 记录本校学生的学科选择信息 Mapper 接口
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface LocalStudentSubjectMapper extends BaseMapper<LocalStudentSubject> {

    /**
     * voList
     *
     * @return voList
     */
    List<LocalStudentSubjectVO> selectListVO();

    /**
     * selectVOById
     *
     * @param id id
     * @return vo
     */
    LocalStudentSubjectVO selectByIdVO(@Param("id") Long id);

}