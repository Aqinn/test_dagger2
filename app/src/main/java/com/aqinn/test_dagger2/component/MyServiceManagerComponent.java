package com.aqinn.test_dagger2.component;

import com.aqinn.test_dagger2.manager.MyServiceManager;
import com.aqinn.test_dagger2.module.MyServiceManagerModule;

import dagger.Component;

/**
 * @Author Aqinn
 * @Date 2020/12/28 2:46 上午
 */
//@Component(modules = MyServiceManagerModule.class)
public interface MyServiceManagerComponent {

    MyServiceManager getMyServiceManager();

}
