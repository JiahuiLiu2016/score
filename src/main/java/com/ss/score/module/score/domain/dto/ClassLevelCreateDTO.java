package com.ss.score.module.score.domain.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 定义班级的层次信息CreateDTO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class ClassLevelCreateDTO {


    /**
     * 班级层次名称，如火箭班、平行班等
     */
    private String name;

    /**
     * 班级层次描述
     */
    private String description;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @NotNull(message = "逻辑删除标志，0表示未删除，1表示已删除不得为空")
    private Boolean deleteFlag;
}