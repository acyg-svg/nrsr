package cn.com.cyg.service;

import cn.com.cyg.pojo.Role;
import cn.com.cyg.pojo.User;
import cn.com.cyg.repository.RoleRepository;
import cn.com.cyg.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private RedisTemplate redisTemplate;

    public User getUser(String account){
        User user=null;
        Object obj = redisTemplate.opsForValue().get("user_"+account);
        if (obj!=null){
            user = (User) obj;
        }else {
            user = userRepository.findByAccount(account);
            if (user!=null){
                redisTemplate.opsForValue().set("user_"+account,user);//redis->jpa
            }
        }
        System.out.println("getuser:"+user);
        return user;
    }
    //根据账号查询你用户权限（角色）
    public List<Role> getUserAuthorities(String account){
        List<Role> authorities = null;
        Object obj = redisTemplate.opsForValue().get("authorities_"+account);
        System.out.println(obj);
        if (obj!=null){
            authorities = (List<Role>) obj;
        }else {
            System.out.println("aaa:"+roleRepository.findAuthoritiesByAccount(account));
            authorities = roleRepository.findAuthoritiesByAccount(account);
            if (authorities!=null){
                redisTemplate.opsForValue().set("authorities_"+account,authorities);
            }
        }
        System.out.println("getUserAuthorities:"+authorities);
        return authorities;
    }
}