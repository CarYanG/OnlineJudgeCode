package com.swordtooffer;

/**
 * Created by carl on 2016/4/18.
 */
public class SwordOffer02 {
    public static void main(String args[]){
        StringBuffer test=new StringBuffer("helloworld   ");
        System.out.println(new SwordOffer02().replaceSpace(test));
    }

    public String replaceSpace(StringBuffer str) {
        if (str.length()==0){
            return "";
        }
        else{
            String a=str.toString();
            String []b=a.split(" ");
            StringBuffer c=new StringBuffer("");
            for(int i=0;i<b.length-1;i++){
                c.append(b[i]);
                c.append("%20");
            }
            if(b.length!=0){
                c.append(b[b.length-1]);
                return c.toString();
            }
            else{

                int i=0;

                while(i<a.length()){
                    c.append("%20");
                    i++;
                }
                return c.toString();
            }

        }

    }
}

/**
 * 题目描述

 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。

 */