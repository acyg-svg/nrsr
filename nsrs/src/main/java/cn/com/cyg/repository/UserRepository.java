package cn.com.cyg.repository;

import cn.com.cyg.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    public User findByAccount(String account);
}