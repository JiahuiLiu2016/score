package com.ss.score.module.score.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ss.score.module.score.domain.entity.GroupCompany;
import com.ss.score.module.score.domain.vo.GroupCompanyVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 存储学校所属集团的信息 Mapper 接口
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface GroupCompanyMapper extends BaseMapper<GroupCompany> {

    /**
     * voList
     *
     * @return voList
     */
    List<GroupCompanyVO> selectListVO();

    /**
     * selectVOById
     *
     * @param id id
     * @return vo
     */
    GroupCompanyVO selectByIdVO(@Param("id") Long id);

}