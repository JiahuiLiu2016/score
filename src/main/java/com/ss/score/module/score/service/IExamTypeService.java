package com.ss.score.module.score.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ss.score.module.score.domain.dto.ExamTypeCreateDTO;
import com.ss.score.module.score.domain.dto.ExamTypeUpdateDTO;
import com.ss.score.module.score.domain.entity.ExamType;
import com.ss.score.module.score.domain.vo.ExamTypeVO;

import java.util.List;

/**
 * 存储考试类型的信息 服务类
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface IExamTypeService extends IService<ExamType> {

    /**
     * 列表
     * @return list
     */
    List<ExamTypeVO> listVO();

    /**
     * getByIdVO
     *
     * @param id id
     * @return vo
     */
    ExamTypeVO getByIdVO(Long id);

    /**
     * 新增
     * @param dto ExamTypeCreateDTO
     */
    void saveByDTO(ExamTypeCreateDTO dto);

    /**
     * 更新
     * @param dto ExamTypeUpdateDTO
     */
    void updateByDTO(ExamTypeUpdateDTO dto);

    /**
     * 删除
     * @param id id
     */
    void deleteById(Long id);
}