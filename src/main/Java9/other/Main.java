package main.Java9.other;

import java.io.IOException;
import java.util.Optional;

public class Main {

    public static void main(String[] args) throws IOException {

        /*InputStream inputStream = Files.newInputStream(Paths.get("pom.xml"));
        try (inputStream) {
            for (int i = 0; i < 100; ++i) System.out.println((char) inputStream.read());
        }*/

        //test(null);

        /*String str = null;
        Optional.empty().ifPresentOrElse(s -> {
            System.out.println("被包装的元素为: " + s);
        }, () -> {
            System.out.println("被包装的元素为null");
        });*/

        String str = null;
        Optional.ofNullable(str)
                .or(() -> Optional.of("AAA"))
                .ifPresent(System.out::println);

    }

    public static void test(String s) {

        Optional
                .ofNullable(s)
                .ifPresent(str -> System.out.println(str.toLowerCase()));

    }

    abstract static class Test<T> {

        public T t;

        public Test() {
            this.t = t;
        }

        public abstract T test();

    }

}
