package com.ss.score.module.score.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ss.score.module.score.domain.entity.JointExam;
import com.ss.score.module.score.domain.vo.JointExamVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 记录联考的信息 Mapper 接口
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface JointExamMapper extends BaseMapper<JointExam> {

    /**
     * voList
     *
     * @return voList
     */
    List<JointExamVO> selectListVO();

    /**
     * selectVOById
     *
     * @param id id
     * @return vo
     */
    JointExamVO selectByIdVO(@Param("id") Long id);

}