package org.example.imp.predicatorImp;

import org.example.interfaces.Predicator;

public class UpTenImp implements Predicator<Integer> {
    public UpTenImp() {
    }

    @Override
    public boolean test(Integer value) {
        return value > 10;
    }
}

