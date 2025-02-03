package com.ss.score.module.score.domain.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 记录教师在一个学年内的调动信息VO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class TeacherTransferVO {

    /**
     * 教师调动ID，自增主键
     */
    private Long id;

    /**
     * 教师ID
     */
    private Long teacherId;

    /**
     * 原学校ID
     */
    private Long originalSchoolId;

    /**
     * 新学校ID
     */
    private Long newSchoolId;

    /**
     * 调动起始日期
     */
    private LocalDate transferStartDate;

    /**
     * 调动结束日期，为空表示仍在新学校
     */
    private LocalDate transferEndDate;

    /**
     * 所属学年ID
     */
    private Long academicYearId;

    /**
     * 调动顺序，用于记录教师在同一学年内的多次调动
     */
    private Integer transferOrder;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    private Boolean deleteFlag;
}