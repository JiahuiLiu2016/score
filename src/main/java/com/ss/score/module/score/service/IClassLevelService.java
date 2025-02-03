package com.ss.score.module.score.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ss.score.module.score.domain.dto.ClassLevelCreateDTO;
import com.ss.score.module.score.domain.dto.ClassLevelUpdateDTO;
import com.ss.score.module.score.domain.entity.ClassLevel;
import com.ss.score.module.score.domain.vo.ClassLevelVO;

import java.util.List;

/**
 * 定义班级的层次信息 服务类
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface IClassLevelService extends IService<ClassLevel> {

    /**
     * 列表
     * @return list
     */
    List<ClassLevelVO> listVO();

    /**
     * getByIdVO
     *
     * @param id id
     * @return vo
     */
    ClassLevelVO getByIdVO(Long id);

    /**
     * 新增
     * @param dto ClassLevelCreateDTO
     */
    void saveByDTO(ClassLevelCreateDTO dto);

    /**
     * 更新
     * @param dto ClassLevelUpdateDTO
     */
    void updateByDTO(ClassLevelUpdateDTO dto);

    /**
     * 删除
     * @param id id
     */
    void deleteById(Long id);
}