package com.ss.score.module.score.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ss.score.module.score.domain.dto.SchoolCreateDTO;
import com.ss.score.module.score.domain.dto.SchoolUpdateDTO;
import com.ss.score.module.score.domain.entity.School;
import com.ss.score.module.score.domain.vo.SchoolVO;

import java.util.List;

/**
 * 存储学校的基本信息 服务类
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface ISchoolService extends IService<School> {

    /**
     * 列表
     * @return list
     */
    List<SchoolVO> listVO();

    /**
     * getByIdVO
     *
     * @param id id
     * @return vo
     */
    SchoolVO getByIdVO(Long id);

    /**
     * 新增
     * @param dto SchoolCreateDTO
     */
    void saveByDTO(SchoolCreateDTO dto);

    /**
     * 更新
     * @param dto SchoolUpdateDTO
     */
    void updateByDTO(SchoolUpdateDTO dto);

    /**
     * 删除
     * @param id id
     */
    void deleteById(Long id);
}