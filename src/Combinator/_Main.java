package Combinator;

import Functional._Consumer;
import com.sun.security.jgss.GSSUtil;

import java.time.LocalDate;

import static Combinator._CustomerRegistration.isEmailValid;

public class _Main {

    public static void main(String[] args) {
        _Customer customer = new _Customer("Alice", "alice@gmail.com", "+38094",
                LocalDate.of(2000,1,1));

_CustomerRegistration.ValidationResult result =
               isEmailValid()
               .and(_CustomerRegistration.isPhoneValid())
               .and(_CustomerRegistration.isAdult())
               .apply(customer);
        System.out.println(result);

        if(result!= _CustomerRegistration.ValidationResult.SUCCESS){
            throw new IllegalArgumentException(result.name());
        }


    }
}
