package Functional;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println(
        isPhoneOk.and(containsThree).test("07123213213")
        );
    }

    static boolean isPhoneValid(String phone)
    {
        return phone.startsWith("07") && phone.length()==11;
    }

    static Predicate<String> isPhoneOk = phone ->
            phone.startsWith("07") && phone.length()==11;

    static Predicate<String> containsThree = phone ->
            phone.contains("3");
}
