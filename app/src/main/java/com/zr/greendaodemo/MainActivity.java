package com.zr.greendaodemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.example.mylibrary.LibActivity;
import com.zr.greendaodemo.bean.User;
import com.zr.greendaodemo.manager.UserDBManager;

import java.util.List;

/**
 * @author zr
 */
public class MainActivity extends AppCompatActivity {

    private Button insert;
    private Button delete;
    private Button update;
    private Button query;
    private Button jump;

    private TextView tv;

    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        setListeners();
    }

    private void initViews(){
        insert = (Button) findViewById(R.id.btn_insert);
        delete = (Button) findViewById(R.id.btn_delete);
        update = (Button) findViewById(R.id.btn_update);
        query = (Button) findViewById(R.id.btn_query);
        jump = (Button) findViewById(R.id.btn_jump);

        tv = (TextView) findViewById(R.id.tv);
    }

    private void setListeners() {
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index ++;
                User user = new User("zr" + index, 18 + index, "M");
                UserDBManager.getInstance().insert(user);
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UserDBManager.getInstance().deleteAll();
            }
        });

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User user = new User(3L,"zr" + index, 18 + index, "F", 180);
                UserDBManager.getInstance().update(user);
            }
        });

        query.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<User> userList = UserDBManager.getInstance().queryAll();

                if (userList != null) {
                    tv.setText(userList.toString());
                }
            }
        });

        jump.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // 创建需要启动的Activity对应的Intent
                Intent intent = new Intent(MainActivity.this,LibActivity.class);
                startActivity(intent);
            }
        });
    }
}
