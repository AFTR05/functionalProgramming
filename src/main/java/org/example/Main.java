package org.example;

import org.example.enums.FilterEnum;
import org.example.enums.FunctionEnum;
import org.example.enums.GenerateEnum;
import org.example.util.CollectorUtil;
import org.example.util.OperationFactory;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<Integer>(CollectorUtil.fillValues(OperationFactory.getGeneratorOperation(GenerateEnum.GENERATE_NUMBER).generate(),10));
        ArrayList<String> stringArrayList=new ArrayList<String>(CollectorUtil.fillValues(OperationFactory.getGeneratorOperation(GenerateEnum.GENERATE_STRING).generate(),10));
        ArrayList<Integer> listaSquare=new ArrayList<>(CollectorUtil.transform(x->x*=x,arrayList));
        System.out.println(listaSquare);
        ArrayList<Integer> filtrando=new ArrayList<>(CollectorUtil.filter(arrayList,x->OperationFactory.getPredicateOperation(FilterEnum.UPTEN_FILTER).test(x)));
        ArrayList<String> stringsFiltered=new ArrayList<>(CollectorUtil.filter(stringArrayList,x->OperationFactory.getPredicateOperation(FilterEnum.NBEGIN_FILTER).test(x)));
        Integer sis=CollectorUtil.reduce(arrayList,(value1,value2)->value1+value2);
        System.out.println(filtrando);
        System.out.println(sis);

    }
}