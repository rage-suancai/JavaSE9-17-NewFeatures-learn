package com.main;

import com.test.User;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {

        test();

    }

    public static void test() {

        /*User user = new User("lbw", 18);
        System.out.println(user);*/

        /*User user = new User("lbw", 18);
        System.out.println(user);*/

        User user = new User("lbw", 18);
        Class<User> userClass = User.class;
        try {
            Field field = userClass.getDeclaredField("name");
            field.setAccessible(true);
            System.out.println(field.get(user));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }

}
