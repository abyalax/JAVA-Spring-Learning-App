package com.learning.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.learning.spring.Data.Foo;

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
}
