package com.ss.score.module.score.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 存储外校学生的基本信息
 *
 * @author ljh
 * @since 2025-02-03
 */
@Getter
@Setter
@TableName("`score`.external_student")
public class ExternalStudent implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 外校学生ID，自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 学生编号，唯一标识
     */
    @TableField("student_id")
    private String studentId;

    /**
     * 学生姓名
     */
    @TableField("name")
    private String name;

    /**
     * 学生性别
     */
    @TableField("gender")
    private String gender;

    /**
     * 外校学校名称
     */
    @TableField("school_name")
    private String schoolName;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @TableField("delete_flag")
    @TableLogic
    private Boolean deleteFlag;
}