package com.training.dataspring.test;

import java.util.function.BiFunction;
import java.util.function.Function;

public class CompositionExample {

    public static void main(String[] args) {

        Function<String,Integer> strLength = str->str.length();

        Function<Integer,Integer> multBy2= t->t*2;

        Function<String, Integer> compose = multBy2.compose(strLength);

        System.out.println("compose.apply(\"Mohammad\") = " + compose.apply("Mohammad"));

        BiFunction<Integer,Integer,Integer> add = (a,b)->a+b;

        Function<Integer,Function<Integer,Integer>> addCu=
                a->b->a+b;

        Function<Integer, Integer> add5 = addCu.apply(5);

        Integer result = add5.apply(7);

        System.out.println("result = " + result);


        Function<Integer,Function<Integer,Integer>> itemPrice=
                tax->rawPrice->rawPrice* (100+ tax)/100;

        Function<Integer, Integer> itemPriceInJordan = itemPrice.apply(16);
        Function<Integer, Integer> itemPriceInSA = itemPrice.apply(3);

        System.out.println("itemPriceInJordan.apply(100) = " + itemPriceInJordan.apply(100));

        System.out.println("itemPriceInSA.apply(100) = " + itemPriceInSA.apply(100));
    }
}
