package com.ss.score.module.score.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ss.score.module.score.domain.dto.GroupCompanyCreateDTO;
import com.ss.score.module.score.domain.dto.GroupCompanyUpdateDTO;
import com.ss.score.module.score.domain.entity.GroupCompany;
import com.ss.score.module.score.domain.vo.GroupCompanyVO;
import com.ss.score.module.score.mapper.GroupCompanyMapper;
import com.ss.score.module.score.service.IGroupCompanyService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 存储学校所属集团的信息 服务实现类
 *
 * @author ljh
 * @since 2025-02-03
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class GroupCompanyServiceImpl extends ServiceImpl<GroupCompanyMapper, GroupCompany> implements IGroupCompanyService {

    @Override
    public List<GroupCompanyVO> listVO() {
        return baseMapper.selectListVO();
    }

    @Override
    public GroupCompanyVO getByIdVO(Long id) {
        return baseMapper.selectByIdVO(id);
    }

    @Override
    public void saveByDTO(GroupCompanyCreateDTO dto) {
        GroupCompany entity = new GroupCompany();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.insert(entity);
    }

    @Override
    public void updateByDTO(GroupCompanyUpdateDTO dto) {
        GroupCompany entity = new GroupCompany();
        BeanUtils.copyProperties(dto, entity);
        baseMapper.updateById(entity);
    }

    @Override
    public void deleteById(Long id) {
        baseMapper.deleteById(id);
    }
}
