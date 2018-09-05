package com.sodbvi.securitydb2.security;

import com.sodbvi.securitydb2.dao.PermissionDao;
import com.sodbvi.securitydb2.dao.UserDao;
import com.sodbvi.securitydb2.domain.Permission;
import com.sodbvi.securitydb2.domain.SysRole;
import com.sodbvi.securitydb2.domain.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sodbvi
 * Date: 2018-09-04 -15:40
 */
//自定义UserDetailsService 接口
@Service
public class CustomUserService implements UserDetailsService {

    @Autowired
    UserDao userDao;

    @Autowired
    PermissionDao permissionDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser user = userDao.findByUserName(username);
        if (user != null) {
            List<SysRole> sysRoles = permissionDao.findByAdminUserId(user.getId());
            List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            for (SysRole sysRole : sysRoles) {
                if (sysRole != null && sysRole.getName() != null) {
                    GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(sysRole.getName());
                    //1：此处将权限信息添加到 GrantedAuthority 对象中，在后面进行全权限验证时会使用GrantedAuthority 对象。
                    grantedAuthorities.add(grantedAuthority);
                }
            }
            return new User(user.getUsername(), user.getPassword(), grantedAuthorities);
        } else {
            throw new UsernameNotFoundException("admin: " + username + " do not exist!");
        }
    }
}

