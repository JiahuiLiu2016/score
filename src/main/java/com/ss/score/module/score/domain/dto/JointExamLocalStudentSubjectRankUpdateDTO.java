package com.ss.score.module.score.domain.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 记录联考时本校学生各科的排名信息UpdateDTO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class JointExamLocalStudentSubjectRankUpdateDTO {

    /**
     * 排名记录ID，自增主键
     */
    @NotNull(message = "排名记录ID，自增主键不得为空")
    private Long id;

    /**
     * 本校学生ID
     */
    @NotNull(message = "本校学生ID不得为空")
    private Long localStudentId;

    /**
     * 学科ID
     */
    @NotNull(message = "学科ID不得为空")
    private Long subjectId;

    /**
     * 联考ID
     */
    @NotNull(message = "联考ID不得为空")
    private Long jointExamId;

    /**
     * 学科排名
     */
    @NotNull(message = "学科排名不得为空")
    private Integer subjectRank;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @NotNull(message = "逻辑删除标志，0表示未删除，1表示已删除不得为空")
    private Boolean deleteFlag;
}