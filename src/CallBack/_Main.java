package CallBack;

import java.util.function.Consumer;

public class _Main {

    public static void main(String[] args) {

        hello("John", null, value->
                System.out.println("no last name " + value));

    }

    static void hello(String firstName, String lastName, Consumer<String> callback){
        System.out.println(firstName);
         if(lastName!=null){
             System.out.println(lastName);
         }else{
             callback.accept(firstName);
         }
    }
}
