package com.ss.score.module.score.domain.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * CreateDTO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class FlywaySchemaHistoryScoreCreateDTO {

    @NotNull(message = "installedRank不得为空")
    private Integer installedRank;

    private String version;

    private String description;

    private String type;

    private String script;

    @NotNull(message = "checksum不得为空")
    private Integer checksum;

    private String installedBy;

    @NotNull(message = "installedOn不得为空")
    private LocalDateTime installedOn;

    @NotNull(message = "executionTime不得为空")
    private Integer executionTime;

    @NotNull(message = "success不得为空")
    private Boolean success;
}