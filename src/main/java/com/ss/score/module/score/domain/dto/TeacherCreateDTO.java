package com.ss.score.module.score.domain.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 存储教师的基本信息CreateDTO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class TeacherCreateDTO {


    /**
     * 教师编号，唯一标识
     */
    private String teacherId;

    /**
     * 教师姓名
     */
    private String name;

    /**
     * 教师性别
     */
    private String gender;

    /**
     * 当前所属学校ID
     */
    @NotNull(message = "当前所属学校ID不得为空")
    private Long currentSchoolId;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @NotNull(message = "逻辑删除标志，0表示未删除，1表示已删除不得为空")
    private Boolean deleteFlag;
}