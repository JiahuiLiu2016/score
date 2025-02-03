package com.ss.score.module.score.domain.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * VO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class FlywaySchemaHistoryScoreVO {

    private Integer installedRank;

    private String version;

    private String description;

    private String type;

    private String script;

    private Integer checksum;

    private String installedBy;

    private LocalDateTime installedOn;

    private Integer executionTime;

    private Boolean success;
}