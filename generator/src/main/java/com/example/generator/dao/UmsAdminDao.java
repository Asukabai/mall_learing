package com.example.generator.dao;


import com.example.generator.domain.AdminRoleDto;
import com.example.generator.domain.ResourceWithCateDto;
import com.example.generator.domain.RoleStatDto;
import com.example.generator.mbg.model.UmsAdmin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description UmsAdmin自定义Dao
 */
public interface UmsAdminDao {

    List<RoleStatDto> groupList();

    AdminRoleDto selectWithRoleList(@Param("id") Long id);

    List<UmsAdmin> subList(@Param("roleId") Long roleId);

    ResourceWithCateDto selectResourceWithCate(@Param("id")Long id);
}
