package com.ss.score.module.score.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ss.score.module.score.domain.dto.JointExamCreateDTO;
import com.ss.score.module.score.domain.dto.JointExamUpdateDTO;
import com.ss.score.module.score.domain.entity.JointExam;
import com.ss.score.module.score.domain.vo.JointExamVO;

import java.util.List;

/**
 * 记录联考的信息 服务类
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface IJointExamService extends IService<JointExam> {

    /**
     * 列表
     * @return list
     */
    List<JointExamVO> listVO();

    /**
     * getByIdVO
     *
     * @param id id
     * @return vo
     */
    JointExamVO getByIdVO(Long id);

    /**
     * 新增
     * @param dto JointExamCreateDTO
     */
    void saveByDTO(JointExamCreateDTO dto);

    /**
     * 更新
     * @param dto JointExamUpdateDTO
     */
    void updateByDTO(JointExamUpdateDTO dto);

    /**
     * 删除
     * @param id id
     */
    void deleteById(Long id);
}