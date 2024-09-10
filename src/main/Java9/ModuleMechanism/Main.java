package main.Java9.ModuleMechanism;

import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        //test1();
        test2();

    }

    public static void test1() {

        Logger logger = Logger.getLogger(Main.class.getName());
        logger.log(Level.INFO, "Fuck world");

    }

    public static void test2() {

        Class<String> stringClass = String.class;
        Field field;
        try {
            field = stringClass.getDeclaredField("value");
            field.setAccessible(true);
            System.out.println(field.get("ABCD"));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }

}
