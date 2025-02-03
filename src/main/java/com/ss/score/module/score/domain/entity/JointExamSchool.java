package com.ss.score.module.score.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 记录参与联考的学校信息
 *
 * @author ljh
 * @since 2025-02-03
 */
@Getter
@Setter
@TableName("`score`.joint_exam_school")
public class JointExamSchool implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 联考学校关联ID，自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 联考ID
     */
    @TableField("joint_exam_id")
    private Long jointExamId;

    /**
     * 学校ID
     */
    @TableField("school_id")
    private Long schoolId;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @TableField("delete_flag")
    @TableLogic
    private Boolean deleteFlag;
}