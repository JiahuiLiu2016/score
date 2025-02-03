package com.ss.score.module.score.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ss.score.module.score.domain.entity.Subject;
import com.ss.score.module.score.domain.vo.SubjectVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 存储学科的信息 Mapper 接口
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface SubjectMapper extends BaseMapper<Subject> {

    /**
     * voList
     *
     * @return voList
     */
    List<SubjectVO> selectListVO();

    /**
     * selectVOById
     *
     * @param id id
     * @return vo
     */
    SubjectVO selectByIdVO(@Param("id") Long id);

}