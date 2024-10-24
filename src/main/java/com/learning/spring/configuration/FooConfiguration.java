package com.learning.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.learning.spring.Data.Foo;

@Configuration
public class FooConfiguration {
    
    @Bean
    public Foo foo() {
        return new Foo();
    }
}
