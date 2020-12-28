package com.aqinn.test_dagger2.manager;

import android.util.Log;

import com.aqinn.test_dagger2.CommonUtil;
import com.aqinn.test_dagger2.MyApplication;

import javax.inject.Inject;

/**
 * @Author Aqinn
 * @Date 2020/12/28 2:34 上午
 */
public class MyServiceManager implements ServiceManager{

    @Inject
    public ShowManager showManager;

    @Inject
    public DataSource dataSource;

    public MyServiceManager() {
        MyApplication.getApplicationComponent().inject(this);
        Log.d(MyApplication.getTagSingle(), CommonUtil.getFormatLog("MyServiceManager", "dataSource", dataSource));
        Log.d(MyApplication.getTagSingle(), CommonUtil.getFormatLog("MyServiceManager", "showManager", showManager));
    }

}
