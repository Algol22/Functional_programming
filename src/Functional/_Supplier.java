package Functional;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        System.out.println(getConectionUrl());
        System.out.println(getConnection.get());
    }

    static String getConectionUrl(){
        return "jdbc://localhost:5432/users";
    }

   static Supplier<List<String>> getConnection = ()
            -> List.of("jdbc://localhost:5432/users");
}
