package com.ss.score.module.score.domain.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 记录教师在一个学年内的调动信息CreateDTO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class TeacherTransferCreateDTO {


    /**
     * 教师ID
     */
    @NotNull(message = "教师ID不得为空")
    private Long teacherId;

    /**
     * 原学校ID
     */
    @NotNull(message = "原学校ID不得为空")
    private Long originalSchoolId;

    /**
     * 新学校ID
     */
    @NotNull(message = "新学校ID不得为空")
    private Long newSchoolId;

    /**
     * 调动起始日期
     */
    @NotNull(message = "调动起始日期不得为空")
    private LocalDate transferStartDate;

    /**
     * 调动结束日期，为空表示仍在新学校
     */
    @NotNull(message = "调动结束日期，为空表示仍在新学校不得为空")
    private LocalDate transferEndDate;

    /**
     * 所属学年ID
     */
    @NotNull(message = "所属学年ID不得为空")
    private Long academicYearId;

    /**
     * 调动顺序，用于记录教师在同一学年内的多次调动
     */
    @NotNull(message = "调动顺序，用于记录教师在同一学年内的多次调动不得为空")
    private Integer transferOrder;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @NotNull(message = "逻辑删除标志，0表示未删除，1表示已删除不得为空")
    private Boolean deleteFlag;
}