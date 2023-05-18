package Functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

       int increment = increment(0);


      int increment2 = incrementByOneFunction.apply(1);


        System.out.println(
        multiplyByTenFunctionBiFunction.apply(3,4)
        );
    }

   static BiFunction<Integer, Integer, Integer> multiplyByTenFunctionBiFunction =
            (numberToIncrement, numberToMultiply)
                    -> (numberToIncrement +1) * numberToMultiply;

    static Function<Integer,Integer> incrementByOneFunction = number -> number ++;

    static int increment(int number){
        return number +1;
    }
}
