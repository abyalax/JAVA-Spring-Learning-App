package com.learning.spring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CyclicTest {

    @Test
    void testCyclic() {
        Assertions.assertThatThrownBy(() -> {
            ApplicationContext context = new AnnotationConfigApplicationContext(CyclicConfiguration.class);
            ((AnnotationConfigApplicationContext) context).close();
        }).isInstanceOf(Throwable.class);
    }
}
