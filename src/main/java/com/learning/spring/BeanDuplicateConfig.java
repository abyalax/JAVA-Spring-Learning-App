package com.learning.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.learning.spring.Data.Foo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class BeanDuplicateConfig {
    
    @Primary
    @Bean
    public Foo foo1() {
        Foo foo = new Foo();
        log.info("Created new Foo");
        return foo;
    }
    @Bean
    public Foo foo2() {
        Foo foo = new Foo();
        log.info("Created new Foo");
        return foo;
    }
}
