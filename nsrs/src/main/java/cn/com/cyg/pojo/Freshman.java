package cn.com.cyg.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name="tb_freshman")
public class Freshman implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private String age;
    @Column(name = "sex")
    private String sex;
    @Column(name = "time")
    private String time;
    @Column(name = "major")
    private String major;
    @Column(name = "tele")
    private String tele;
    @Column(name = "room")
    private String room;
    @Column(name = "statuses")
    private String statuses;

    public Freshman() {
    }

    public Freshman(Integer id, String name, String age, String sex, String time, String major, String tele, String room, String statuses) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.time = time;
        this.major = major;
        this.tele = tele;
        this.room = room;
        this.statuses = statuses;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getStatuses() {
        return statuses;
    }

    public void setStatuses(String statuses) {
        this.statuses = statuses;
    }

    @Override
    public String toString() {
        return "Freshman{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", time='" + time + '\'' +
                ", major='" + major + '\'' +
                ", tele='" + tele + '\'' +
                ", room='" + room + '\'' +
                ", statuses='" + statuses + '\'' +
                '}';
    }
}
