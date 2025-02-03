package com.ss.score.module.score.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ss.score.module.score.domain.dto.ExternalStudentSubjectCreateDTO;
import com.ss.score.module.score.domain.dto.ExternalStudentSubjectUpdateDTO;
import com.ss.score.module.score.domain.entity.ExternalStudentSubject;
import com.ss.score.module.score.domain.vo.ExternalStudentSubjectVO;

import java.util.List;

/**
 * 记录外校学生的学科选择信息 服务类
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface IExternalStudentSubjectService extends IService<ExternalStudentSubject> {

    /**
     * 列表
     * @return list
     */
    List<ExternalStudentSubjectVO> listVO();

    /**
     * getByIdVO
     *
     * @param id id
     * @return vo
     */
    ExternalStudentSubjectVO getByIdVO(Long id);

    /**
     * 新增
     * @param dto ExternalStudentSubjectCreateDTO
     */
    void saveByDTO(ExternalStudentSubjectCreateDTO dto);

    /**
     * 更新
     * @param dto ExternalStudentSubjectUpdateDTO
     */
    void updateByDTO(ExternalStudentSubjectUpdateDTO dto);

    /**
     * 删除
     * @param id id
     */
    void deleteById(Long id);
}