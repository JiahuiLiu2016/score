package com.ss.score.module.score.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ss.score.module.score.domain.entity.ExamType;
import com.ss.score.module.score.domain.vo.ExamTypeVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 存储考试类型的信息 Mapper 接口
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface ExamTypeMapper extends BaseMapper<ExamType> {

    /**
     * voList
     *
     * @return voList
     */
    List<ExamTypeVO> selectListVO();

    /**
     * selectVOById
     *
     * @param id id
     * @return vo
     */
    ExamTypeVO selectByIdVO(@Param("id") Long id);

}