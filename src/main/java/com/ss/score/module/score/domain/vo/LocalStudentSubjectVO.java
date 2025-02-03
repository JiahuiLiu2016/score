package com.ss.score.module.score.domain.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 记录本校学生的学科选择信息VO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class LocalStudentSubjectVO {

    /**
     * 学生 - 学科关联ID，自增主键
     */
    private Long id;

    /**
     * 本校学生ID
     */
    private Long studentId;

    /**
     * 学科ID
     */
    private Long subjectId;

    /**
     * 学年ID
     */
    private Long academicYearId;

    /**
     * 是否为选考科目，0表示否，1表示是
     */
    private Boolean isSelected;

    /**
     * 是否为外语科目选择，0表示否，1表示是
     */
    private Boolean isForeignLanguageSelection;

    /**
     * 学生选择该学科的时间
     */
    private LocalDateTime selectionDate;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    private Boolean deleteFlag;
}