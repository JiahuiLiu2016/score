package com.ss.score.module.score.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ss.score.module.score.domain.dto.JointExamLocalStudentSubjectRankCreateDTO;
import com.ss.score.module.score.domain.dto.JointExamLocalStudentSubjectRankUpdateDTO;
import com.ss.score.module.score.domain.entity.JointExamLocalStudentSubjectRank;
import com.ss.score.module.score.domain.vo.JointExamLocalStudentSubjectRankVO;

import java.util.List;

/**
 * 记录联考时本校学生各科的排名信息 服务类
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface IJointExamLocalStudentSubjectRankService extends IService<JointExamLocalStudentSubjectRank> {

    /**
     * 列表
     * @return list
     */
    List<JointExamLocalStudentSubjectRankVO> listVO();

    /**
     * getByIdVO
     *
     * @param id id
     * @return vo
     */
    JointExamLocalStudentSubjectRankVO getByIdVO(Long id);

    /**
     * 新增
     * @param dto JointExamLocalStudentSubjectRankCreateDTO
     */
    void saveByDTO(JointExamLocalStudentSubjectRankCreateDTO dto);

    /**
     * 更新
     * @param dto JointExamLocalStudentSubjectRankUpdateDTO
     */
    void updateByDTO(JointExamLocalStudentSubjectRankUpdateDTO dto);

    /**
     * 删除
     * @param id id
     */
    void deleteById(Long id);
}