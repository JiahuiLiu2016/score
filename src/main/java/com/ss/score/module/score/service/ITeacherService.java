package com.ss.score.module.score.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ss.score.module.score.domain.dto.TeacherCreateDTO;
import com.ss.score.module.score.domain.dto.TeacherUpdateDTO;
import com.ss.score.module.score.domain.entity.Teacher;
import com.ss.score.module.score.domain.vo.TeacherVO;

import java.util.List;

/**
 * 存储教师的基本信息 服务类
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface ITeacherService extends IService<Teacher> {

    /**
     * 列表
     * @return list
     */
    List<TeacherVO> listVO();

    /**
     * getByIdVO
     *
     * @param id id
     * @return vo
     */
    TeacherVO getByIdVO(Long id);

    /**
     * 新增
     * @param dto TeacherCreateDTO
     */
    void saveByDTO(TeacherCreateDTO dto);

    /**
     * 更新
     * @param dto TeacherUpdateDTO
     */
    void updateByDTO(TeacherUpdateDTO dto);

    /**
     * 删除
     * @param id id
     */
    void deleteById(Long id);
}