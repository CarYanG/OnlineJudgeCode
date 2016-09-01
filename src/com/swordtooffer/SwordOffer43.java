package com.swordtooffer;

/**
 * Created by carl on 2016/8/31.
 * 左旋转字符串
 */
public class SwordOffer43 {
    public String LeftRotateString(String str,int n) {
        if(str.equals("")){
            return "";
        }
        else
        {
            int length=str.length();
            int realnumber=n%length;

            String a=str.substring(0,realnumber);
            String b=str.substring(realnumber);

            return  b+a;
        }


    }

    public static void main(String[] args) {
        String a="12";
        System.out.println(new SwordOffer43().LeftRotateString(a,3));
    }
}

/**
 * 汇编语言中有一种移位指令叫做循环左移（ROL），
 * 现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
 * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
 * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，
 * 即“XYZdefabc”。是不是很简单？OK，搞定它！

 */

/*
将原字符串再累计加上一个
class Solution {
public:
    string LeftRotateString(string str, int n) {
        int len = str.length();
        if(len == 0) return "";
        n = n % len;
        str += str;
        return str.substr(n, len);
    }
};


 */