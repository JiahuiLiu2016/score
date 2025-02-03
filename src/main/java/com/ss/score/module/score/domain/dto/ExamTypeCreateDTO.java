package com.ss.score.module.score.domain.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 存储考试类型的信息CreateDTO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class ExamTypeCreateDTO {


    /**
     * 考试类型名称，如期中、期末等
     */
    private String name;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @NotNull(message = "逻辑删除标志，0表示未删除，1表示已删除不得为空")
    private Boolean deleteFlag;
}