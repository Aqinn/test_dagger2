package com.aqinn.test_dagger2;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @Author Aqinn
 * @Date 2020/12/28 2:45 上午
 */
@Component(modules = ShowManagerModule.class, dependencies = DataSourceComponent.class)
public interface ShowManagerComponent {

    ShowManager getShowManager();

}
