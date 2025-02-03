package com.ss.score.module.score.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ss.score.module.score.domain.entity.JointExamLocalStudentSubjectRank;
import com.ss.score.module.score.domain.vo.JointExamLocalStudentSubjectRankVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 记录联考时本校学生各科的排名信息 Mapper 接口
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface JointExamLocalStudentSubjectRankMapper extends BaseMapper<JointExamLocalStudentSubjectRank> {

    /**
     * voList
     *
     * @return voList
     */
    List<JointExamLocalStudentSubjectRankVO> selectListVO();

    /**
     * selectVOById
     *
     * @param id id
     * @return vo
     */
    JointExamLocalStudentSubjectRankVO selectByIdVO(@Param("id") Long id);

}