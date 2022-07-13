package com.algorithm.equation;


/**
 *
 *
 * Created by tinyMaple on 2022/07/13.
 *
 * 常用的计算方程
 */
public class Math {

    private Math() {}

    /**
     * 最大公约数
     * greatest common divisor
     */
    public static int gcd(int m, int n) {
        assert m >= 0;
        assert n >= 0;
        if (n == 0) {
            return m;
        }
        int r = m % n;
        return gcd(n, r);
    }
}
