package com.xwj.service.dynamicPlanning;

/**
 * 1137. 第 N 个泰波那契数
 * 泰波那契序列 Tn 定义如下：
 *
 * T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2
 *
 * 给你整数 n，请返回第 n 个泰波那契数 Tn 的值。
 */
public class TibonacciSequence {
    public int tribonacci(int n) {
        if (n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        } else if (n == 2){
            return 1;
        } else {
            int temp = 0;
            int first = 0;
            int second = 1;
            int third = 1;
            for (int i = 3; i <= n ; i++) {
                temp = first + second + third;
                first = second;
                second = third;
                third = temp;
            }
            return temp;
        }
    }

    public static void main(String[] args) {
        System.out.println(new TibonacciSequence().tribonacci(25));
    }
}
