package com.aqinn.test_dagger2;

import dagger.Component;

/**
 * @Author Aqinn
 * @Date 2020/12/28 2:46 上午
 */
@Component(modules = MyServiceManagerModule.class, dependencies = {DataSourceComponent.class, ShowManagerComponent.class})
public interface MyServiceManagerComponent {

    MyServiceManager getMyServiceManager();

}
