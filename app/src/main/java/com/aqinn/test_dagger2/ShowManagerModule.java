package com.aqinn.test_dagger2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @Author Aqinn
 * @Date 2020/12/28 2:44 上午
 */
@Module
public class ShowManagerModule {

    @Provides
    ShowManager provideShowManager(DataSource dataSource) {
        return new ShowManager(dataSource);
    }

}
