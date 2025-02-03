package com.ss.score.module.score.domain.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 记录联考时本校学生各科的排名信息VO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class JointExamLocalStudentSubjectRankVO {

    /**
     * 排名记录ID，自增主键
     */
    private Long id;

    /**
     * 本校学生ID
     */
    private Long localStudentId;

    /**
     * 学科ID
     */
    private Long subjectId;

    /**
     * 联考ID
     */
    private Long jointExamId;

    /**
     * 学科排名
     */
    private Integer subjectRank;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    private Boolean deleteFlag;
}