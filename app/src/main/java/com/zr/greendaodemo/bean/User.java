package com.zr.greendaodemo.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by zr on 2018/8/27.
 */

@Entity
public class User {
    @Id(autoincrement = true)
    private Long id;
    private String userName;
    private int age;
    private String gender;
    public User(String userName, int age, String gender) {
        this.userName = userName;
        this.age = age;
        this.gender = gender;
    }
    public User() {
    }
    @Generated(hash = 1778444354)
    public User(Long id, String userName, int age, String gender) {
        this.id = id;
        this.userName = userName;
        this.age = age;
        this.gender = gender;
    }

    

    public String getUserName() {
        return this.userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return this.gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return this.id;
    }
}
