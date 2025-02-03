package com.ss.score.module.score.domain.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 记录本校学生的分班信息CreateDTO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class ClassHistoryCreateDTO {


    /**
     * 本校学生ID
     */
    @NotNull(message = "本校学生ID不得为空")
    private Long studentId;

    /**
     * 班级ID
     */
    @NotNull(message = "班级ID不得为空")
    private Long classId;

    /**
     * 学年ID
     */
    @NotNull(message = "学年ID不得为空")
    private Long academicYearId;

    /**
     * 是否为当前班级，0表示否，1表示是
     */
    @NotNull(message = "是否为当前班级，0表示否，1表示是不得为空")
    private Boolean isCurrent;

    /**
     * 学生进入该班级的日期
     */
    @NotNull(message = "学生进入该班级的日期不得为空")
    private LocalDate entryDate;

    /**
     * 学生离开该班级的日期，为空表示当前仍在该班级
     */
    @NotNull(message = "学生离开该班级的日期，为空表示当前仍在该班级不得为空")
    private LocalDate endDate;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @NotNull(message = "逻辑删除标志，0表示未删除，1表示已删除不得为空")
    private Boolean deleteFlag;
}