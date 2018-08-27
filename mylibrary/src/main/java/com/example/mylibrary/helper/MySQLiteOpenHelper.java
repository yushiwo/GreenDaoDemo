package com.example.mylibrary.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.example.mylibrary.db.DaoMaster;
import com.example.mylibrary.db.TestDao;
import org.greenrobot.greendao.database.Database;

/**
 * @author : yushiwo
 * @e-mail : zhengrui@otcbtc.com
 * @time : 2018/08/27
 * @desc :
 */
public class MySQLiteOpenHelper extends DaoMaster.OpenHelper {
    public MySQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, name, factory);
    }
    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {
        MigrationHelper.migrate(db, new MigrationHelper.ReCreateAllTableListener() {

            @Override
            public void onCreateAllTables(Database db, boolean ifNotExists) {
                DaoMaster.createAllTables(db, ifNotExists);
            }

            @Override
            public void onDropAllTables(Database db, boolean ifExists) {
                DaoMaster.dropAllTables(db, ifExists);
            }
        },TestDao.class);
    }
}
