package com.ss.score.module.score.domain.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 存储学校所属集团的信息CreateDTO
 *
 * @author ljh
 * @since 2025-02-03
 */
@Data
public class GroupCompanyCreateDTO {


    /**
     * 集团名称
     */
    private String name;

    /**
     * 集团总部地址
     */
    private String address;

    /**
     * 逻辑删除标志，0表示未删除，1表示已删除
     */
    @NotNull(message = "逻辑删除标志，0表示未删除，1表示已删除不得为空")
    private Boolean deleteFlag;
}