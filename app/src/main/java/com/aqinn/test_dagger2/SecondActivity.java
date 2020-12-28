package com.aqinn.test_dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {

    @Inject
    public DataSource dataSource;

    @Inject
    public MyServiceManager myServiceManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        MyApplication.getApplicationComponent().inject(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(MyApplication.getTagSingle(), "SecondActivity: dataSource => " + dataSource);
        Log.d(MyApplication.getTagSingle(), "SecondActivity: myServiceManager => " + myServiceManager);
        startActivity(new Intent(this, MainActivity.class));
    }
}