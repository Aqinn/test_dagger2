package com.aqinn.test_dagger2;

import android.app.Application;

import com.aqinn.test_dagger2.component.ApplicationComponent;
import com.aqinn.test_dagger2.component.DaggerApplicationComponent;
import com.aqinn.test_dagger2.component.DaggerDataSourceComponent;
import com.aqinn.test_dagger2.component.DaggerMyServiceManagerComponent;
import com.aqinn.test_dagger2.component.DaggerShowManagerComponent;
import com.aqinn.test_dagger2.component.DataSourceComponent;
import com.aqinn.test_dagger2.component.MyServiceManagerComponent;
import com.aqinn.test_dagger2.component.ShowManagerComponent;







/**
 * @author Aqinn
 * @date 2020/12/28 2:58 AM
 */
public class MyApplication extends Application {

    private static final String TAG_SINGLE = "singleTest";
    private static ApplicationComponent applicationComponent;
    private static DataSourceComponent dataSourceComponent;
    private static MyServiceManagerComponent myServiceManagerComponent;
    private static ShowManagerComponent showManagerComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        dataSourceComponent = DaggerDataSourceComponent.create();
        showManagerComponent = DaggerShowManagerComponent.create();
        myServiceManagerComponent = DaggerMyServiceManagerComponent.create();
        applicationComponent = DaggerApplicationComponent.builder()
                .dataSourceComponent(dataSourceComponent)
                .showManagerComponent(showManagerComponent)
                .myServiceManagerComponent(myServiceManagerComponent)
                .build();
    }

    public static String getTagSingle() {
        return TAG_SINGLE;
    }

    public static ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
