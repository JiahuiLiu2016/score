package com.ss.score.module.score.domain.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 记录外校学生的学科选择信息CreateDTO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class ExternalStudentSubjectCreateDTO {


    /**
     * 外校学生ID
     */
    @NotNull(message = "外校学生ID不得为空")
    private Long studentId;

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
     * 是否为选考科目，0表示否，1表示是
     */
    @NotNull(message = "是否为选考科目，0表示否，1表示是不得为空")
    private Boolean isSelected;

    /**
     * 是否为外语科目选择，0表示否，1表示是
     */
    @NotNull(message = "是否为外语科目选择，0表示否，1表示是不得为空")
    private Boolean isForeignLanguageSelection;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @NotNull(message = "逻辑删除标志，0表示未删除，1表示已删除不得为空")
    private Boolean deleteFlag;
}