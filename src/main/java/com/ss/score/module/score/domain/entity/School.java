package com.ss.score.module.score.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 存储学校的基本信息
 *
 * @author ljh
 * @since 2025-02-03
 */
@Getter
@Setter
public class School implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 学校ID，自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 学校名称
     */
    @TableField("name")
    private String name;

    /**
     * 学校地址
     */
    @TableField("address")
    private String address;

    /**
     * 所属集团ID
     */
    @TableField("group_company_id")
    private Long groupCompanyId;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @TableField("delete_flag")
    @TableLogic
    private Boolean deleteFlag;
}