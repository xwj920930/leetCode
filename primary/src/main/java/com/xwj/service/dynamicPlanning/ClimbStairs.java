package com.xwj.service.dynamicPlanning;

/**
 * @Description 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * @Author yuki
 * @Date 2023/5/21 15:51
 * @Version 1.0
 **/
public class ClimbStairs {
    public static int climbStairs(int n) {
        if (n == 1){
            return 1;
        } else if (n == 2){
            return 2;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static int climbStairsWithMemory(int n) {
        int[] ints = new int[n + 1];
        return climbStairsWithMemory(n, ints);
    }

    public static int climbStairsWithMemory(int n, int[] memory) {
        if (memory[n] > 0){
            return memory[n];
        }
        if (n == 1){
            memory[n] = 1;
        } else if (n == 2){
            memory[n] = 2;
        } else {
            memory[n] = climbStairsWithMemory(n -1, memory) + climbStairsWithMemory(n -2, memory);
        }
        return memory[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(45));
        System.out.println(climbStairsWithMemory(45));
    }
}
