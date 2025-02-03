package com.ss.score.module.score.domain.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 存储学生的成绩信息CreateDTO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class GradeCreateDTO {


    /**
     * 本校学生ID
     */
    @NotNull(message = "本校学生ID不得为空")
    private Long localStudentId;

    /**
     * 外校学生ID
     */
    @NotNull(message = "外校学生ID不得为空")
    private Long externalStudentId;

    /**
     * 学科ID
     */
    @NotNull(message = "学科ID不得为空")
    private Long subjectId;

    /**
     * 考试类型ID
     */
    @NotNull(message = "考试类型ID不得为空")
    private Long examTypeId;

    /**
     * 学年ID
     */
    @NotNull(message = "学年ID不得为空")
    private Long academicYearId;

    /**
     * 联考ID
     */
    @NotNull(message = "联考ID不得为空")
    private Long jointExamId;

    /**
     * 原始成绩
     */
    @NotNull(message = "原始成绩不得为空")
    private Double rawScore;

    /**
     * 赋分后的成绩
     */
    @NotNull(message = "赋分后的成绩不得为空")
    private Double assignedScore;

    /**
     * 是否通过考试，0表示未通过，1表示通过
     */
    @NotNull(message = "是否通过考试，0表示未通过，1表示通过不得为空")
    private Boolean isPassed;

    /**
     * 考试日期
     */
    @NotNull(message = "考试日期不得为空")
    private LocalDate examDate;

    /**
     * 成绩等级，如优秀、良好等
     */
    private String gradeLevel;

    /**
     * 备注信息，如缺考、缓考等
     */
    private String remark;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @NotNull(message = "逻辑删除标志，0表示未删除，1表示已删除不得为空")
    private Boolean deleteFlag;
}