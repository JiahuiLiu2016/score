package com.ss.score.module.score.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 存储本校学生的基本信息
 *
 * @author ljh
 * @since 2025-02-03
 */
@Getter
@Setter
@TableName("`score`.local_student")
public class LocalStudent implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 本校学生ID，自增主键
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
     * 所属学校ID
     */
    @TableField("school_id")
    private Long schoolId;

    /**
     * 入学日期
     */
    @TableField("enrollment_date")
    private LocalDate enrollmentDate;

    /**
     * 毕业日期，为空表示未毕业
     */
    @TableField("graduation_date")
    private LocalDate graduationDate;

    /**
     * 是否毕业，0表示未毕业，1表示已毕业
     */
    @TableField("is_graduated")
    private Boolean isGraduated;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @TableField("delete_flag")
    @TableLogic
    private Boolean deleteFlag;
}