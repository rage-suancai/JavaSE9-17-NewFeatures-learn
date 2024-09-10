package main.Java9.FactoryMethod;

import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        test();

    }

    public static void test() {

        /*Map<String, Integer> map = new HashMap<>();
        map.put("AAA", 19); map.put("BBB", 23);
        System.out.println(map);*/

        /*Map<String, Integer> map = Map.of("AAA", 18, "BBB", 20);
        System.out.println(map);*/

        Set<String> set = Set.of("BBB", "CCC", "AAA");
        List<String> list = List.of("AAA", "CCC", "BBB");
        System.out.println(set); System.out.println(list);

    }

}
