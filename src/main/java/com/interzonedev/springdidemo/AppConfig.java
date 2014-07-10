package com.interzonedev.springdidemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Programmatic configuration for a Spring application context. Creates the "foo" and "bar" beans and component scans
 * the "implementingBean" bean.
 */
@Configuration("appConfig")
@ComponentScan("com.interzonedev.springdidemo")
public class AppConfig {

    @Bean(name = "foo")
    public String getFoo() {
        return "fooValue";
    }

    @Bean(name = "bar")
    public String getBar() {
        return "barValue";
    }

}
