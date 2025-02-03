package com.ss.score.module.score.domain.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 记录本校学生的分班信息VO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class ClassHistoryVO {

    /**
     * 分班记录ID，自增主键
     */
    private Long id;

    /**
     * 本校学生ID
     */
    private Long studentId;

    /**
     * 班级ID
     */
    private Long classId;

    /**
     * 学年ID
     */
    private Long academicYearId;

    /**
     * 是否为当前班级，0表示否，1表示是
     */
    private Boolean isCurrent;

    /**
     * 学生进入该班级的日期
     */
    private LocalDate entryDate;

    /**
     * 学生离开该班级的日期，为空表示当前仍在该班级
     */
    private LocalDate endDate;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    private Boolean deleteFlag;
}