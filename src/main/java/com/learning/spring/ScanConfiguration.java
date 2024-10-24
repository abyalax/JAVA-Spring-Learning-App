package com.learning.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.learning.spring.configuration")
public class ScanConfiguration {
    
}
