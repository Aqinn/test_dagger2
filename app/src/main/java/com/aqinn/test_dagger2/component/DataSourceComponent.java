package com.aqinn.test_dagger2.component;

import com.aqinn.test_dagger2.manager.DataSource;
import com.aqinn.test_dagger2.module.DataSourceModule;

import dagger.Component;

/**
 * @Author Aqinn
 * @Date 2020/12/28 2:43 上午
 */
@Component(modules = DataSourceModule.class)
public interface DataSourceComponent {

    DataSource getDataSource();

}
