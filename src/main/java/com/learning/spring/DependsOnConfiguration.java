package com.learning.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

import com.learning.spring.Data.Bar;
import com.learning.spring.Data.Foo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class DependsOnConfiguration {
    
    @Lazy
    @Bean 
    @DependsOn("bar")
    public Foo foo() {
        log.info("Created new Foo");
        return new Foo();
    }

    @Bean 
    public Bar bar() {
        log.info("Created new Bar");
        return new Bar();
    }
}
