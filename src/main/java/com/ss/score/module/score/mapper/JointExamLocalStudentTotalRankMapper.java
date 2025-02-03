package com.ss.score.module.score.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ss.score.module.score.domain.entity.JointExamLocalStudentTotalRank;
import com.ss.score.module.score.domain.vo.JointExamLocalStudentTotalRankVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 记录联考时本校学生的总分排名信息 Mapper 接口
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface JointExamLocalStudentTotalRankMapper extends BaseMapper<JointExamLocalStudentTotalRank> {

    /**
     * voList
     *
     * @return voList
     */
    List<JointExamLocalStudentTotalRankVO> selectListVO();

    /**
     * selectVOById
     *
     * @param id id
     * @return vo
     */
    JointExamLocalStudentTotalRankVO selectByIdVO(@Param("id") Long id);

}