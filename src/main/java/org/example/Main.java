package org.example;

import org.example.util.CollectorUtil;
import org.example.util.StringBuild;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>(CollectorUtil.fillValues(()->new Random().nextInt(2,20),10));
        ArrayList<String> stringArrayList=new ArrayList<>(CollectorUtil.fillValues(()-> StringBuild.cadenaAleatoria(3),10));
        ArrayList<Integer> nuevalista1=new ArrayList<>(CollectorUtil.transform(value->value*value,arrayList));
        ArrayList<Integer> nuevalista=new ArrayList<>(CollectorUtil.transformValues(value->value*value,arrayList));
        System.out.println(nuevalista);
        ArrayList<Integer> filtrando=new ArrayList<>(CollectorUtil.filter(arrayList,value->value>10));
        Integer sis=CollectorUtil.reduce(arrayList,(value1,value2)->value1+value2);
        System.out.println(arrayList);
        System.out.println(sis);

    }
}