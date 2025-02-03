package com.ss.score.module.score.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ss.score.module.score.domain.dto.AcademicYearCreateDTO;
import com.ss.score.module.score.domain.dto.AcademicYearUpdateDTO;
import com.ss.score.module.score.domain.entity.AcademicYear;
import com.ss.score.module.score.domain.vo.AcademicYearVO;

import java.util.List;

/**
 * 记录学年的信息 服务类
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface IAcademicYearService extends IService<AcademicYear> {

    /**
     * 列表
     * @return list
     */
    List<AcademicYearVO> listVO();

    /**
     * getByIdVO
     *
     * @param id id
     * @return vo
     */
    AcademicYearVO getByIdVO(Long id);

    /**
     * 新增
     * @param dto AcademicYearCreateDTO
     */
    void saveByDTO(AcademicYearCreateDTO dto);

    /**
     * 更新
     * @param dto AcademicYearUpdateDTO
     */
    void updateByDTO(AcademicYearUpdateDTO dto);

    /**
     * 删除
     * @param id id
     */
    void deleteById(Long id);
}