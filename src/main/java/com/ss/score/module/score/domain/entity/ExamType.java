package com.ss.score.module.score.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 存储考试类型的信息
 *
 * @author ljh
 * @since 2025-02-03
 */
@Getter
@Setter
@TableName("`score`.exam_type")
public class ExamType implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 考试类型ID，自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 考试类型名称，如期中、期末等
     */
    @TableField("name")
    private String name;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @TableField("delete_flag")
    @TableLogic
    private Boolean deleteFlag;
}