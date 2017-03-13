package interview;

/**
 * fusionskye 面试题-初级
 *
 * @author HaoQ
 */
public class Questions {
    public static void main(String[] args) {
        questions1();
        questions2();
        questions3();
        questions4();
        questions5();
    }

    /* questions1 */
    private static void questions1() {
        String str = "str";
        Questions.appendStr(str);
        System.out.println(str);
    }

    private static void appendStr(String str) {//值传递
        str += "1";
    }

    /* questions2 */
    private static void questions2() {
        new B();//创建子类对象，先调用父类
        System.out.println();
    }

    /* questions3 */
    private static void questions3() {
        int a = 3, b = 4;

        if (a++ == 3 &&
                ++b == 5 &&
                ++a + b++ == 10 &&
                a++ == 7 &&
                ++b == 11) {
            System.out.println("a:" + a + "   b:" + b);
        } else {
            System.out.println("a:" + a + "   b:" + b);
        }
    }

    /* questions4 */
    private static void questions4() {

        int i = 0;
        try {
            for (; i < 5; i++) {
                if (i == 3) {
                    throw new Exception("i==3");
                }
            }
            i -= 10;
        } catch (Exception ignored) {
        } finally {
            i += 10;
        }

        System.out.println(i);
    }


    /* questions5 */
    private static void questions5() {

        int result = 0;
        int i = 2;
        switch (i) {
            case 1: {
                result = result + i;
            }
            case 2: {
                result = result + i * 2;
            }//没有 break ， 会进入下一个 case 3
            case 3: {
                result = result + i * 3;
            }
            break;
        }
        System.out.println(result);
    }


    /**
     * 内部类 A , B
     */
    static class A {

        private static final String STR = initStaticStr();
        private final String initStr = initStr();

        {
            System.out.print("1");
        }

        A() {
            System.out.print("2");
        }

        private static String initStaticStr() {
            System.out.print("4");
            return "initStaticStr";
        }

        private String initStr() {
            System.out.print("3");
            return "initStr";
        }
    }

    static class B extends A {
        B() {
            System.out.print("5");
        }
    }
}
