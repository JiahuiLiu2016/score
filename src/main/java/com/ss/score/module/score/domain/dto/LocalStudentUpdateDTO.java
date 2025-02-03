package com.ss.score.module.score.domain.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 存储本校学生的基本信息UpdateDTO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class LocalStudentUpdateDTO {

    /**
     * 本校学生ID，自增主键
     */
    @NotNull(message = "本校学生ID，自增主键不得为空")
    private Long id;

    /**
     * 学生编号，唯一标识
     */
    private String studentId;

    /**
     * 学生姓名
     */
    private String name;

    /**
     * 学生性别
     */
    private String gender;

    /**
     * 所属学校ID
     */
    @NotNull(message = "所属学校ID不得为空")
    private Long schoolId;

    /**
     * 入学日期
     */
    @NotNull(message = "入学日期不得为空")
    private LocalDate enrollmentDate;

    /**
     * 毕业日期，为空表示未毕业
     */
    @NotNull(message = "毕业日期，为空表示未毕业不得为空")
    private LocalDate graduationDate;

    /**
     * 是否毕业，0表示未毕业，1表示已毕业
     */
    @NotNull(message = "是否毕业，0表示未毕业，1表示已毕业不得为空")
    private Boolean isGraduated;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @NotNull(message = "逻辑删除标志，0表示未删除，1表示已删除不得为空")
    private Boolean deleteFlag;
}