package com.aqinn.test_dagger2.component;

import com.aqinn.test_dagger2.manager.ShowManager;
import com.aqinn.test_dagger2.module.ShowManagerModule;

import dagger.Component;

/**
 * @Author Aqinn
 * @Date 2020/12/28 2:45 上午
 */
@Component(modules = ShowManagerModule.class, dependencies = DataSourceComponent.class)
public interface ShowManagerComponent {

    ShowManager getShowManager();

}
