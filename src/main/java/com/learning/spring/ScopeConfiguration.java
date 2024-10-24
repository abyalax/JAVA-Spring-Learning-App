package com.learning.spring;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.learning.spring.Data.Bar;
import com.learning.spring.Data.Foo;
import com.learning.spring.Data.scope.DoubletonScope;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class ScopeConfiguration {
    
    @Bean 
    @Scope("prototype")
    public Foo foo() {
        log.info("Created new Foo");
        return new Foo();
    }

    @Bean 
    public CustomScopeConfigurer customScopeConfigurer() {
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("double", new DoubletonScope());
        return configurer;
    }

    @Bean
    @Scope("double")
    public Bar bar() {
        log.info("Created new Bar");
        return new Bar();
    }
}
