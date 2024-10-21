package com.learning.spring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.spring.Data.Bar;
import com.learning.spring.Data.Foo;
import com.learning.spring.Data.FooBar;

public class DependencyInjectionTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    @SuppressWarnings("unused")
    void setup() {
        applicationContext = new AnnotationConfigApplicationContext(DependencyInjection.class);
    }

    @Test
    void testDependencyInjection() {
        Foo foo = applicationContext.getBean("fooSecond", Foo.class);
        Bar bar = applicationContext.getBean(Bar.class);
        FooBar fooBar = applicationContext.getBean(FooBar.class);
        Assertions.assertThat(foo).isEqualTo(fooBar.getFoo());
        Assertions.assertThat(bar).isEqualTo(fooBar.getBar());
    }

    @Test
    void testNoDependencyInjection() {
        Foo foo = new Foo();
        Bar bar = new Bar();
        FooBar fooBar = new FooBar(foo, bar);

        Assertions.assertThat(foo).isEqualTo(fooBar.getFoo());
        Assertions.assertThat(bar).isEqualTo(fooBar.getBar());

    }
}
