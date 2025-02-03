package com.ss.score.module.score.domain.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 存储班级的信息UpdateDTO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class ClassUpdateDTO {

    /**
     * 班级ID，自增主键
     */
    @NotNull(message = "班级ID，自增主键不得为空")
    private Long id;

    /**
     * 班级名称
     */
    private String name;

    /**
     * 所属学年ID
     */
    @NotNull(message = "所属学年ID不得为空")
    private Long academicYearId;

    /**
     * 所属学校ID
     */
    @NotNull(message = "所属学校ID不得为空")
    private Long schoolId;

    /**
     * 班主任教师ID
     */
    @NotNull(message = "班主任教师ID不得为空")
    private Long classTeacherId;

    /**
     * 班级层次ID
     */
    @NotNull(message = "班级层次ID不得为空")
    private Long classLevelId;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @NotNull(message = "逻辑删除标志，0表示未删除，1表示已删除不得为空")
    private Boolean deleteFlag;
}