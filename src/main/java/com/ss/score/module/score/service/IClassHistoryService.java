package com.ss.score.module.score.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ss.score.module.score.domain.dto.ClassHistoryCreateDTO;
import com.ss.score.module.score.domain.dto.ClassHistoryUpdateDTO;
import com.ss.score.module.score.domain.entity.ClassHistory;
import com.ss.score.module.score.domain.vo.ClassHistoryVO;

import java.util.List;

/**
 * 记录本校学生的分班信息 服务类
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface IClassHistoryService extends IService<ClassHistory> {

    /**
     * 列表
     * @return list
     */
    List<ClassHistoryVO> listVO();

    /**
     * getByIdVO
     *
     * @param id id
     * @return vo
     */
    ClassHistoryVO getByIdVO(Long id);

    /**
     * 新增
     * @param dto ClassHistoryCreateDTO
     */
    void saveByDTO(ClassHistoryCreateDTO dto);

    /**
     * 更新
     * @param dto ClassHistoryUpdateDTO
     */
    void updateByDTO(ClassHistoryUpdateDTO dto);

    /**
     * 删除
     * @param id id
     */
    void deleteById(Long id);
}