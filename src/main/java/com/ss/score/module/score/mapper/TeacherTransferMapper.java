package com.ss.score.module.score.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ss.score.module.score.domain.entity.TeacherTransfer;
import com.ss.score.module.score.domain.vo.TeacherTransferVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 记录教师在一个学年内的调动信息 Mapper 接口
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface TeacherTransferMapper extends BaseMapper<TeacherTransfer> {

    /**
     * voList
     *
     * @return voList
     */
    List<TeacherTransferVO> selectListVO();

    /**
     * selectVOById
     *
     * @param id id
     * @return vo
     */
    TeacherTransferVO selectByIdVO(@Param("id") Long id);

}