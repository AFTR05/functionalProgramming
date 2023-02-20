package org.example.imp.functionatorImp;

import org.example.interfaces.Functionator;

public class UpperCaseImp implements Functionator<String> {
    public UpperCaseImp() {
    }

    @Override
    public void transform(String s) {
        s.toUpperCase();
    }
}
