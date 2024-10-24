package com.learning.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learning.spring.Data.Connection;
import com.learning.spring.Data.Server;

@Configuration
public class LifeCycleConfiguration {
    
    @Bean 
    public Connection connection() {
        return new Connection();
    }

    // @Bean(initMethod = "start", destroyMethod = "stop")
    @Bean
    public Server server() {
        return new Server();
    }
}
