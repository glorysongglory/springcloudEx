package com.sodbvi.securitydb2.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;

/**
 * Created with IntelliJ IDEA.
 * User: sodbvi
 * Date: 2018-09-04 -15:31
 */
@Configuration
@ComponentScan
public class TransactionConfig implements TransactionManagementConfigurer {
    @Autowired
    private DataSource dataSource;

    @Bean(name = "transactionManager")
    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }

}
