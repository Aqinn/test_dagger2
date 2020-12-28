package com.aqinn.test_dagger2.component;

import com.aqinn.test_dagger2.MainActivity;
import com.aqinn.test_dagger2.manager.MyServiceManager;
import com.aqinn.test_dagger2.SecondActivity;
import com.aqinn.test_dagger2.manager.ShowManager;

import dagger.Component;

/**
 * @author Aqinn
 * @date 2020/12/28 4:19 AM
 */
@Component(dependencies = {DataSourceComponent.class, ShowManagerComponent.class, MyServiceManagerComponent.class})
public interface ApplicationComponent {

    void inject(MainActivity mainActivity);

    void inject(SecondActivity secondActivity);

    void inject(ShowManager showManager);

    void inject(MyServiceManager myServiceManager);

}
