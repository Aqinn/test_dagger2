package com.aqinn.test_dagger2.module;

import com.aqinn.test_dagger2.manager.DataSource;
import com.aqinn.test_dagger2.manager.MyServiceManager;
import com.aqinn.test_dagger2.manager.ShowManager;

import dagger.Module;
import dagger.Provides;

/**
 * @Author Aqinn
 * @Date 2020/12/28 2:46 上午
 */
@Module
public class MyServiceManagerModule {

    @Provides
    MyServiceManager provideMyServiceManager() {
        return new MyServiceManager();
    }

}
