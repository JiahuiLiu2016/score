package com.ss.score.module.score.domain.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 记录联考的信息CreateDTO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class JointExamCreateDTO {


    /**
     * 联考名称
     */
    private String name;

    /**
     * 联考日期
     */
    @NotNull(message = "联考日期不得为空")
    private LocalDate examDate;

    /**
     * 是否有所有学校学生信息，0表示没有，1表示有
     */
    @NotNull(message = "是否有所有学校学生信息，0表示没有，1表示有不得为空")
    private Boolean hasAllSchoolInfo;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @NotNull(message = "逻辑删除标志，0表示未删除，1表示已删除不得为空")
    private Boolean deleteFlag;
}