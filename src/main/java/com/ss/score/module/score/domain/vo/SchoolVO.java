package com.ss.score.module.score.domain.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 存储学校的基本信息VO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class SchoolVO {

    /**
     * 学校ID，自增主键
     */
    private Long id;

    /**
     * 学校名称
     */
    private String name;

    /**
     * 学校地址
     */
    private String address;

    /**
     * 所属集团ID
     */
    private Long groupCompanyId;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    private Boolean deleteFlag;
}