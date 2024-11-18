package Combinator;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static Combinator.ValidationResult.EMAIL_NOT_VALID;
import static Combinator.ValidationResult.IS_NOT_AN_ADULT;
import static Combinator.ValidationResult.PHONE_NOT_VALID;
import static Combinator.ValidationResult.SUCCESS;

public interface CustomerRegistrationValidation extends Function<Customer, ValidationResult> 
{
    static CustomerRegistrationValidation isEmailValid()
    {
        return customer -> (customer.getEmail().contains("@")) ? 
                SUCCESS : EMAIL_NOT_VALID;
    }

    static CustomerRegistrationValidation isPhoneValid()
    {
        return customer -> (customer.getPhone().contains("09")) ? 
                SUCCESS : PHONE_NOT_VALID;
    }

    static CustomerRegistrationValidation isAdultValid()
    {
        return customer -> Period.between(customer.getDOB(), LocalDate.now()).getYears() > 16 ? 
                SUCCESS : IS_NOT_AN_ADULT;
    }

    default CustomerRegistrationValidation and (CustomerRegistrationValidation other)
    {
        return customer -> 
        {
            ValidationResult result = this.apply(customer);
            return SUCCESS.equals(result) ? other.apply(customer) : result;
        };
    }
}
