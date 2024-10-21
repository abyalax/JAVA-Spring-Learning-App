package com.learning.spring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.spring.Data.Foo;

public class BeanNameTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setup() {
        applicationContext = new AnnotationConfigApplicationContext(BeanNameConfig.class);
    }

    @Test
    void testNameBean() {
        Foo foo = applicationContext.getBean(Foo.class);
        Foo foo1 = applicationContext.getBean("FooFirst",Foo.class);
        Foo foo2 = applicationContext.getBean("FooSecond",Foo.class);

        Assertions.assertThat(foo).isEqualTo(foo1);
        Assertions.assertThat(foo1).isNotEqualTo(foo2);
    }
}

