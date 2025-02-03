package com.ss.score.module.score.domain.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 定义班级的层次信息VO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class ClassLevelVO {

    /**
     * 班级层次ID，自增主键
     */
    private Long id;

    /**
     * 班级层次名称，如火箭班、平行班等
     */
    private String name;

    /**
     * 班级层次描述
     */
    private String description;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    private Boolean deleteFlag;
}