package FunctionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate 
{
    public static void main(String[] args) 
    {
        System.out.println(isValidPhone("0998653381"));
        System.out.println(isValidPhone("00000000000"));
        System.out.println("--------------with predicate------------");
        System.out.println(isValidPhonePredicate.test("0998653381"));
        System.out.println(isValidPhonePredicate.test("00000000000"));

        System.out.println("From chain "+ isValidPhonePredicate.and(contain9Predicate).test("0998653381"));

        System.out.println(evenPredicate.test(2, 4));

    }

    static boolean isValidPhone(String phone)
    {
        return phone.startsWith("09") && phone.length() == 10;
    }

    static Predicate<String> isValidPhonePredicate = 
            phone -> phone.startsWith("09") && phone.length() == 10;

    static Predicate<String> contain9Predicate =
            num -> num.contains("3");

    static BiPredicate<Integer, Integer> evenPredicate =
        (a, b) -> (a % 2 == 0) && (b % 2 == 0);

}
