package com.ss.score.module.score.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ss.score.module.score.domain.dto.TeacherTransferCreateDTO;
import com.ss.score.module.score.domain.dto.TeacherTransferUpdateDTO;
import com.ss.score.module.score.domain.entity.TeacherTransfer;
import com.ss.score.module.score.domain.vo.TeacherTransferVO;

import java.util.List;

/**
 * 记录教师在一个学年内的调动信息 服务类
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface ITeacherTransferService extends IService<TeacherTransfer> {

    /**
     * 列表
     * @return list
     */
    List<TeacherTransferVO> listVO();

    /**
     * getByIdVO
     *
     * @param id id
     * @return vo
     */
    TeacherTransferVO getByIdVO(Long id);

    /**
     * 新增
     * @param dto TeacherTransferCreateDTO
     */
    void saveByDTO(TeacherTransferCreateDTO dto);

    /**
     * 更新
     * @param dto TeacherTransferUpdateDTO
     */
    void updateByDTO(TeacherTransferUpdateDTO dto);

    /**
     * 删除
     * @param id id
     */
    void deleteById(Long id);
}