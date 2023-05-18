package Combinator;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;
public interface _CustomerRegistration
        extends Function<_Customer, _CustomerRegistration.ValidationResult> {

    static _CustomerRegistration isEmailValid(){
        return customer -> customer.getEmail().contains("@") ?
                ValidationResult.SUCCESS : ValidationResult.EMAIL_NOT_VALID;
    }

    static _CustomerRegistration isPhoneValid(){
        return customer -> customer.getPhone().startsWith("+3")?
                ValidationResult.SUCCESS : ValidationResult.PHONE_NUMBER_NOT_VALID;
    }

    static _CustomerRegistration isAdult(){
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() >16?
                ValidationResult.SUCCESS : ValidationResult.PHONE_NUMBER_NOT_VALID;
    }

    default _CustomerRegistration and (_CustomerRegistration  other){
        return customer ->{
            ValidationResult result = this.apply(customer);
           return result.equals(ValidationResult.SUCCESS) ? other.apply(customer) : result;
        };
    }

    enum ValidationResult{
        SUCCESS,
        PHONE_NUMBER_NOT_VALID,
        EMAIL_NOT_VALID,
        NOT_ADULT
    }
}
