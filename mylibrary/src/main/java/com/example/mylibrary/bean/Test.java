package com.example.mylibrary.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by zr on 2018/8/27.
 */

@Entity
public class Test {
    @Id(autoincrement = true)
    private Long id;
    private String namde;
    @Generated(hash = 1666205923)
    public Test(Long id, String namde) {
        this.id = id;
        this.namde = namde;
    }
    @Generated(hash = 372557997)
    public Test() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNamde() {
        return this.namde;
    }
    public void setNamde(String namde) {
        this.namde = namde;
    }
}
