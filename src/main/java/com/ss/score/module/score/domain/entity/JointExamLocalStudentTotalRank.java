package com.ss.score.module.score.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 记录联考时本校学生的总分排名信息
 *
 * @author ljh
 * @since 2025-02-03
 */
@Getter
@Setter
@TableName("`score`.joint_exam_local_student_total_rank")
public class JointExamLocalStudentTotalRank implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 排名记录ID，自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 本校学生ID
     */
    @TableField("local_student_id")
    private Long localStudentId;

    /**
     * 联考ID
     */
    @TableField("joint_exam_id")
    private Long jointExamId;

    /**
     * 总分排名
     */
    @TableField("total_rank")
    private Integer totalRank;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @TableField("delete_flag")
    @TableLogic
    private Boolean deleteFlag;
}