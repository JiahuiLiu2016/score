package com.ss.score.module.score.domain.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 存储外校学生的基本信息VO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class ExternalStudentVO {

    /**
     * 外校学生ID，自增主键
     */
    private Long id;

    /**
     * 学生编号，唯一标识
     */
    private String studentId;

    /**
     * 学生姓名
     */
    private String name;

    /**
     * 学生性别
     */
    private String gender;

    /**
     * 外校学校名称
     */
    private String schoolName;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    private Boolean deleteFlag;
}