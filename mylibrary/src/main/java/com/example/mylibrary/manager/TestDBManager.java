package com.example.mylibrary.manager;

import com.example.mylibrary.bean.Test;
import com.example.mylibrary.helper.GreenDaoHelper;
import java.util.List;
import org.greenrobot.greendao.query.QueryBuilder;

/**
 * Created by zr on 2018/8/27.
 */

public class TestDBManager {

    private static TestDBManager instance;

    private TestDBManager() {
    }

    public static synchronized TestDBManager getInstance() {
        if (instance == null) {
            instance = new TestDBManager();
        }
        return instance;
    }

    public void insert(Test test) {
        GreenDaoHelper.getDaoSession().getTestDao().insert(test);
    }

    public void update(Test test) {
        GreenDaoHelper.getDaoSession().getTestDao().update(test);
    }

    public void deleteAll() {
        GreenDaoHelper.getDaoSession().getTestDao().deleteAll();
    }

    public List<Test> queryAll() {
        QueryBuilder<Test> builder =  GreenDaoHelper.getDaoSession().getTestDao().queryBuilder();
        return builder.build().list();
    }
}
