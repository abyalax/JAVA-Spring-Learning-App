package com.learning.spring.Data.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CyclicB {

    private CyclicC cyclicC;
}