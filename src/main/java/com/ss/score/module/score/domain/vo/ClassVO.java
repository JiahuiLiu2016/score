package com.ss.score.module.score.domain.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 存储班级的信息VO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class ClassVO {

    /**
     * 班级ID，自增主键
     */
    private Long id;

    /**
     * 班级名称
     */
    private String name;

    /**
     * 所属学年ID
     */
    private Long academicYearId;

    /**
     * 所属学校ID
     */
    private Long schoolId;

    /**
     * 班主任教师ID
     */
    private Long classTeacherId;

    /**
     * 班级层次ID
     */
    private Long classLevelId;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    private Boolean deleteFlag;
}