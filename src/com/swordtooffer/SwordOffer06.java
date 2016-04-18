package com.swordtooffer;

/**
 * Created by carl on 2016/4/18.
 */
public class SwordOffer06 {
    public static void main(String args[]){

    }

    public int Fibonacci(int n) {
        if(n<1){
            return 0;
        }
        else if(n==1){
            return 1;
        }else if(n==2){
            return 1;
        }else if(n==3){
            return 2;
        }else if(n==4){
            return 3;
        }else if(n==5){
            return 5;
        }else if(n==6){
            return 8;
        }
        else
            return Fibonacci(n-1)+Fibonacci(n-2);
    }
}

/**
 * 题目描述

 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。

 */

/*c++动态规划版*/

/*
class Solution {
    public:
    int Fibonacci(int n) {
        int f = 0, g = 1;
        while(n-->0) {
            g += f;
            f = g - f;
        }
        return f;
    }
};*/


/*动态规划方法*
if(n<=1){
        return n;
        }
        int[] record = new int[n+1];
        record[0] = 0;
        record[1] = 1;
        for(int i=2;i<=n;i++){
        record[i] = record[i-1] + record[i-2];
        }
        return record[n];*/


/*
迭代方法，用两个变量记录fn-1和fn-2:
class Solution {
    public:
    int Fibonacci(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        int numfn1 = 0, numfn2 = 1;
        int currentnum;
        for(int i=2; i<=n; ++i) {
            currentnum = numfn1+numfn2;
            numfn1 = numfn2;
            numfn2 = currentnum;
        }
        return currentnum;
    }
};*/

