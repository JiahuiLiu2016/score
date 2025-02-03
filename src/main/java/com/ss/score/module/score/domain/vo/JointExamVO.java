package com.ss.score.module.score.domain.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 记录联考的信息VO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class JointExamVO {

    /**
     * 联考ID，自增主键
     */
    private Long id;

    /**
     * 联考名称
     */
    private String name;

    /**
     * 联考日期
     */
    private LocalDate examDate;

    /**
     * 是否有所有学校学生信息，0表示没有，1表示有
     */
    private Boolean hasAllSchoolInfo;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    private Boolean deleteFlag;
}