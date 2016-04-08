package com.nowcoderhuawei;

/**
 * Created by carl on 2016/4/9.
 */
import java.lang.String;
import java.util.Scanner;
public class Huawei01{

    public int function(String sentence){
        String a=new StringBuffer(sentence).reverse().toString();
        System.out.println(a);
        if(a.indexOf(" ")==-1){
            return a.length();
        }
        else{
            return a.indexOf(" ");
        }
    }
    public static void main(String args[]){

        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String sentence=in.nextLine().toString();
            System.out.println(new Huawei01().function(sentence));
        }
    }

}

/*
题目描述

计算字符串最后一个单词的长度，单词以空格隔开。

输入描述:
一行字符串。


输出描述:
整数N，最后一个单词的长度。

输入例子:
hello world

输出例子:
5
 */
