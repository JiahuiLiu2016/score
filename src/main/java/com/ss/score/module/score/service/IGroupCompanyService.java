package com.ss.score.module.score.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ss.score.module.score.domain.dto.GroupCompanyCreateDTO;
import com.ss.score.module.score.domain.dto.GroupCompanyUpdateDTO;
import com.ss.score.module.score.domain.entity.GroupCompany;
import com.ss.score.module.score.domain.vo.GroupCompanyVO;

import java.util.List;

/**
 * 存储学校所属集团的信息 服务类
 *
 * @author ljh
 * @since 2025-02-03
 */
public interface IGroupCompanyService extends IService<GroupCompany> {

    /**
     * 列表
     * @return list
     */
    List<GroupCompanyVO> listVO();

    /**
     * getByIdVO
     *
     * @param id id
     * @return vo
     */
    GroupCompanyVO getByIdVO(Long id);

    /**
     * 新增
     * @param dto GroupCompanyCreateDTO
     */
    void saveByDTO(GroupCompanyCreateDTO dto);

    /**
     * 更新
     * @param dto GroupCompanyUpdateDTO
     */
    void updateByDTO(GroupCompanyUpdateDTO dto);

    /**
     * 删除
     * @param id id
     */
    void deleteById(Long id);
}