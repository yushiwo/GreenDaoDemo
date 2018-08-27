package com.zr.greendaodemo.helper;

import android.content.Context;

import com.zr.greendaodemo.db.DaoMaster;
import com.zr.greendaodemo.db.DaoSession;
import org.greenrobot.greendao.database.Database;

/**
 * @author zr
 * @date 2018/8/27
 */

public class GreenDaoHelper {

    /**
     * 是否加密
     */
    public static final boolean ENCRYPTED = true;

    private static final String DB_NAME = "cache-db";
    private static final String PASSWORD = "123456";

    private static MySQLiteOpenHelper devOpenHelper;
    private static Database database;
    private static DaoMaster daoMaster;
    private static DaoSession daoSession;

    /**
     * 初始化greenDao 建议放在Application 中进行
     */

    public static void initDatabase(Context context) {
        // 通过 DaoMaster 的内部类 DevOpenHelper，你可以得到一个便利的 SQLiteOpenHelper 对象。
        // 可能你已经注意到了，你并不需要去编写「CREATE TABLE」这样的 SQL 语句，因为 greenDAO 已经帮你做了。
        // 注意：默认的 DaoMaster.DevOpenHelper 会在数据库升级时，删除所有的表，意味着这将导致数据的丢失。
        // 所以，在正式的项目中，你还应该做一层封装，来实现数据库的安全升级。
        devOpenHelper = new MySQLiteOpenHelper(context, DB_NAME, null);
        database = getWritableDatabase(context, DB_NAME, PASSWORD);
        // 注意：该数据库连接属于 DaoMaster，所以多个 Session 指的是相同的数据库连接。
        daoMaster = getDaoMaster(context, DB_NAME, PASSWORD);
        daoSession = getDaoSession(context, DB_NAME, PASSWORD);
    }


    /**
     * 获取可读数据库
     */
    private static Database getReadableDatabase(Context context, String dbName, String passwprd) {
        if (ENCRYPTED) {
            // 加密
            return devOpenHelper.getEncryptedReadableDb(passwprd);
        } else {
            return devOpenHelper.getReadableDb();
        }
    }

    /**
     * 获取可写数据库
     */
    private static Database getWritableDatabase(Context context, String dbName, String passwprd) {
        if (ENCRYPTED) {
            //加密
            return devOpenHelper.getEncryptedWritableDb(passwprd);
        } else {
            return devOpenHelper.getWritableDb();
        }
    }

    /**
     * 获取DaoMaster
     */
    private static DaoMaster getDaoMaster(Context context, String dbName, String password) {
        if (null == daoMaster) {
            synchronized (GreenDaoHelper.class) {
                if (null == daoMaster) {
                    daoMaster = new DaoMaster(getWritableDatabase(context, dbName, password));
                }
            }
        }
        return daoMaster;
    }

    /**
     * 获取DaoSession
     */
    private static DaoSession getDaoSession(Context context, String dbName, String password) {
        if (null == daoSession) {
            synchronized (GreenDaoHelper.class) {
                if (null == daoMaster) {
                    daoMaster = new DaoMaster(getWritableDatabase(context, dbName, password));
                }

                daoSession = daoMaster.newSession();
            }
        }

        return daoSession;
    }


    public static DaoSession getDaoSession() {
        return daoSession;
    }

    public static Database getDb() {
        return database;
    }
}

