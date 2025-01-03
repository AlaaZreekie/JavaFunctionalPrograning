package Combinator;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService 
{
    private boolean isValidEmail(String email)
    {
        return email.contains("@");
    }

    private boolean isValidPhone(String phone)
    {
        return phone.startsWith("09");
    }

    private boolean isValidDOB(LocalDate dob)
    {
        return Period.between(dob, LocalDate.now()).getYears() > 16;
    }

    public boolean isValid(Customer customer)
    {
        return isValidPhone(customer.getPhone()) &&
                isValidEmail(customer.getEmail()) &&
                isValidDOB(customer.getDOB());
    }
}
