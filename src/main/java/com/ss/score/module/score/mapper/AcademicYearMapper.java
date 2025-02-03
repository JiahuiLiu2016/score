package com.ss.score.module.score.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ss.score.module.score.domain.entity.AcademicYear;
import com.ss.score.module.score.domain.vo.AcademicYearVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 记录学年的信息 Mapper 接口
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface AcademicYearMapper extends BaseMapper<AcademicYear> {

    /**
     * voList
     *
     * @return voList
     */
    List<AcademicYearVO> selectListVO();

    /**
     * selectVOById
     *
     * @param id id
     * @return vo
     */
    AcademicYearVO selectByIdVO(@Param("id") Long id);

}