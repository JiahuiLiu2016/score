package com.ss.score.module.score.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ss.score.module.score.domain.dto.ExternalStudentCreateDTO;
import com.ss.score.module.score.domain.dto.ExternalStudentUpdateDTO;
import com.ss.score.module.score.domain.entity.ExternalStudent;
import com.ss.score.module.score.domain.vo.ExternalStudentVO;

import java.util.List;

/**
 * 存储外校学生的基本信息 服务类
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface IExternalStudentService extends IService<ExternalStudent> {

    /**
     * 列表
     * @return list
     */
    List<ExternalStudentVO> listVO();

    /**
     * getByIdVO
     *
     * @param id id
     * @return vo
     */
    ExternalStudentVO getByIdVO(Long id);

    /**
     * 新增
     * @param dto ExternalStudentCreateDTO
     */
    void saveByDTO(ExternalStudentCreateDTO dto);

    /**
     * 更新
     * @param dto ExternalStudentUpdateDTO
     */
    void updateByDTO(ExternalStudentUpdateDTO dto);

    /**
     * 删除
     * @param id id
     */
    void deleteById(Long id);
}