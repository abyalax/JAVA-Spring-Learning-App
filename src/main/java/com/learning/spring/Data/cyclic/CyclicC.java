package com.learning.spring.Data.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CyclicC {
    private CyclicA cyclicA; 
}