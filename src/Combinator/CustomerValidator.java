package Combinator;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidator {

    public boolean isEmailValid(String email){
        return email.contains("@");
    }

    public boolean isPhoneValid(String phone){
        return phone.startsWith("+3");
    }


    public boolean isAdult(LocalDate dob){
        return Period.between(dob, LocalDate.now()).getYears() >16;
    }

    public boolean isValid(_Customer customer){
        return isEmailValid(customer.getEmail()) &&
                isPhoneValid(customer.getPhone()) &&
                isAdult(customer.getDob());
    }
}
