package com.learning.spring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.spring.Data.Foo;

public class DependsOnTest {

    private ApplicationContext aplicationContext;

    @BeforeEach
    void setup() {
        aplicationContext = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);
    }

    @Test
    void testDependsOn() {
        Foo foo = aplicationContext.getBean(Foo.class);
        Assertions.assertThat(foo).isNotNull();
    } 
} 
