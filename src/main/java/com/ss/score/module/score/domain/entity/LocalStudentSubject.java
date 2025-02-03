package com.ss.score.module.score.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 记录本校学生的学科选择信息
 *
 * @author ljh
 * @since 2025-02-03
 */
@Getter
@Setter
@TableName("`score`.local_student_subject")
public class LocalStudentSubject implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 学生 - 学科关联ID，自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 本校学生ID
     */
    @TableField("student_id")
    private Long studentId;

    /**
     * 学科ID
     */
    @TableField("subject_id")
    private Long subjectId;

    /**
     * 学年ID
     */
    @TableField("academic_year_id")
    private Long academicYearId;

    /**
     * 是否为选考科目，0表示否，1表示是
     */
    @TableField("is_selected")
    private Boolean isSelected;

    /**
     * 是否为外语科目选择，0表示否，1表示是
     */
    @TableField("is_foreign_language_selection")
    private Boolean isForeignLanguageSelection;

    /**
     * 学生选择该学科的时间
     */
    @TableField("selection_date")
    private LocalDateTime selectionDate;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @TableField("delete_flag")
    @TableLogic
    private Boolean deleteFlag;
}