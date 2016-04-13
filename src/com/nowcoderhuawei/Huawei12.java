package com.nowcoderhuawei;

import java.util.Scanner;

/**
 * Created by carl on 2016/4/12.
 */
public class Huawei12 {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            StringBuffer sb=new StringBuffer(sc.nextLine());
            System.out.println(sb.reverse());

        }

    }
}


/**
 * 题目描述

 写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。例如：

 输入描述:
 输入N个字符


 输出描述:
 输出该字符串反转后的字符串

 输入例子:
 abcd

 输出例子:
 dcba

 #include <iostream>
 #include <string>
 #include <algorithm>

 using namespace std;

 int main()
 {
    string input;
    while (cin >> input)
 {
    reverse(input.begin(), input.end());
    cout << input << endl;
 }

    return 0;
 }

 */