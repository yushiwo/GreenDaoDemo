package com.zr.greendaodemo.dto;

/**
 * @author : yushiwo
 * @e-mail : zhengrui@otcbtc.com
 * @time : 2018/08/28
 * @desc :
 */
public class UserDto {

    private String name;
    private String email;
    private String sn;

    private int age;

    public UserDto(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }
}
