package main.Java8.Lambda;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //test1();
        //test2();
        test3();

    }

    public static void test1() {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Fuck world");
            }
        });
        thread.start();

    }

    public static void test2() {

        /*Thread thread = new Thread(() -> System.out.println("Fuck world"));
        thread.start();*/

        /*Thread thread = new Thread(() -> {
            throw new UnsupportedOperationException();
        });
        thread.start();*/

        /*Test test = (Integer i) -> { return i+""; };
        Test test = (i) -> { return i+""; };
        Test test = i -> i+"";*/

        Test test = Main::impl;

    }

    public static void test3() {

        /*Integer[] array = new Integer[] {4, 6, 1, 9, 2, 0, 3, 7, 8, 5};
        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(Arrays.toString(array));*/

        /*Integer[] array = new Integer[] {4, 6, 1, 9, 2, 0, 3, 7, 8, 5};
        Arrays.sort(array, Integer::compare);
        System.out.println(Arrays.toString(array));*/

        /*Integer[] array = new Integer[] {4, 6, 1, 9, 2, 0, 3, 7, 8, 5};
        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(array));*/

        /*Integer[] array = new Integer[] {4, 6, 1, 9, 2, 0, 3, 7, 8, 5};
        Arrays.sort(array, Integer::compareTo);
        System.out.println(Arrays.toString(array));*/

        Main mainObject = new Main();
        Integer[] array = new Integer[] {4, 6, 1, 9, 2, 0, 3, 7, 8, 5};
        Arrays.sort(array, mainObject::reserve);
        System.out.println(Arrays.toString(array));

    }

    public static String impl(Integer i) {
        return "我是已经存在的实现" + i;
    }

    public int reserve(Integer a, Integer b) {
        return a.compareTo(b);
    }

}
