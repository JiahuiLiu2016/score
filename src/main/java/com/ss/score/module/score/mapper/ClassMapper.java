package com.ss.score.module.score.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ss.score.module.score.domain.entity.Class;
import com.ss.score.module.score.domain.vo.ClassVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 存储班级的信息 Mapper 接口
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface ClassMapper extends BaseMapper<Class> {

    /**
     * voList
     *
     * @return voList
     */
    List<ClassVO> selectListVO();

    /**
     * selectVOById
     *
     * @param id id
     * @return vo
     */
    ClassVO selectByIdVO(@Param("id") Long id);

}