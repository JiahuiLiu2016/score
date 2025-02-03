package com.ss.score.module.score.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ss.score.module.score.domain.entity.ExternalStudentSubject;
import com.ss.score.module.score.domain.vo.ExternalStudentSubjectVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 记录外校学生的学科选择信息 Mapper 接口
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface ExternalStudentSubjectMapper extends BaseMapper<ExternalStudentSubject> {

    /**
     * voList
     *
     * @return voList
     */
    List<ExternalStudentSubjectVO> selectListVO();

    /**
     * selectVOById
     *
     * @param id id
     * @return vo
     */
    ExternalStudentSubjectVO selectByIdVO(@Param("id") Long id);

}