package com.aqinn.test_dagger2;

import dagger.Component;

/**
 * @author Aqinn
 * @date 2020/12/28 4:19 AM
 */
@ApplicationScope
@Component(dependencies = {DataSourceComponent.class, ShowManagerComponent.class, MyServiceManagerComponent.class})
public interface ApplicationComponent {

    void inject(MainActivity mainActivity);

    void inject(SecondActivity secondActivity);

    void inject(ShowManager showManager);

    void inject(MyServiceManager myServiceManager);

}
