package org.example.imp.functionatorImp;

import org.example.interfaces.Functionator;

public class SquareImp implements Functionator<Integer> {
    public SquareImp() {
    }

    @Override
    public void transform(Integer value) {
        value*=value;
    }
}
