package com.aqinn.test_dagger2;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @Author Aqinn
 * @Date 2020/12/28 2:43 上午
 */
@Component(modules = DataSourceModule.class)
public interface DataSourceComponent {

    DataSource getDataSource();

}
