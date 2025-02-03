package com.ss.score.module.score.domain.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 存储本校学生的基本信息VO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class LocalStudentVO {

    /**
     * 本校学生ID，自增主键
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
     * 所属学校ID
     */
    private Long schoolId;

    /**
     * 入学日期
     */
    private LocalDate enrollmentDate;

    /**
     * 毕业日期，为空表示未毕业
     */
    private LocalDate graduationDate;

    /**
     * 是否毕业，0表示未毕业，1表示已毕业
     */
    private Boolean isGraduated;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    private Boolean deleteFlag;
}