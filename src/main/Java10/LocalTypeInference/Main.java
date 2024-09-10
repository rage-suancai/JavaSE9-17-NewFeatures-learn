package main.Java10.LocalTypeInference;

public class Main {

    public static void main(String[] args) {

        test();

    }

    public static void test() {

        var a = "Hello World";
        System.out.println(a.getClass());

    }

}
