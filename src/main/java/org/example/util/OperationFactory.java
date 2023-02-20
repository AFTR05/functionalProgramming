package org.example.util;

import org.example.enums.FilterEnum;
import org.example.enums.FunctionEnum;
import org.example.enums.GenerateEnum;
import org.example.imp.functionatorImp.SquareImp;
import org.example.imp.functionatorImp.UpperCaseImp;
import org.example.imp.generatorImp.NumberImp;
import org.example.imp.generatorImp.StringImp;
import org.example.imp.predicatorImp.BeginNImpl;
import org.example.imp.predicatorImp.UpTenImp;
import org.example.interfaces.Functionator;
import org.example.interfaces.Generator;
import org.example.interfaces.Predicator;

import java.io.File;

public class OperationFactory {
    public static Generator getGeneratorOperation(GenerateEnum generateEnum){
        return switch (generateEnum){
            case GENERATE_NUMBER ->new NumberImp();
            case GENERATE_STRING ->new StringImp();
        };
    }

    public static Predicator getPredicateOperation(FilterEnum filterEnum){
        return switch (filterEnum){
            case UPTEN_FILTER -> new UpTenImp();
            case NBEGIN_FILTER -> new BeginNImpl();
        };
    }

    public static Functionator getFunctionatorOperation(FunctionEnum functionEnum){
        return switch (functionEnum){
            case SQUARE -> new SquareImp();
            case UPPERCASE -> new UpperCaseImp();
        };
    }
}
