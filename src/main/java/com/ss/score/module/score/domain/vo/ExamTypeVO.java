package com.ss.score.module.score.domain.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 存储考试类型的信息VO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class ExamTypeVO {

    /**
     * 考试类型ID，自增主键
     */
    private Long id;

    /**
     * 考试类型名称，如期中、期末等
     */
    private String name;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    private Boolean deleteFlag;
}