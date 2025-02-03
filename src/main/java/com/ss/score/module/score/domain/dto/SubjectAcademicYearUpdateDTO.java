package com.ss.score.module.score.domain.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 记录学科在哪些学年有效UpdateDTO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class SubjectAcademicYearUpdateDTO {

    /**
     * 学科 - 学年关联ID，自增主键
     */
    @NotNull(message = "学科 - 学年关联ID，自增主键不得为空")
    private Long id;

    /**
     * 学科ID
     */
    @NotNull(message = "学科ID不得为空")
    private Long subjectId;

    /**
     * 学年ID
     */
    @NotNull(message = "学年ID不得为空")
    private Long academicYearId;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @NotNull(message = "逻辑删除标志，0表示未删除，1表示已删除不得为空")
    private Boolean deleteFlag;
}