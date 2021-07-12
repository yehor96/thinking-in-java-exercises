package com.exercises.chapters.arrays.ex17;

import com.exercises.chapters.typeinfo.ex12.cofee.Generator;

import java.math.BigDecimal;

public class BigDecimalGenerator implements Generator<BigDecimal> {

    BigDecimal value = BigDecimal.valueOf(0);

    @Override
    public BigDecimal next() {
        value = value.add(BigDecimal.valueOf(1));
        return value;
    }
}
