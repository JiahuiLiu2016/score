package com.ss.score.module.score.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 存储学科的信息
 *
 * @author ljh
 * @since 2025-02-03
 */
@Getter
@Setter
public class Subject implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 学科ID，自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 学科名称
     */
    @TableField("name")
    private String name;

    /**
     * 学科类型，如统一科目、首选科目、再选科目
     */
    @TableField("type")
    private String type;

    /**
     * 是否为必考科目，0表示非必考，1表示必考
     */
    @TableField("is_required")
    private Boolean isRequired;

    /**
     * 是否为外语科目，0表示否，1表示是
     */
    @TableField("is_foreign_language")
    private Boolean isForeignLanguage;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @TableField("delete_flag")
    @TableLogic
    private Boolean deleteFlag;
}