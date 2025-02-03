package com.ss.score.module.score.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ss.score.module.score.domain.dto.SubjectAcademicYearCreateDTO;
import com.ss.score.module.score.domain.dto.SubjectAcademicYearUpdateDTO;
import com.ss.score.module.score.domain.entity.SubjectAcademicYear;
import com.ss.score.module.score.domain.vo.SubjectAcademicYearVO;

import java.util.List;

/**
 * 记录学科在哪些学年有效 服务类
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface ISubjectAcademicYearService extends IService<SubjectAcademicYear> {

    /**
     * 列表
     * @return list
     */
    List<SubjectAcademicYearVO> listVO();

    /**
     * getByIdVO
     *
     * @param id id
     * @return vo
     */
    SubjectAcademicYearVO getByIdVO(Long id);

    /**
     * 新增
     * @param dto SubjectAcademicYearCreateDTO
     */
    void saveByDTO(SubjectAcademicYearCreateDTO dto);

    /**
     * 更新
     * @param dto SubjectAcademicYearUpdateDTO
     */
    void updateByDTO(SubjectAcademicYearUpdateDTO dto);

    /**
     * 删除
     * @param id id
     */
    void deleteById(Long id);
}