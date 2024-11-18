package Combinator;

import java.time.LocalDate;

public class Customer
{
    private final String name;
    private final String email;
    private final String phone;
    private final LocalDate dateOfBirth;

    public Customer(String name, String email, String phone, LocalDate dob) 
    {
        this.email = email;
        this.name = name;
        this.dateOfBirth = dob;
        this.phone = phone;
    }

    public String getName()
    {
        return this.name;
    }

    public String getEmail()
    {
        return this.email;
    }
    public String getPhone()
    {
        return this.phone;
    }
    public LocalDate getDOB()
    {
        return this.dateOfBirth;
    }
}
