package org.example.imp.predicatorImp;

import org.example.interfaces.Predicator;

public class BeginNImpl implements Predicator<String> {
    public BeginNImpl() {
    }

    @Override
    public boolean test(String value) {
        return value.startsWith("n");
    }
}
