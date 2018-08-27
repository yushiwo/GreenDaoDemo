package com.zr.greendaodemo;

import android.app.Application;

import com.zr.greendaodemo.helper.GreenDaoHelper;

/**
 * Created by zr on 2018/8/27.
 */

public class NyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        GreenDaoHelper.initDatabase(this);
    }
}
