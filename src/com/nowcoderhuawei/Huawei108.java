package com.nowcoderhuawei;

import java.util.Scanner;

/**
 * Created by carl on 2016/8/31.
 *
 * 最小公倍数=两整数的乘积÷最大公约数
 */
public class Huawei108 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            int a =sc.nextInt();
            int b=sc.nextInt();
            if(b==0||a==0){
                System.out.println(0);
            }
            else if(b%a==0){
                System.out.println(b);
            }
            else if(a%b==0){
                System.out.println(a);
            }
            else{
                System.out.println("ss:"+gcd(a,b));
                System.out.println(a*b/gcd(a,b));
            }


        }


        sc.close();
    }

    public static int gcd(int a,int b){
        if(a%b==0){
            return b;

        }
        if(b%a==0){
            return a;
        }
        return a>b?gcd(b,a%b):gcd(a,b%a);
    }
}



/**
 *题目描述

 正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数。

 输入描述:
 输入两个正整数A和B。


 输出描述:
 输出A和B的最小公倍数。

 输入例子:
 5
 7

 输出例子:
 35
 */

