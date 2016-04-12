package com.nowcoderhuawei;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by carl on 2016/4/11.
 */
public class Huawei10 {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            StringBuffer sb=new StringBuffer(sc.nextLine().toString());
            HashSet hs=new HashSet();
            for(int i=0;i<sb.length();i++){
                if(sb.charAt(i)>=0&&sb.charAt(i)<=127)
                hs.add(sb.charAt(i));
            }
            System.out.println(hs.size());

        }
        sc.close();

    }
}

/**
 题目描述

 编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)。不在范围内的不作统计。

 输入描述:
 输入N个字符，字符在ACSII码范围内(0~127)。


 输出描述:
 输出字符的个数。

 输入例子:
 abc

 输出例子:
 3


 #include <iostream>
 #include <string>
 using namespace std;
 int main()
 {
    int m,i,n=0;
    int a[128]={0};
    string str;
    getline(cin,str);
    m=str.size();
     for(i=0;i<m;i++)
 {
     if(a[str[i]]==0)
 {
         n++;
         a[str[i]]++;
 }
 }
    cout<<n<<endl;
     return 0;
 }
 */