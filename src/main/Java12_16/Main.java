package main.Java12_16;

public class Main {

    public static void main(String[] args) {

        //System.out.println(test1());

        //test2();

        /* a = "xxxxx";
        String b = null;
        test3(a, b);*/

        test4();

    }

    public static String test1() {

        int score = 10;
        return switch (score) {
            case 10, 9 -> "优秀";
            case 8, 7 -> "良好";
            case 6 -> "及格";
            default -> "不及格";
        };

    }

    public static void test2() {

        var s = """
                    sdadwdsdwd
                    dwadawdwadad
                    dawdwdwdwd"dawdwadawd"
                """;
        System.out.println(s);

    }

    static class Student {

        private final String name;

        public Student(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {

            if (obj instanceof Student student) {
                return student.name.equals(this.name);
            }
            return false;

        }

    }

    public static void test3(String a, String b) {

        int length = a.length() + b.length();
        System.out.println(length);

    }

    public static void test4() {

        /*Account account = new Account("admin", "123456");
        System.out.println(account);*/

        Account account1 = new Account("admin", "123456");
        Account account2 = new Account("admin", "123456");
        System.out.println(account1.equals(account2));

    }

}
