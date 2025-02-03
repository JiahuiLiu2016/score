package com.ss.score.module.score.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 记录教师在一个学年内的调动信息
 *
 * @author ljh
 * @since 2025-02-03
 */
@Getter
@Setter
@TableName("`score`.teacher_transfer")
public class TeacherTransfer implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 教师调动ID，自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 教师ID
     */
    @TableField("teacher_id")
    private Long teacherId;

    /**
     * 原学校ID
     */
    @TableField("original_school_id")
    private Long originalSchoolId;

    /**
     * 新学校ID
     */
    @TableField("new_school_id")
    private Long newSchoolId;

    /**
     * 调动起始日期
     */
    @TableField("transfer_start_date")
    private LocalDate transferStartDate;

    /**
     * 调动结束日期，为空表示仍在新学校
     */
    @TableField("transfer_end_date")
    private LocalDate transferEndDate;

    /**
     * 所属学年ID
     */
    @TableField("academic_year_id")
    private Long academicYearId;

    /**
     * 调动顺序，用于记录教师在同一学年内的多次调动
     */
    @TableField("transfer_order")
    private Integer transferOrder;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @TableField("delete_flag")
    @TableLogic
    private Boolean deleteFlag;
}