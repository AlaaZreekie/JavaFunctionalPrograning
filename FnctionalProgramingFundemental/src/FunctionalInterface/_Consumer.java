package FunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer 
{
    public static void main(String[] args) 
    {
        Customer a = new Customer("Alaa", "0998653381");
        Customer b = new Customer("ALI",  "0000");
        greetCuntumer(a);
        greetCustomerConsumer.accept(a);
        greet2CustomerBiConsumer.accept(a, b);
    }

    static void greetCuntumer(Customer customer)
    {
        System.out.println("Hello " + customer.name+",\nyour phone is: " + customer.phoneNumber);
    }

    static Consumer<Customer> greetCustomerConsumer =  
        c -> System.out.println("Hello from consumer " + c.name+",\nyour phone is: " + c.phoneNumber);
    
    
    static class  Customer 
    {
        private final String name;
        private final String phoneNumber;

        public Customer(String name, String phone) 
        {
            this.name = name;
            this.phoneNumber = phone;        
        }    
        
    }

    static BiConsumer<Customer, Customer> greet2CustomerBiConsumer =
            (a, b) -> System.out.println("Hello " +a.name+ " and " + b.name);

}