package com.ss.score.module.score.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ss.score.module.score.domain.dto.GradeCreateDTO;
import com.ss.score.module.score.domain.dto.GradeUpdateDTO;
import com.ss.score.module.score.domain.entity.Grade;
import com.ss.score.module.score.domain.vo.GradeVO;

import java.util.List;

/**
 * 存储学生的成绩信息 服务类
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface IGradeService extends IService<Grade> {

    /**
     * 列表
     * @return list
     */
    List<GradeVO> listVO();

    /**
     * getByIdVO
     *
     * @param id id
     * @return vo
     */
    GradeVO getByIdVO(Long id);

    /**
     * 新增
     * @param dto GradeCreateDTO
     */
    void saveByDTO(GradeCreateDTO dto);

    /**
     * 更新
     * @param dto GradeUpdateDTO
     */
    void updateByDTO(GradeUpdateDTO dto);

    /**
     * 删除
     * @param id id
     */
    void deleteById(Long id);
}