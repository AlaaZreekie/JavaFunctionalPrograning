package FunctionalInterface;

import java.util.function.Supplier;

public class _Supplier 
{
    public static void main(String[] args) 
    {
        System.out.println(getHelloWorldSupplier.get());
    }

    static Supplier<String> getHelloWorldSupplier = 
        () -> "Hello world";
}
