package com.learning.spring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.learning.spring.Data.Foo;

public class BeanDuplicateTest {

    @Test
    void testCreateBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanDuplicateConfig.class);

        try {
        Assertions.assertAll(() -> {
            Foo tesFooPrimary = context.getBean("foo1",Foo.class);
            Assertions.assertNotNull(tesFooPrimary);
        });

        Foo tesFooPrimary = context.getBean(Foo.class);
        Foo tesFoo1 = context.getBean("foo1",Foo.class);
        Foo tesFoo2 = context.getBean("foo2",Foo.class);

        Assertions.assertSame(tesFooPrimary, tesFoo1);

        Assertions.assertNotSame(tesFoo1, tesFoo2);
        } finally {
            ((AbstractApplicationContext) context).close();
        }
    }
}
