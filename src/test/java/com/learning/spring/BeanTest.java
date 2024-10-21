package com.learning.spring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.spring.Data.Foo;

public class BeanTest {
    
    @Test
    void testCreateBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        Assertions.assertThat(context).isNotNull();
    }
    
    @SuppressWarnings("resource")
    @Test
    void testGetBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        Foo foo1 = context.getBean(Foo.class);
        Foo foo2 = context.getBean(Foo.class);

        Assertions.assertThat(foo1).isEqualTo(foo2);

    }
}
