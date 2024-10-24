package com.learning.spring;

import org.assertj.core.api.Assertions;
// import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.spring.Data.Connection;
import com.learning.spring.Data.Server;

public class LifeCycleTest {
    
    private ConfigurableApplicationContext aplicationContext;

    @BeforeEach
    void setup() {
        aplicationContext = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
        aplicationContext.registerShutdownHook(); //jika sudah memakai ini maka tidak perlu method @AfterEach
    }

    // @AfterEach
    // void tearDown() {
    //     aplicationContext.close();
    // }

    @Test
    void testLifeCycle() {
        Connection connection = aplicationContext.getBean(Connection.class);
        Assertions.assertThat(connection).isNotNull();
    }

    @Test
    void testServerLifeCycle() {
        Server server = aplicationContext.getBean(Server.class);
        Assertions.assertThat(server).isNotNull();
    }
}
