package com.ss.score.module.score.domain.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 存储学科的信息UpdateDTO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class SubjectUpdateDTO {

    /**
     * 学科ID，自增主键
     */
    @NotNull(message = "学科ID，自增主键不得为空")
    private Long id;

    /**
     * 学科名称
     */
    private String name;

    /**
     * 学科类型，如统一科目、首选科目、再选科目
     */
    private String type;

    /**
     * 是否为必考科目，0表示非必考，1表示必考
     */
    @NotNull(message = "是否为必考科目，0表示非必考，1表示必考不得为空")
    private Boolean isRequired;

    /**
     * 是否为外语科目，0表示否，1表示是
     */
    @NotNull(message = "是否为外语科目，0表示否，1表示是不得为空")
    private Boolean isForeignLanguage;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @NotNull(message = "逻辑删除标志，0表示未删除，1表示已删除不得为空")
    private Boolean deleteFlag;
}