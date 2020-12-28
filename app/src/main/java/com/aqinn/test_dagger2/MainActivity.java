package com.aqinn.test_dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static boolean flag = false;

    @Inject
    public DataSource dataSource;

    @Inject
    public MyServiceManager myServiceManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyApplication.getApplicationComponent().inject(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (!flag) {
            Log.d(MyApplication.getTagSingle(), "MainActivity: dataSource => " + dataSource);
            Log.d(MyApplication.getTagSingle(), "MainActivity: myServiceManager => " + myServiceManager);
            flag = true;
            startActivity(new Intent(this, SecondActivity.class));
        }
    }
}