package com.blog;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class A {
    public static void main(String[] args) {
//        Function<Integer, String> myFunction = i->"Result: "+i;
//        String value = myFunction.apply(100);
//        System.out.println(value);

//        Function<Integer, Double> myFunction = i->i*1.3;
//        Double value = myFunction.apply(100);
//        System.out.println(value);

//        Supplier<String> mySupplier = ()->"Supplied value";
//        String s = mySupplier.get();
//        System.out.println(s);

//        Supplier<A> mySupplier = ()->new A();
//        A s = mySupplier.get();
//        System.out.println(s);

        Consumer<String> myConsumer = x -> System.out.println(x);
        myConsumer.accept("Hello");

    }
}
