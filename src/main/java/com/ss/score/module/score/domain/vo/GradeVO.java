package com.ss.score.module.score.domain.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 存储学生的成绩信息VO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class GradeVO {

    /**
     * 成绩记录ID，自增主键
     */
    private Long id;

    /**
     * 本校学生ID
     */
    private Long localStudentId;

    /**
     * 外校学生ID
     */
    private Long externalStudentId;

    /**
     * 学科ID
     */
    private Long subjectId;

    /**
     * 考试类型ID
     */
    private Long examTypeId;

    /**
     * 学年ID
     */
    private Long academicYearId;

    /**
     * 联考ID
     */
    private Long jointExamId;

    /**
     * 原始成绩
     */
    private Double rawScore;

    /**
     * 赋分后的成绩
     */
    private Double assignedScore;

    /**
     * 是否通过考试，0表示未通过，1表示通过
     */
    private Boolean isPassed;

    /**
     * 考试日期
     */
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
    private Boolean deleteFlag;
}