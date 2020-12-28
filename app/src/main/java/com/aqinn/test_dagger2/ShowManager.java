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
        Log.d(MyApplication.getTagSingle(), CommonUtil.getFormatLog("ShowManager", "dataSource", dataSource));
    }

}
