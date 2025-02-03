package com.ss.score.module.score.domain.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 记录学年的信息VO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class AcademicYearVO {

    /**
     * 学年ID，自增主键
     */
    private Long id;

    /**
     * 学年名称，如2023 - 2024学年
     */
    private String name;

    /**
     * 学年开始日期
     */
    private LocalDate startDate;

    /**
     * 学年结束日期
     */
    private LocalDate endDate;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    private Boolean deleteFlag;
}