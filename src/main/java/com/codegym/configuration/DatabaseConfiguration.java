package com.codegym.configuration;

import com.codegym.utility.DotEnvUtility;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfiguration {
    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .driverClassName(DotEnvUtility.getDotenv().get("DB_DRIVER"))
                .url(DotEnvUtility.getDotenv().get("DB_URL"))
                .username(DotEnvUtility.getDotenv().get("DB_USERNAME"))
                .password(DotEnvUtility.getDotenv().get("DB_PASSWORD"))
                .build();
    }
}
