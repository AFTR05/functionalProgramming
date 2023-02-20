package org.example.util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class CollectorUtil {
    public static <T> List<T> fillValues(Supplier<T> supplier,Integer count){
        List<T> values = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            values.add(supplier.get());
        }
        return values;
    }

    public static <T,R> List<R> transformValues(Function<T,R> function,List<T> values){
        List<R> result = new ArrayList<>();
        for(T value: values){
            result.add(function.apply(value));
        }
        return result;
    }

    public static <T,R> List<R> transform(Function<T,R> function,List<T> values){
        return values.stream().map(function::apply).collect(Collectors.toList());
    }

    public static <T> void print(List<T> values, Consumer<T> consumer){
        values.forEach(consumer::accept);
    }

    public static <T> List<T> filter(List<T> values, Predicate<T> predicate){
        return values.stream().filter(predicate::test).collect(Collectors.toList());
    }

    public static <T> T reduce(List<T> values, BinaryOperator<T> binaryOperator){
        return values.stream().reduce(binaryOperator::apply).get();
    }



}
