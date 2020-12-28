package com.aqinn.test_dagger2.component;

import com.aqinn.test_dagger2.ApplicationScope;
import com.aqinn.test_dagger2.MainActivity;
import com.aqinn.test_dagger2.manager.MyServiceManager;
import com.aqinn.test_dagger2.SecondActivity;
import com.aqinn.test_dagger2.manager.ShowManager;
import com.aqinn.test_dagger2.module.DataSourceModule;
import com.aqinn.test_dagger2.module.MyServiceManagerModule;
import com.aqinn.test_dagger2.module.ShowManagerModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author Aqinn
 * @date 2020/12/28 4:19 AM
 */
@Singleton
@Component(modules = {DataSourceModule.class, ShowManagerModule.class, MyServiceManagerModule.class})
public interface ApplicationComponent {

    void inject(MainActivity mainActivity);

    void inject(SecondActivity secondActivity);

    void inject(ShowManager showManager);

    void inject(MyServiceManager myServiceManager);

}
