package com.nowcoderhuawei;

import java.util.Scanner;

/**
 * Created by carl on 2016/4/13.
 */
public class Huawei13 {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String input=sc.nextLine();
            String[] sentence=input.split(" ");
            for(int i=0;i<sentence.length;i++){
                System.out.print(sentence[sentence.length - 1 - i] + (i==(sentence.length-1)?"\n":" "));
            }

        }

    }
}


/**
 * 题目描述

 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符



 接口说明
 /**
 * 反转句子
 *
 * @param sentence 原句子
 * @return 反转后的句子

public String reverse(String sentence);


输入描述:
        将一个英文语句以单词为单位逆序排放。


        输出描述:
        得到逆序的句子

        输入例子:
        I am a boy

        输出例子:
        boy a am I


#include <iostream>
#include <string>
#include <sstream>
using namespace std;

int main() {
    string s;
    getline(cin,s);
    stringstream ss(s);
    string res="", tmp;
    while (ss>>tmp) {
    if (res=="")
        res=tmp;
    else
        res=tmp+" "+res;
    }
    cout<<res;
    return 0;
}
用c++的stringstream很简单

 */