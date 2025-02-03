package com.ss.score.module.score.domain.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 存储教师的基本信息VO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class TeacherVO {

    /**
     * 教师ID，自增主键
     */
    private Long id;

    /**
     * 教师编号，唯一标识
     */
    private String teacherId;

    /**
     * 教师姓名
     */
    private String name;

    /**
     * 教师性别
     */
    private String gender;

    /**
     * 当前所属学校ID
     */
    private Long currentSchoolId;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    private Boolean deleteFlag;
}