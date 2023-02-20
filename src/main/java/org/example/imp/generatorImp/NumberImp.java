package org.example.imp.generatorImp;

import org.example.interfaces.Generator;

import java.util.Random;
import java.util.function.Supplier;

public class NumberImp implements Generator {
    public NumberImp() {
    }

    @Override
    public Supplier generate() {
        return ()->new Random().nextInt(2,20);
    }
}
