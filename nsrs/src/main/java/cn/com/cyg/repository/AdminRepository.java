package cn.com.cyg.repository;

import cn.com.cyg.pojo.User;
import io.lettuce.core.StrAlgoArgs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AdminRepository extends JpaRepository<User,Integer> {
    @Transactional
    @Modifying
    @Query(value="update tb_user set account=:#{#user.account},password=:#{#user.password},role_id=:#{#user.roleId} where id=:#{#user.id}",nativeQuery=true)
     int updateById(User user);

    @Transactional
    @Modifying
    @Query(value="insert into tb_user(account,password,role_id) values(#{#user.account})",nativeQuery=true)
    int addUser(User user);

    public User findByAccount(String account);

    @Query(value="select * from tb_user where account like %:account%",nativeQuery=true)
    List<User> findByCondition(String account);

}