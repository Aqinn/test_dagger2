package com.aqinn.test_dagger2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @Author Aqinn
 * @Date 2020/12/28 2:42 上午
 */
@Module
public class DataSourceModule {

    @Singleton
    @Provides
    DataSource provideDataSource() {
        return new MyDataSource();
    }

}
