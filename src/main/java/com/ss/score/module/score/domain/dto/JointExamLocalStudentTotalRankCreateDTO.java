package com.ss.score.module.score.domain.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 记录联考时本校学生的总分排名信息CreateDTO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class JointExamLocalStudentTotalRankCreateDTO {


    /**
     * 本校学生ID
     */
    @NotNull(message = "本校学生ID不得为空")
    private Long localStudentId;

    /**
     * 联考ID
     */
    @NotNull(message = "联考ID不得为空")
    private Long jointExamId;

    /**
     * 总分排名
     */
    @NotNull(message = "总分排名不得为空")
    private Integer totalRank;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @NotNull(message = "逻辑删除标志，0表示未删除，1表示已删除不得为空")
    private Boolean deleteFlag;
}