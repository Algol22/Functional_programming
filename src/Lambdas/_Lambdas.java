package Lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Lambdas {

    public static void main(String[] args) {

        BiFunction<String, Integer, String> upperCase  = (name, age) -> {
            if(name.isBlank()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };


        String result = upperCase.apply("Tom", 30);
        System.out.println(result);
    }
}
