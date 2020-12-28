package com.aqinn.test_dagger2;

import android.app.Application;

import com.aqinn.test_dagger2.component.ApplicationComponent;
import com.aqinn.test_dagger2.component.DaggerApplicationComponent;
import com.aqinn.test_dagger2.component.DataSourceComponent;
import com.aqinn.test_dagger2.component.MyServiceManagerComponent;
import com.aqinn.test_dagger2.component.ShowManagerComponent;
import com.aqinn.test_dagger2.module.DataSourceModule;
import com.aqinn.test_dagger2.module.MyServiceManagerModule;
import com.aqinn.test_dagger2.module.ShowManagerModule;


/**
 * @author Aqinn
 * @date 2020/12/28 2:58 AM
 */
public class MyApplication extends Application {

    private static final String TAG_SINGLE = "singleTest";
    private static ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder()
                .dataSourceModule(new DataSourceModule())
                .showManagerModule(new ShowManagerModule())
                .myServiceManagerModule(new MyServiceManagerModule())
                .build();
    }

    public static String getTagSingle() {
        return TAG_SINGLE;
    }

    public static ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
