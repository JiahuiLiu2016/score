package com.ss.score.module.score.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 定义班级的层次信息
 *
 * @author ljh
 * @since 2025-02-03
 */
@Getter
@Setter
@TableName("`score`.class_level")
public class ClassLevel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 班级层次ID，自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 班级层次名称，如火箭班、平行班等
     */
    @TableField("name")
    private String name;

    /**
     * 班级层次描述
     */
    @TableField("description")
    private String description;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @TableField("delete_flag")
    @TableLogic
    private Boolean deleteFlag;
}