package com.ss.score.module.score.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 记录本校学生的分班信息
 *
 * @author ljh
 * @since 2025-02-03
 */
@Getter
@Setter
@TableName("`score`.class_history")
public class ClassHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分班记录ID，自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 本校学生ID
     */
    @TableField("student_id")
    private Long studentId;

    /**
     * 班级ID
     */
    @TableField("class_id")
    private Long classId;

    /**
     * 学年ID
     */
    @TableField("academic_year_id")
    private Long academicYearId;

    /**
     * 是否为当前班级，0表示否，1表示是
     */
    @TableField("is_current")
    private Boolean isCurrent;

    /**
     * 学生进入该班级的日期
     */
    @TableField("entry_date")
    private LocalDate entryDate;

    /**
     * 学生离开该班级的日期，为空表示当前仍在该班级
     */
    @TableField("end_date")
    private LocalDate endDate;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @TableField("delete_flag")
    @TableLogic
    private Boolean deleteFlag;
}