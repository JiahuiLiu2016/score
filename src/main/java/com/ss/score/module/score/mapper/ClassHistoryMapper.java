package com.ss.score.module.score.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ss.score.module.score.domain.entity.ClassHistory;
import com.ss.score.module.score.domain.vo.ClassHistoryVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 记录本校学生的分班信息 Mapper 接口
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface ClassHistoryMapper extends BaseMapper<ClassHistory> {

    /**
     * voList
     *
     * @return voList
     */
    List<ClassHistoryVO> selectListVO();

    /**
     * selectVOById
     *
     * @param id id
     * @return vo
     */
    ClassHistoryVO selectByIdVO(@Param("id") Long id);

}