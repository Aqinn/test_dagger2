package com.aqinn.test_dagger2.manager;

import android.util.Log;

import com.aqinn.test_dagger2.CommonUtil;
import com.aqinn.test_dagger2.MyApplication;

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
