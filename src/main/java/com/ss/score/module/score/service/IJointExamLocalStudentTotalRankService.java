package com.ss.score.module.score.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ss.score.module.score.domain.dto.JointExamLocalStudentTotalRankCreateDTO;
import com.ss.score.module.score.domain.dto.JointExamLocalStudentTotalRankUpdateDTO;
import com.ss.score.module.score.domain.entity.JointExamLocalStudentTotalRank;
import com.ss.score.module.score.domain.vo.JointExamLocalStudentTotalRankVO;

import java.util.List;

/**
 * 记录联考时本校学生的总分排名信息 服务类
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface IJointExamLocalStudentTotalRankService extends IService<JointExamLocalStudentTotalRank> {

    /**
     * 列表
     * @return list
     */
    List<JointExamLocalStudentTotalRankVO> listVO();

    /**
     * getByIdVO
     *
     * @param id id
     * @return vo
     */
    JointExamLocalStudentTotalRankVO getByIdVO(Long id);

    /**
     * 新增
     * @param dto JointExamLocalStudentTotalRankCreateDTO
     */
    void saveByDTO(JointExamLocalStudentTotalRankCreateDTO dto);

    /**
     * 更新
     * @param dto JointExamLocalStudentTotalRankUpdateDTO
     */
    void updateByDTO(JointExamLocalStudentTotalRankUpdateDTO dto);

    /**
     * 删除
     * @param id id
     */
    void deleteById(Long id);
}