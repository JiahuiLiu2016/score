package com.ss.score.module.score.domain.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 记录学年的信息UpdateDTO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class AcademicYearUpdateDTO {

    /**
     * 学年ID，自增主键
     */
    @NotNull(message = "学年ID，自增主键不得为空")
    private Long id;

    /**
     * 学年名称，如2023 - 2024学年
     */
    private String name;

    /**
     * 学年开始日期
     */
    @NotNull(message = "学年开始日期不得为空")
    private LocalDate startDate;

    /**
     * 学年结束日期
     */
    @NotNull(message = "学年结束日期不得为空")
    private LocalDate endDate;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @NotNull(message = "逻辑删除标志，0表示未删除，1表示已删除不得为空")
    private Boolean deleteFlag;
}