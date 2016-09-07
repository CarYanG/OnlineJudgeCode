package com.leetcode;

/**
 * Created by carl on 2016/9/4.
 *
 * Climbing Stairs
 *
 * 采用迭代处理，用递归的话时间超时
 */
public class leetcode70 {
    public int climbStairs(int n) {

        if(n==1) return  1;
        if(n==2) return 2;
        if (n==3) return 3;
        if(n==4) return 5;
        if(n==5) return 8;
        if(n==6) return 13;
        int pre1=13;
        int pre2=8;
        int i=7;
       while(i<=n){
           pre1=pre1+pre2;
           pre2=pre1-pre2;
           i++;
       }
        return pre1;

//      return  climbStairs(n-1)+climbStairs(n-2);

    }

    public static void main(String[] args) {
        System.out.println(new leetcode70().climbStairs(5));
    }
}


/**
 * You are climbing a stair case. It takes n steps to reach to the top.

 Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 */