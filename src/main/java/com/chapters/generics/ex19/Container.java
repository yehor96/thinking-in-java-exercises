package com.chapters.generics.ex19;

import com.chapters.generics.ex18.Generators;

import java.util.ArrayList;

public class Container extends ArrayList<Product> {
    public Container(int nProducts) {
        Generators.fill(this, Product.generator, nProducts);
    }
}
