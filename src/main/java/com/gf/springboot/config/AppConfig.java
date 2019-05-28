package com.gf.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
public class AppConfig {

    @Value(value = "spring")
    public String name;
}
