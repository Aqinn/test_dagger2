package com.aqinn.test_dagger2;

import android.app.Application;

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
        showManagerComponent = DaggerShowManagerComponent.builder()
                .dataSourceComponent(dataSourceComponent)
                .build();
        myServiceManagerComponent = DaggerMyServiceManagerComponent.builder()
                .dataSourceComponent(dataSourceComponent).showManagerComponent(showManagerComponent).build();
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
