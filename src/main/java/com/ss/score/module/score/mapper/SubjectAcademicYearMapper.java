package com.ss.score.module.score.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ss.score.module.score.domain.entity.SubjectAcademicYear;
import com.ss.score.module.score.domain.vo.SubjectAcademicYearVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 记录学科在哪些学年有效 Mapper 接口
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface SubjectAcademicYearMapper extends BaseMapper<SubjectAcademicYear> {

    /**
     * voList
     *
     * @return voList
     */
    List<SubjectAcademicYearVO> selectListVO();

    /**
     * selectVOById
     *
     * @param id id
     * @return vo
     */
    SubjectAcademicYearVO selectByIdVO(@Param("id") Long id);

}