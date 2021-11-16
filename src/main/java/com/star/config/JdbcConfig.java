package com.star.config;


//import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

//@Configuration
//@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig {
//    @Bean
//    public DataSource dataSource(JdbcProperties jdbcProperties) {
//        DruidDataSource druidDataSource = new DruidDataSource();
//        druidDataSource.setDriverClassName(jdbcProperties.getDriverClassName());
//        druidDataSource.setUrl(jdbcProperties.getUrl());
//        druidDataSource.setUsername(jdbcProperties.getUsername());
//        druidDataSource.setPassword(jdbcProperties.getPassword());
//        return druidDataSource;
//    }
}