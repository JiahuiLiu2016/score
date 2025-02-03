package com.ss.score.module.score.domain.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 记录班级、学科和教师的关联信息UpdateDTO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class ClassSubjectTeacherUpdateDTO {

    /**
     * 班级 - 学科 - 教师关联ID，自增主键
     */
    @NotNull(message = "班级 - 学科 - 教师关联ID，自增主键不得为空")
    private Long id;

    /**
     * 班级ID
     */
    @NotNull(message = "班级ID不得为空")
    private Long classId;

    /**
     * 学科ID
     */
    @NotNull(message = "学科ID不得为空")
    private Long subjectId;

    /**
     * 教师ID
     */
    @NotNull(message = "教师ID不得为空")
    private Long teacherId;

    /**
     * 学年ID
     */
    @NotNull(message = "学年ID不得为空")
    private Long academicYearId;

    /**
     * 教师开始授课日期
     */
    @NotNull(message = "教师开始授课日期不得为空")
    private LocalDate startDate;

    /**
     * 教师结束授课日期，为空表示仍在授课
     */
    @NotNull(message = "教师结束授课日期，为空表示仍在授课不得为空")
    private LocalDate endDate;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @NotNull(message = "逻辑删除标志，0表示未删除，1表示已删除不得为空")
    private Boolean deleteFlag;
}