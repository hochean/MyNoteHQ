package interview;

/**
 * fusionskye面试题-初级
 * 用递归算法写一段程序实现
 * (1) 1+3+5+7+...+1000001
 * (2) 1+2+...+1000000
 *
 * @author HaoQ
 */
public class Recursion {

    public static void main(String[] args) {

        Recursion recursion = new Recursion();
        /*System.out.println(recursion.getSum1(1, 1, 7));
        System.out.println(recursion.getSum2(1, 1, 8));*/

        System.out.println(sumImpl1(0, 1, 7));
        System.out.println(sumImpl2(0, 1, 8));
    }

    //lw
    private static int sumImpl1(int sum, int plusNum, int endNum) {

        return plusNum > endNum ?
                sum :
                sumImpl1(sum + plusNum, plusNum + 2, endNum);
    }

    //lw
    private static int sumImpl2(int sum, int plusNum, int endNum) {

        return plusNum > endNum ?
                sum :
                sumImpl2(sum + plusNum, plusNum + 1, endNum);
    }

    //hq
    private int getSum1(int flag, int start, int end) {

        if (flag == end) {
            return start;
        }
        flag += 2;
        start += flag;
        return getSum1(flag, start, end);
    }

    //hq
    private int getSum2(int flag, int start, int end) {
        if (flag == end) {
            return start;
        }
        flag++;
        start += flag;
        return getSum2(flag, start, end);
    }
}
