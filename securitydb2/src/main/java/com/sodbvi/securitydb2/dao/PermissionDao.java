package com.sodbvi.securitydb2.dao;

import com.sodbvi.securitydb2.domain.Permission;
import com.sodbvi.securitydb2.domain.SysRole;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sodbvi
 * Date: 2018-09-05 -10:09
 */
public interface PermissionDao {
    public List<Permission> findAll();
    public List<SysRole> findByAdminUserId(int userId);
}
