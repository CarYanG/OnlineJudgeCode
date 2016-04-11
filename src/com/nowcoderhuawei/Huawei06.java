package com.nowcoderhuawei;

/**
 * Created by carl on 2016/4/11.
 */
import java.util.Scanner;
public class Huawei06 {
    public void function(long a){
        int i=2;
        while(i<=a){
            if (a%i==0){
                System.out.print(i + " ");
                a=a/i;
                i=2;
            }
            else{
                i++;
            }

        }
    }

    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            long a=input.nextLong();
            new Huawei06().function(a);
        }
    }
}



/**
 * 题目描述

 功能:输入一个正整数，按照从小到大的顺序输出它的所有质数的因子（如180的质数因子为2 2 3 3 5 ）


 详细描述：

 函数接口说明：
 public String getResult(long ulDataInput)
 输入参数：
 long ulDataInput：输入的正整数
 返回值：
 String



 输入描述:
 输入一个long型整数


 输出描述:
 按照从小到大的顺序输出它的所有质数的因子，以空格隔开

 输入例子:
 180

 输出例子:
 2 2 3 3 5


 #include <iostream>

 using namespace std;

 int main(void)
 {
 long input;
 //cin >> input;
 while (cin >> input)
 {
 while (input != 1)
 {
 for (int i = 2; i <= input; i++)
 {
 if (input % i == 0)
 {
 input /= i;
 cout << i << ' ';
 break;
 }
 }
 }

 }



 return 0;
 }

 */