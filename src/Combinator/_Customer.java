package Combinator;

import java.time.LocalDate;

public class _Customer {
    private final String name;
    private final String email;
    private final String phone;
    private final LocalDate dob;

    public _Customer(String name, String email, String phone, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDate getDob() {
        return dob;
    }
}
