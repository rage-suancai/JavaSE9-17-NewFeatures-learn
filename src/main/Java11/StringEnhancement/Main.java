package main.Java11.StringEnhancement;

public class Main {

    public static void main(String[] args) {

        test();

    }

    public static void test() {

        /*var srt = "AB\nC\nD";
        System.out.println(srt.isBlank());
        srt.lines().forEach(System.out::println);*/

        /*String str = "ABCD";
        System.out.println(str.repeat(2));*/

        String str = " A B C D ";
        System.out.println(str.strip());
        System.out.println(str.stripLeading());
        System.out.println(str.stripTrailing());

    }

}
