package recursion;

/**
 * @author HaoQ
 */
public class StringRecursion {

    //return reverse(originStr下标从1开始到originStr结尾) + originStr第一个字符
    //每次递归将首字符置于末尾
    private static String reverse(String originStr) {
        if(originStr == null || originStr.length() <= 1)
            return originStr;
        return reverse(originStr.substring(1)) + originStr.charAt(0);
    }

    public static void main(String[] args) {

        final String s = "abc";
        final String s1= reverse(s);
        System.out.println(s1);
    }
}
