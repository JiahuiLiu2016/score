package com.ss.score.module.score.domain.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 记录班级、学科和教师的关联信息VO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class ClassSubjectTeacherVO {

    /**
     * 班级 - 学科 - 教师关联ID，自增主键
     */
    private Long id;

    /**
     * 班级ID
     */
    private Long classId;

    /**
     * 学科ID
     */
    private Long subjectId;

    /**
     * 教师ID
     */
    private Long teacherId;

    /**
     * 学年ID
     */
    private Long academicYearId;

    /**
     * 教师开始授课日期
     */
    private LocalDate startDate;

    /**
     * 教师结束授课日期，为空表示仍在授课
     */
    private LocalDate endDate;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    private Boolean deleteFlag;
}