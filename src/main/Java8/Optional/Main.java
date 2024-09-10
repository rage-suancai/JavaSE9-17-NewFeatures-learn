package main.Java8.Optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        test("");

    }

    public static void test(String str) {

        //System.out.println(str.toLowerCase());

        //if (str != null) System.out.println(str.toLowerCase());

        /*Optional.ofNullable(str).ifPresent(s -> {
            System.out.println(s);
        });*/

        //Optional.ofNullable(str).ifPresent(System.out::println);

        //System.out.println(Optional.ofNullable(str).get());

        System.out.println(Optional.ofNullable(str).orElse("VVV"));

    }

}
