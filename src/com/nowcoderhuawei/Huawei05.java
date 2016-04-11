package com.nowcoderhuawei;

import java.util.Scanner;

/**
 * Created by carl on 2016/4/9.
 */
public class Huawei05 {
    public void function(String a){

        System.out.println(Integer.parseInt(a.substring(2), 16));
    }

    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            String a=input.nextLine();
            new Huawei05().function(a);
        }
    }
}


/**
 *
 * 题目描述

 写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。（多组同时输入 ）

 输入描述:
 输入一个十六进制的数值字符串。


 输出描述:
 输出该数值的十进制字符串。

 输入例子:
 0xA

 输出例子:
 10



 这道题用Java自带的函数转换也，当然自己写也行，代码如下：
 自带函数转换： import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.next().substring(2);
            System.out.println(Integer.parseInt(str,16));
        }
    }
}
自己实现转换：
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            StringBuffer sb=new StringBuffer();
            sb.append(sc.next());
            //String str=sc.next();
            String str=sb.reverse().substring(0,sb.length()-2);
            char ch[]=str.toCharArray();
            int sum=0;
            for(int i=0;i<ch.length;i++){
                if(ch[i]>='A'&&ch[i]<='F'){
                    sum+=(Integer.valueOf(ch[i])-55)*Math.pow(16,i);
                }else {
                    sum+=(Integer.valueOf(ch[i])-48)*Math.pow(16,i);
                }
            }
            System.out.println(sum);
            // System.out.println(Integer.valueOf('6'));
        }
    }

}


*/