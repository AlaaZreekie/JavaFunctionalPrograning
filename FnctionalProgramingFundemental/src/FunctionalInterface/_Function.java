package FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function 
{
    public static void main(String[] args) 
    {
        int increment = increment(1);
        System.out.println(increment);
        System.out.println("from function " + incrementByOneFunction.apply(2));
        int num = multBy10Function.apply(incrementByOneFunction.apply(2));
        System.out.println(num);
        System.out.println("from and then" + add1Mult10Function.apply(1));
        System.out.println("from BiFunction  " + incrementByOneAndMultFunction.apply(1, 20));
    }

    static int increment(int number)
    {
        return (number + 1);
    }

    static Function<Integer, Integer> incrementByOneFunction = 
            number -> number + 1;
    static Function<Integer, Integer> multBy10Function = 
            num -> num * 10;

    static Function<Integer, Integer> add1Mult10Function = incrementByOneFunction.andThen(multBy10Function);

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultFunction =
            (a, b) ->( (a + 1) * b);
}
