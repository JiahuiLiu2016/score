package com.ss.score.module.score.domain.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 记录参与联考的学校信息CreateDTO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class JointExamSchoolCreateDTO {


    /**
     * 联考ID
     */
    @NotNull(message = "联考ID不得为空")
    private Long jointExamId;

    /**
     * 学校ID
     */
    @NotNull(message = "学校ID不得为空")
    private Long schoolId;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @NotNull(message = "逻辑删除标志，0表示未删除，1表示已删除不得为空")
    private Boolean deleteFlag;
}