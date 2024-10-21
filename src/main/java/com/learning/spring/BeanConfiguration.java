package com.learning.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learning.spring.Data.Foo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class BeanConfiguration {
    
    @Bean
    public Foo foo() {
        Foo foo = new Foo();
        log.info("Created new Foo");
        return foo;
    }
}
