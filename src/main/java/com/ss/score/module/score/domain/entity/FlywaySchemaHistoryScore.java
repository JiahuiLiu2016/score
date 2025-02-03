package com.ss.score.module.score.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 
 *
 * @author ljh
 * @since 2025-02-03
 */
@Getter
@Setter
@TableName("`score`.flyway_schema_history_score")
public class FlywaySchemaHistoryScore implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer installedRank;

    @TableField("version")
    private String version;

    @TableField("description")
    private String description;

    @TableField("type")
    private String type;

    @TableField("script")
    private String script;

    @TableField("checksum")
    private Integer checksum;

    @TableField("installed_by")
    private String installedBy;

    @TableField("installed_on")
    private LocalDateTime installedOn;

    @TableField("execution_time")
    private Integer executionTime;

    @TableField("success")
    private Boolean success;
}