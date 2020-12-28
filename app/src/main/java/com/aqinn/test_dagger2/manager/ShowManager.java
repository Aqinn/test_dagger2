package com.aqinn.test_dagger2.manager;

import android.util.Log;

import com.aqinn.test_dagger2.CommonUtil;
import com.aqinn.test_dagger2.MyApplication;

import javax.inject.Inject;

/**
 * @Author Aqinn
 * @Date 2020/12/28 2:34 上午
 */
public class ShowManager {

    @Inject
    public DataSource dataSource;

    public ShowManager() {
        MyApplication.getApplicationComponent().inject(this);
        Log.d(MyApplication.getTagSingle(), CommonUtil.getFormatLog("ShowManager", "dataSource", dataSource));
    }

}
