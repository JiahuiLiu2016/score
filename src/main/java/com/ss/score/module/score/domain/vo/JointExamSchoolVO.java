package com.ss.score.module.score.domain.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 记录参与联考的学校信息VO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class JointExamSchoolVO {

    /**
     * 联考学校关联ID，自增主键
     */
    private Long id;

    /**
     * 联考ID
     */
    private Long jointExamId;

    /**
     * 学校ID
     */
    private Long schoolId;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    private Boolean deleteFlag;
}