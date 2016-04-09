package com.nowcoderhuawei;

import java.util.Scanner;

/**
 * Created by carl on 2016/4/9.
 */
public class Huawei04 {


    public void function(String a ){
        if(a.length()==0){
            System.out.println("");
        }
        else if(a.length()<8){
            char rest[]=new char[8-a.length()];
            for(int i=0;i<rest.length;i++){
                rest[i]='0';
            }
            System.out.println(a+new String(rest));
        }
        else{
            String b=a.substring(0,8);
            System.out.println(b);
            function(a.substring(8));
        }
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            String a=input.nextLine();
            //String b=input.nextLine();

            new Huawei04().function(a);
           // new Huawei04().function(b);
        }


    }
}

/**
 * 题目描述

 •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。

 输入描述:
 连续输入字符串(输入2次,每个字符串长度小于100)


 输出描述:
 输出到长度为8的新字符串数组

 输入例子:
 abc
 123456789

 输出例子:
 abc00000
 12345678
 90000000


 */
/**
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            StringBuffer sb=new StringBuffer(s);
            if(s.length()%8!=0){
                int n=8-s.length()%8;
                for(int i=0;i<n;i++){
                    sb.append("0");
                }
            }
            while(sb.length()>=8){
                System.out.println(sb.substring(0, 8));
                sb=sb.delete(0, 8);
            }
        }
    }
}
 */