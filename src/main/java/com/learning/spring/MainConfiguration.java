package com.learning.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.learning.spring.configuration.BarConfiguration;
import com.learning.spring.configuration.FooConfiguration;

@Configuration
@Import({
    FooConfiguration.class,
    BarConfiguration.class
})
public class MainConfiguration {

}
