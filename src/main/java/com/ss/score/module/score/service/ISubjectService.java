package com.ss.score.module.score.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ss.score.module.score.domain.dto.SubjectCreateDTO;
import com.ss.score.module.score.domain.dto.SubjectUpdateDTO;
import com.ss.score.module.score.domain.entity.Subject;
import com.ss.score.module.score.domain.vo.SubjectVO;

import java.util.List;

/**
 * 存储学科的信息 服务类
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface ISubjectService extends IService<Subject> {

    /**
     * 列表
     * @return list
     */
    List<SubjectVO> listVO();

    /**
     * getByIdVO
     *
     * @param id id
     * @return vo
     */
    SubjectVO getByIdVO(Long id);

    /**
     * 新增
     * @param dto SubjectCreateDTO
     */
    void saveByDTO(SubjectCreateDTO dto);

    /**
     * 更新
     * @param dto SubjectUpdateDTO
     */
    void updateByDTO(SubjectUpdateDTO dto);

    /**
     * 删除
     * @param id id
     */
    void deleteById(Long id);
}