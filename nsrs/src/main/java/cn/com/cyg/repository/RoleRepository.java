package cn.com.cyg.repository;

import cn.com.cyg.pojo.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role,Integer> {
    @Query(value = "SELECT r.* from tb_user t,tb_role r where t.role_id = r.role_id and t.account=?",nativeQuery = true)
    List<Role> findAuthoritiesByAccount(String account);
}