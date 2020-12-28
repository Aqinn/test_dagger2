package com.aqinn.test_dagger2.module;

import com.aqinn.test_dagger2.manager.DataSource;
import com.aqinn.test_dagger2.manager.ShowManager;

import dagger.Module;
import dagger.Provides;

/**
 * @Author Aqinn
 * @Date 2020/12/28 2:44 上午
 */
@Module
public class ShowManagerModule {

    @Provides
    ShowManager provideShowManager() {
        return new ShowManager();
    }

}
