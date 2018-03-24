package math;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 给定范围内的素数
 * #除了2要特殊处理以外，所有质数都是奇数，给定一个奇数i，判断从3开始到它自身的开方之间的所有奇数是否能整除就行了，这是最快的方法。#
 *
 * @author HaoQ
 */
public class PrimeNumber {

    public static void main(String[] args) {

        final int max = 50;
        int total = 0;
        final List<Integer> primeNum = Lists.newArrayList();

        for (int i = 1; i <= max; i += 2) {
            int temp = (int) Math.sqrt(i);
            boolean isPrime = true;
            for (int j = 3; j <= temp; j += 2) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                total++;
                primeNum.add(i);
            }
        }

        System.out.println("从0到" + max + "共" + total + "个素数");
        System.out.println(primeNum);
    }
}
