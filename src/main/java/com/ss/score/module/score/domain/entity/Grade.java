package com.ss.score.module.score.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 存储学生的成绩信息
 *
 * @author ljh
 * @since 2025-02-03
 */
@Getter
@Setter
public class Grade implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 成绩记录ID，自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 本校学生ID
     */
    @TableField("local_student_id")
    private Long localStudentId;

    /**
     * 外校学生ID
     */
    @TableField("external_student_id")
    private Long externalStudentId;

    /**
     * 学科ID
     */
    @TableField("subject_id")
    private Long subjectId;

    /**
     * 考试类型ID
     */
    @TableField("exam_type_id")
    private Long examTypeId;

    /**
     * 学年ID
     */
    @TableField("academic_year_id")
    private Long academicYearId;

    /**
     * 联考ID
     */
    @TableField("joint_exam_id")
    private Long jointExamId;

    /**
     * 原始成绩
     */
    @TableField("raw_score")
    private Double rawScore;

    /**
     * 赋分后的成绩
     */
    @TableField("assigned_score")
    private Double assignedScore;

    /**
     * 是否通过考试，0表示未通过，1表示通过
     */
    @TableField("is_passed")
    private Boolean isPassed;

    /**
     * 考试日期
     */
    @TableField("exam_date")
    private LocalDate examDate;

    /**
     * 成绩等级，如优秀、良好等
     */
    @TableField("grade_level")
    private String gradeLevel;

    /**
     * 备注信息，如缺考、缓考等
     */
    @TableField("remark")
    private String remark;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @TableField("delete_flag")
    @TableLogic
    private Boolean deleteFlag;
}