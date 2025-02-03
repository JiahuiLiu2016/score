package com.ss.score.module.score.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ss.score.module.score.domain.dto.JointExamSchoolCreateDTO;
import com.ss.score.module.score.domain.dto.JointExamSchoolUpdateDTO;
import com.ss.score.module.score.domain.entity.JointExamSchool;
import com.ss.score.module.score.domain.vo.JointExamSchoolVO;

import java.util.List;

/**
 * 记录参与联考的学校信息 服务类
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface IJointExamSchoolService extends IService<JointExamSchool> {

    /**
     * 列表
     * @return list
     */
    List<JointExamSchoolVO> listVO();

    /**
     * getByIdVO
     *
     * @param id id
     * @return vo
     */
    JointExamSchoolVO getByIdVO(Long id);

    /**
     * 新增
     * @param dto JointExamSchoolCreateDTO
     */
    void saveByDTO(JointExamSchoolCreateDTO dto);

    /**
     * 更新
     * @param dto JointExamSchoolUpdateDTO
     */
    void updateByDTO(JointExamSchoolUpdateDTO dto);

    /**
     * 删除
     * @param id id
     */
    void deleteById(Long id);
}