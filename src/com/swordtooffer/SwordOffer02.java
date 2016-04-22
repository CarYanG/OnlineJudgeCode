package com.swordtooffer;

/**
 * Created by carl on 2016/4/18.
 */
public class SwordOffer02 {
    public static void main(String args[]){
        StringBuffer test=new StringBuffer(" 8");
        System.out.println(new SwordOffer02().replaceSpace2(test));
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

    public String replaceSpace2(StringBuffer str){
        if (str.length()==0){
            return "";
        }
        else{
            char[] a=str.toString().toCharArray();
            StringBuffer c=new StringBuffer("");
            for(int i=0;i<a.length;i++){
                if (a[i]==32){
                    c.append("%20");
                }else
                    c.append(a[i]);
            }
            return c.toString();
        }
    }
}

/**
 * 题目描述

 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。

 */

/*
public class Solution {
    public String replaceSpace(StringBuffer str) {
        return str.toString().replaceAll("\\s", "%20");
    }
}*/

/*
//思路
//1：从前往后插入，这样移动·的次数多不建议
//2：从后往前插入

class Solution {
    public:
    void replaceSpace(char *str,int length) {
        //遍历一边字符串找出空格的数量
        if(str==NULL||length<0)
            return ;
        int i=0;
        int oldnumber=0;//记录以前的长度
        int replacenumber=0;//记录空格的数量
        while(str[i]!='\0')
        {
            oldnumber++;
            if(str[i]==' ')
            {
                replacenumber++;
            }
            i++;
        }
        int newlength=oldnumber+replacenumber*2;//插入后的长度
        if(newlength>length)//如果计算后的长度大于总长度就无法插入
            return ;
        int pOldlength=oldnumber; //注意不要减一因为隐藏个‘\0’也要算里
        int pNewlength=newlength;
        while(pOldlength>=0&&pNewlength>pOldlength)//放字符
        {
            if(str[pOldlength]==' ') //碰到空格就替换
            {
                str[pNewlength--]='0';
                str[pNewlength--]='2';
                str[pNewlength--]='%';

            }
            else //不是空格就把pOldlength指向的字符装入pNewlength指向的位置
            {
                str[pNewlength--]=str[pOldlength];

            }
            pOldlength--; //不管是if还是elsr都要把pOldlength前移

        }


    }
};*/
