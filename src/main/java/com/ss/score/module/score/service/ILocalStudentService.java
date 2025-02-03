package com.ss.score.module.score.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ss.score.module.score.domain.dto.LocalStudentCreateDTO;
import com.ss.score.module.score.domain.dto.LocalStudentUpdateDTO;
import com.ss.score.module.score.domain.entity.LocalStudent;
import com.ss.score.module.score.domain.vo.LocalStudentVO;

import java.util.List;

/**
 * 存储本校学生的基本信息 服务类
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface ILocalStudentService extends IService<LocalStudent> {

    /**
     * 列表
     * @return list
     */
    List<LocalStudentVO> listVO();

    /**
     * getByIdVO
     *
     * @param id id
     * @return vo
     */
    LocalStudentVO getByIdVO(Long id);

    /**
     * 新增
     * @param dto LocalStudentCreateDTO
     */
    void saveByDTO(LocalStudentCreateDTO dto);

    /**
     * 更新
     * @param dto LocalStudentUpdateDTO
     */
    void updateByDTO(LocalStudentUpdateDTO dto);

    /**
     * 删除
     * @param id id
     */
    void deleteById(Long id);
}