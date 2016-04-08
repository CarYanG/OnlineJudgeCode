package com.nowcoderhuawei;

/**
 * Created by carl on 2016/4/9.
 */
import java.util.Scanner;
import java.lang.String;
public class Huawei02{
    public int function(String s,char a){
        char [] up=s.toUpperCase().toCharArray();
        char [] low =s.toLowerCase().toCharArray();
        int count=0;
        for(int i=0;i<up.length;i++){
            if(up[i]==a || low[i]==a){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String s=in.nextLine();
            // String s=input.substring(0,input.indexOf(" "));
            char a=in.next().toCharArray()[0];
            System.out.println(new Huawei02().function(s,a));
        }
    }
}

/*
题目描述

写出一个程序，接受一个有字母和数字以及空格组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。

输入描述:
输入一个有字母和数字以及空格组成的字符串，和一个字符。


输出描述:
输出输入字符串中含有该字符的个数。

输入例子:
ABCDEF
A

输出例子:
1
 */