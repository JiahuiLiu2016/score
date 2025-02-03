package com.ss.score.module.score.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 记录学年的信息
 *
 * @author ljh
 * @since 2025-02-03
 */
@Getter
@Setter
@TableName("`score`.academic_year")
public class AcademicYear implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 学年ID，自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 学年名称，如2023 - 2024学年
     */
    @TableField("name")
    private String name;

    /**
     * 学年开始日期
     */
    @TableField("start_date")
    private LocalDate startDate;

    /**
     * 学年结束日期
     */
    @TableField("end_date")
    private LocalDate endDate;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @TableField("delete_flag")
    @TableLogic
    private Boolean deleteFlag;
}