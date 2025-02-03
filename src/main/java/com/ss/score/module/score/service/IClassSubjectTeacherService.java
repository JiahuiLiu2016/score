package com.ss.score.module.score.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ss.score.module.score.domain.dto.ClassSubjectTeacherCreateDTO;
import com.ss.score.module.score.domain.dto.ClassSubjectTeacherUpdateDTO;
import com.ss.score.module.score.domain.entity.ClassSubjectTeacher;
import com.ss.score.module.score.domain.vo.ClassSubjectTeacherVO;

import java.util.List;

/**
 * 记录班级、学科和教师的关联信息 服务类
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface IClassSubjectTeacherService extends IService<ClassSubjectTeacher> {

    /**
     * 列表
     * @return list
     */
    List<ClassSubjectTeacherVO> listVO();

    /**
     * getByIdVO
     *
     * @param id id
     * @return vo
     */
    ClassSubjectTeacherVO getByIdVO(Long id);

    /**
     * 新增
     * @param dto ClassSubjectTeacherCreateDTO
     */
    void saveByDTO(ClassSubjectTeacherCreateDTO dto);

    /**
     * 更新
     * @param dto ClassSubjectTeacherUpdateDTO
     */
    void updateByDTO(ClassSubjectTeacherUpdateDTO dto);

    /**
     * 删除
     * @param id id
     */
    void deleteById(Long id);
}