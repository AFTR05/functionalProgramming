package org.example.interfaces;

import java.util.function.Supplier;

@FunctionalInterface
public interface Generator<T> {
    Supplier<T> generate();
}
