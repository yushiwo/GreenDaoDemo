package com.example.mylibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.example.mylibrary.bean.Test;
import com.example.mylibrary.helper.GreenDaoHelper;
import com.example.mylibrary.manager.TestDBManager;
import java.util.List;

/**
 * @author yushiwo
 */
public class LibActivity extends AppCompatActivity {

    private Button insert;
    private Button delete;
    private Button update;
    private Button query;

    private TextView tv;

    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lib);

        GreenDaoHelper.initDatabase(this);

        initViews();

        setListeners();
    }

    private void initViews(){
        insert = (Button) findViewById(R.id.btn_insert);
        delete = (Button) findViewById(R.id.btn_delete);
        update = (Button) findViewById(R.id.btn_update);
        query = (Button) findViewById(R.id.btn_query);

        tv = (TextView) findViewById(R.id.tv);
    }

    private void setListeners() {
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index ++;
                Test user = new Test("18" + index);
                TestDBManager.getInstance().insert(user);
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TestDBManager.getInstance().deleteAll();
            }
        });

        query.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<Test> userList = TestDBManager.getInstance().queryAll();

                if (userList != null) {
                    tv.setText(userList.toString());
                }
            }
        });

    }
}
