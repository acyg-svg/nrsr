package cn.com.cyg.service;

import cn.com.cyg.pojo.Role;
import cn.com.cyg.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserService userService;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        //获取用户信息
        User user = userService.getUser(s);
        //获取该用户权限
        List<Role> authorities = userService.getUserAuthorities(s);
        //对用户权限进行封装
        List<SimpleGrantedAuthority> rollCollect = authorities.stream().map(authority -> new SimpleGrantedAuthority(authority.getRole())).collect(Collectors.toList());
        //定义用户详情类
        if (user!=null) {
            UserDetails userDetails = new org.springframework.security.core.userdetails.User(user.getAccount(), user.getPassword(), rollCollect);
            return userDetails;
        }else {
            throw new UsernameNotFoundException("账号不存在!");
        }
    }
}