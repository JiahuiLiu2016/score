package com.ss.score.module.score.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ss.score.module.score.domain.entity.ExternalStudent;
import com.ss.score.module.score.domain.vo.ExternalStudentVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 存储外校学生的基本信息 Mapper 接口
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface ExternalStudentMapper extends BaseMapper<ExternalStudent> {

    /**
     * voList
     *
     * @return voList
     */
    List<ExternalStudentVO> selectListVO();

    /**
     * selectVOById
     *
     * @param id id
     * @return vo
     */
    ExternalStudentVO selectByIdVO(@Param("id") Long id);

}