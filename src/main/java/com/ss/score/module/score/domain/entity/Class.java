package com.ss.score.module.score.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 存储班级的信息
 *
 * @author ljh
 * @since 2025-02-03
 */
@Getter
@Setter
public class Class implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 班级ID，自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 班级名称
     */
    @TableField("name")
    private String name;

    /**
     * 所属学年ID
     */
    @TableField("academic_year_id")
    private Long academicYearId;

    /**
     * 所属学校ID
     */
    @TableField("school_id")
    private Long schoolId;

    /**
     * 班主任教师ID
     */
    @TableField("class_teacher_id")
    private Long classTeacherId;

    /**
     * 班级层次ID
     */
    @TableField("class_level_id")
    private Long classLevelId;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @TableField("delete_flag")
    @TableLogic
    private Boolean deleteFlag;
}