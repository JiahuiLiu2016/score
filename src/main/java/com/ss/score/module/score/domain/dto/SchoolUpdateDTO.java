package com.ss.score.module.score.domain.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 存储学校的基本信息UpdateDTO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class SchoolUpdateDTO {

    /**
     * 学校ID，自增主键
     */
    @NotNull(message = "学校ID，自增主键不得为空")
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
    @NotNull(message = "所属集团ID不得为空")
    private Long groupCompanyId;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @NotNull(message = "逻辑删除标志，0表示未删除，1表示已删除不得为空")
    private Boolean deleteFlag;
}