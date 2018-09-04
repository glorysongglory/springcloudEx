package com.sodbvi.securitydb1.dao;

import com.sodbvi.securitydb1.domain.SysUser;

/**
 * Created with IntelliJ IDEA.
 * User: sodbvi
 * Date: 2018-09-04 -15:34
 */
public interface UserDao {
    public SysUser findByUserName(String username);
}
