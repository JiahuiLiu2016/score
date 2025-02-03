package com.ss.score.module.score.domain.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 记录学科在哪些学年有效VO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class SubjectAcademicYearVO {

    /**
     * 学科 - 学年关联ID，自增主键
     */
    private Long id;

    /**
     * 学科ID
     */
    private Long subjectId;

    /**
     * 学年ID
     */
    private Long academicYearId;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    private Boolean deleteFlag;
}