package com.ss.score.module.score.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 记录班级、学科和教师的关联信息
 *
 * @author ljh
 * @since 2025-02-03
 */
@Getter
@Setter
@TableName("`score`.class_subject_teacher")
public class ClassSubjectTeacher implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 班级 - 学科 - 教师关联ID，自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 班级ID
     */
    @TableField("class_id")
    private Long classId;

    /**
     * 学科ID
     */
    @TableField("subject_id")
    private Long subjectId;

    /**
     * 教师ID
     */
    @TableField("teacher_id")
    private Long teacherId;

    /**
     * 学年ID
     */
    @TableField("academic_year_id")
    private Long academicYearId;

    /**
     * 教师开始授课日期
     */
    @TableField("start_date")
    private LocalDate startDate;

    /**
     * 教师结束授课日期，为空表示仍在授课
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