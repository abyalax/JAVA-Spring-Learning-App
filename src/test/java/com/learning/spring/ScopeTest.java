package com.learning.spring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.spring.Data.Bar;
import com.learning.spring.Data.Foo;

public class ScopeTest {
    
    private ApplicationContext applicationContext;

    @BeforeEach
    void setup() {
        applicationContext = new AnnotationConfigApplicationContext(ScopeConfiguration.class);
    }

    @Test
    void testScope() {
        Foo foo1 = applicationContext.getBean(Foo.class);
        Foo foo2 = applicationContext.getBean(Foo.class);
        Foo foo3 = applicationContext.getBean(Foo.class);
        
        Assertions.assertThat(foo1).isNotEqualTo(foo2);
        Assertions.assertThat(foo2).isNotEqualTo(foo3);
    }

    @Test
    void testDoubletonScope() {
        Bar bar1 = applicationContext.getBean(Bar.class);
        Bar bar2 = applicationContext.getBean(Bar.class);
        Bar bar3 = applicationContext.getBean(Bar.class);
        Bar bar4 = applicationContext.getBean(Bar.class);

        Assertions.assertThat(bar1).isNotEqualTo(bar2);
        Assertions.assertThat(bar2).isNotEqualTo(bar3);
        Assertions.assertThat(bar3).isNotEqualTo(bar4);
    }
}
