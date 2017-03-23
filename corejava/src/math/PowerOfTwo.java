package math;

import java.util.Scanner;

/**
 * 给定一个整数,判断其是否为2的幂
 *
 * @author HaoQ
 */
public class PowerOfTwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {

            int num = sc.nextInt();
            if (isPowerOfTwo(num)) {
                System.out.println("是2的幂");
            } else {
                System.out.println("不是2的幂");
            }
        }
    }

    /**
     * 判断 num 是否是2的幂
     * 思路:
     * 2，4，8，16，32....都是2的n次幂
     * 转换为二进制分别为:
     * 10    100    1000   10000    100000
     * 这些数减1后与自身进行按位与，如果结果为0，表示这个数是2的n次幂
     * 01    011    0111   01111    011111
     *
     * @param num 待判断整数
     * @return 结果
     */
    private static boolean isPowerOfTwo(int num) {

        return num > 0 && (num & (num - 1)) == 0;
    }
}
