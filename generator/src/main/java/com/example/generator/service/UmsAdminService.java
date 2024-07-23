package com.example.generator.service;


import com.example.generator.domain.AdminRoleDto;
import com.example.generator.domain.ResourceWithCateDto;
import com.example.generator.domain.RoleStatDto;
import com.example.generator.mbg.model.UmsAdmin;

import java.util.List;

/**
 * @description 后台用户管理Service
 */
public interface UmsAdminService {
    void create(UmsAdmin entity);

    void update(UmsAdmin entity);

    void delete(Long id);

    UmsAdmin select(Long id);

    List<UmsAdmin> listAll(Integer pageNum, Integer pageSize);

    List<UmsAdmin> list(Integer pageNum, Integer pageSize, String username, List<Integer> statusList);

    List<UmsAdmin> subList(Long roleId);

    List<RoleStatDto> groupList();

    void deleteByUsername(String username);

    void updateByIds(List<Long> ids,Integer status);

    AdminRoleDto selectWithRoleList(Long id);

    ResourceWithCateDto selectResourceWithCate(Long id);
}
