package com.ss.score.module.score.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 存储教师的基本信息
 *
 * @author ljh
 * @since 2025-02-03
 */
@Getter
@Setter
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 教师ID，自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 教师编号，唯一标识
     */
    @TableField("teacher_id")
    private String teacherId;

    /**
     * 教师姓名
     */
    @TableField("name")
    private String name;

    /**
     * 教师性别
     */
    @TableField("gender")
    private String gender;

    /**
     * 当前所属学校ID
     */
    @TableField("current_school_id")
    private Long currentSchoolId;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @TableField("delete_flag")
    @TableLogic
    private Boolean deleteFlag;
}