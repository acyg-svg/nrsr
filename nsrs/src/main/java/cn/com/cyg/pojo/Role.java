package cn.com.cyg.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name="tb_role")
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;//用户ID
    private String role;//角色
    @Column(name = "role_id")
    private Integer roleId;//角色ID

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", role='" + role + '\'' +
                ", roleId=" + roleId +
                '}';
    }
}
