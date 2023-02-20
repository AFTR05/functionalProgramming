package org.example.imp.generatorImp;

import org.example.interfaces.Generator;
import org.example.util.StringBuild;

import java.util.function.Supplier;

public class StringImp implements Generator {
    public StringImp() {
    }

    @Override
    public Supplier generate() {
        return ()-> StringBuild.cadenaAleatoria(3);
    }
}
