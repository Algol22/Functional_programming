package Functional;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {


    public static void main(String[] args) {

        greetCustomer.accept(new Customer("Petya", "02"),false);
    }

    static BiConsumer<Customer, Boolean> greetCustomer = (customer, showPhone) ->
        System.out.println("hello " + customer.customerName + " " + (showPhone? customer.phoneNumber : "***"));



    static class Customer{
        private final String customerName;
        private final String phoneNumber;

        public Customer(String customerName, String phoneNumber) {
            this.customerName = customerName;
            this.phoneNumber = phoneNumber;
        }
    }
}
