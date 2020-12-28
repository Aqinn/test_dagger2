package com.aqinn.test_dagger2;

import android.util.Log;

import javax.inject.Inject;

/**
 * @Author Aqinn
 * @Date 2020/12/28 2:34 上午
 */
public class MyServiceManager implements ServiceManager{

    public ShowManager showManager;

    public DataSource dataSource;


    public MyServiceManager(DataSource dataSource, ShowManager showManager) {
        this.dataSource = dataSource;
        this.showManager = showManager;
//        MyApplication.getApplicationComponent().inject(this);
        Log.d(MyApplication.getTagSingle(), "MyServiceManager: dataSource => " + dataSource);
        Log.d(MyApplication.getTagSingle(), "MyServiceManager: showManager => " + showManager);
    }

}
