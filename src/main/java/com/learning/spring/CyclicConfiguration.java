package com.learning.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learning.spring.Data.cyclic.CyclicA;
import com.learning.spring.Data.cyclic.CyclicB;
import com.learning.spring.Data.cyclic.CyclicC;

@Configuration
public class CyclicConfiguration {

    @Bean
    public CyclicA cyclicA(CyclicB cyclicB) {
        return new CyclicA(cyclicB);
    }

    @Bean
    public CyclicB cyclicB(CyclicC cyclicC) {
        return new CyclicB(cyclicC);
    }
 
    @Bean
    public CyclicC cyclicC(CyclicA cyclicA) {
        return new CyclicC(cyclicA);
    }
}
