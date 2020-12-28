package com.aqinn.test_dagger2.module;

import com.aqinn.test_dagger2.manager.DataSource;
import com.aqinn.test_dagger2.manager.MyDataSource;

import dagger.Module;
import dagger.Provides;

/**
 * @Author Aqinn
 * @Date 2020/12/28 2:42 上午
 */
@Module
public class DataSourceModule {

    @Provides
    DataSource provideDataSource() {
        return new MyDataSource();
    }

}
