package com.ss.score.module.score.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ss.score.module.score.domain.dto.ClassCreateDTO;
import com.ss.score.module.score.domain.dto.ClassUpdateDTO;
import com.ss.score.module.score.domain.entity.Class;
import com.ss.score.module.score.domain.vo.ClassVO;

import java.util.List;

/**
 * 存储班级的信息 服务类
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface IClassService extends IService<Class> {

    /**
     * 列表
     * @return list
     */
    List<ClassVO> listVO();

    /**
     * getByIdVO
     *
     * @param id id
     * @return vo
     */
    ClassVO getByIdVO(Long id);

    /**
     * 新增
     * @param dto ClassCreateDTO
     */
    void saveByDTO(ClassCreateDTO dto);

    /**
     * 更新
     * @param dto ClassUpdateDTO
     */
    void updateByDTO(ClassUpdateDTO dto);

    /**
     * 删除
     * @param id id
     */
    void deleteById(Long id);
}