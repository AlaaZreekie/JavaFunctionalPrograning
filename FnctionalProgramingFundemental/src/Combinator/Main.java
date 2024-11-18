package Combinator;

import java.io.EOFException;
import java.time.LocalDate;

public class Main 
{
    public static void main(String[] args) 
    {
        Customer customer = new Customer("Alaa",
                                    "alaa@samagmail.com",
                                    "0998653381",
                                    LocalDate.of(2000, 1, 1)
                                    );

        // CustomerValidatorService service = new CustomerValidatorService();

        // System.out.println( service.isValid(customer));;

        //using combinaor
        ValidationResult res = CustomerRegistrationValidation.isEmailValid()
            .and(CustomerRegistrationValidation.isPhoneValid())
            .and(CustomerRegistrationValidation.isAdultValid()).apply(customer);

        System.out.println(res);
    }

}
