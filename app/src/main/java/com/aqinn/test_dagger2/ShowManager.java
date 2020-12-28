package com.aqinn.test_dagger2;

import android.util.Log;

import javax.inject.Inject;

/**
 * @Author Aqinn
 * @Date 2020/12/28 2:34 上午
 */
public class ShowManager {

    public DataSource dataSource;

    public ShowManager(DataSource dataSource) {
        this.dataSource = dataSource;
//        MyApplication.getApplicationComponent().inject(this);
        Log.d(MyApplication.getTagSingle(), "ShowManager: dataSource => " + dataSource);
    }

}
