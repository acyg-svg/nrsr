package cn.com.cyg.repository;

import cn.com.cyg.pojo.Freshman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FreshmanRepository extends JpaRepository<Freshman,Integer> {
    @Query(value="select * from tb_freshman where name like %:name%",nativeQuery=true)
    List<Freshman> findByCondition(String name);
}
