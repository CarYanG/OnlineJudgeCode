package com.nowcoderhuawei;

import java.util.Scanner;

/**
 * Created by carl on 2016/4/12.
 */
public class Huawei15 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int a=sc.nextInt();
            int[] b=new int[32];
            int count=0;
            for(int i=31;i>=0;i--){
                b[i]=a&1;
                if(b[i]==1){
                    count++;
                }
                a=a>>1;
            }
            System.out.println(count);
        }

    }
}

/**
 * 题目描述

 输入一个int型数据，计算出该int型数据在内存中存储时1的个数。

 输入描述:
 输入一个整数（int类型）


 输出描述:
 这个数转换成2进制后，输出1的个数

 输入例子:
 5

 输出例子:
 2



 import java.util.Scanner;

 public class Main {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    String s = Integer.toBinaryString(num);
    num=0;
 for (int i = 0; i < s.length(); i++) {
     if(s.charAt(i)=='1'){
         num++;
     }
 }
     System.out.println(num);
 }
 }




 #include <iostream>
 #include <string>
 using namespace std;
 int main()
 {
 int n;
 while(cin>>n)
 {
 int count = 0;
 while (n != 0)
 {
 count++;
 n = n&(n-1);
 }
 cout<<count<<endl;
 }
 return 0;
 }

 利用了n*(n-1)的巧妙用法
 */


