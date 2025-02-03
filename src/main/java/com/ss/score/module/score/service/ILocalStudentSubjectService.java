package com.ss.score.module.score.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ss.score.module.score.domain.dto.LocalStudentSubjectCreateDTO;
import com.ss.score.module.score.domain.dto.LocalStudentSubjectUpdateDTO;
import com.ss.score.module.score.domain.entity.LocalStudentSubject;
import com.ss.score.module.score.domain.vo.LocalStudentSubjectVO;

import java.util.List;

/**
 * 记录本校学生的学科选择信息 服务类
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface ILocalStudentSubjectService extends IService<LocalStudentSubject> {

    /**
     * 列表
     * @return list
     */
    List<LocalStudentSubjectVO> listVO();

    /**
     * getByIdVO
     *
     * @param id id
     * @return vo
     */
    LocalStudentSubjectVO getByIdVO(Long id);

    /**
     * 新增
     * @param dto LocalStudentSubjectCreateDTO
     */
    void saveByDTO(LocalStudentSubjectCreateDTO dto);

    /**
     * 更新
     * @param dto LocalStudentSubjectUpdateDTO
     */
    void updateByDTO(LocalStudentSubjectUpdateDTO dto);

    /**
     * 删除
     * @param id id
     */
    void deleteById(Long id);
}