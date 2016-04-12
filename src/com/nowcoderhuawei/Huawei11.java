package com.nowcoderhuawei;
import java.util.Scanner;

/**
 * Created by carl on 2016/4/11.
 */
public class Huawei11 {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            StringBuffer input =new StringBuffer(sc.nextLine());
            String result=input.reverse().toString();
            System.out.println(result);
        }
    }
}

/**
 * 题目描述

 描述：
 输入一个整数，将这个整数以字符串的形式逆序输出
 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001


 输入描述:
 输入一个int整数


 输出描述:
 将这个整数以字符串的形式逆序输出

 输入例子:
 1516000

 输出例子:
 0006151

 #include <stdio.h>
 int main()
 {
     int a;
     scanf("%d", &a);
 while (a > 0)
 {
     printf("%d", a % 10);
     a /= 10;
 }
    return 0;
 }

 */