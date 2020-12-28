package com.aqinn.test_dagger2;

import dagger.Module;
import dagger.Provides;

/**
 * @Author Aqinn
 * @Date 2020/12/28 2:46 上午
 */
@Module
public class MyServiceManagerModule {

    @Provides
    MyServiceManager provideMyServiceManager(DataSource dataSource, ShowManager showManager) {
        return new MyServiceManager(dataSource, showManager);
    }

}
