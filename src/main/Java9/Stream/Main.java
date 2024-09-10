package main.Java9.Stream;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        test();

    }

    public static void test() {

        /*Stream
                .of("A", "B", "B", "C")
                .filter(s -> s.equals("B"))
                .distinct()
                .forEach(System.out::println);*/

        /*Stream
                .of(null)
                .forEach(System.out::println);
        Stream
                .ofNullable(null)
                .forEach(System.out::println);*/

        /*Stream
                .iterate(0, i -> i+1).limit(20)
                .forEach(System.out::println);
        Stream
                .iterate(0, i -> i < 20, i -> i+1)
                .forEach(System.out::println);*/

        /*Stream
                .iterate(0, i -> i+1)
                .limit(20)
                .takeWhile(i -> i < 10)
                .forEach(System.out::println);*/
        Stream
                .iterate(0, i -> i+1)
                .limit(20)
                .dropWhile(i -> i < 10)
                .forEach(System.out::println);

    }

}
