package com.zr.greendaodemo.manager;

import com.zr.greendaodemo.bean.User;
import com.zr.greendaodemo.helper.GreenDaoHelper;

import org.greenrobot.greendao.query.QueryBuilder;

import java.util.List;

/**
 * Created by zr on 2018/8/27.
 */

public class UserDBManager {

    private static UserDBManager instance;

    private UserDBManager() {
    }

    public static synchronized UserDBManager getInstance() {
        if (instance == null) {
            instance = new UserDBManager();
        }
        return instance;
    }

    public void insert(User user) {
        GreenDaoHelper.getDaoSession().getUserDao().insert(user);
    }

    public void update(User user) {
        GreenDaoHelper.getDaoSession().getUserDao().update(user);
    }

    public void deleteAll() {
        GreenDaoHelper.getDaoSession().getUserDao().deleteAll();
    }

    public List<User> queryAll() {
        QueryBuilder<User> builder =  GreenDaoHelper.getDaoSession().getUserDao().queryBuilder();
        return builder.build().list();
    }
}
