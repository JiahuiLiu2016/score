package com.ss.score.module.score.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 记录联考的信息
 *
 * @author ljh
 * @since 2025-02-03
 */
@Getter
@Setter
@TableName("`score`.joint_exam")
public class JointExam implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 联考ID，自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 联考名称
     */
    @TableField("name")
    private String name;

    /**
     * 联考日期
     */
    @TableField("exam_date")
    private LocalDate examDate;

    /**
     * 是否有所有学校学生信息，0表示没有，1表示有
     */
    @TableField("has_all_school_info")
    private Boolean hasAllSchoolInfo;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @TableField("delete_flag")
    @TableLogic
    private Boolean deleteFlag;
}