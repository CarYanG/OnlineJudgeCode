package com.swordtooffer;

/**
 * Created by carl on 2016/9/1.
 * 翻转单词顺序列
 */
public class SwordOffer44 {
    public String ReverseSentence(String str) {
        if(str.trim().equals("")){
            return str;
        }

        else{
            String ap[]=str.split(" ");
            StringBuilder result=new StringBuilder();
            int i=ap.length-1;
            for(;i>0;i--){
                result.append(ap[i]+" ");
            }
            if(i>=0){
                result.append(ap[i]);
            }

            return result.toString();
        }


    }




    public static void main(String[] args) {
        String test="I am a student.";
        System.out.println(new SwordOffer44().ReverseSentence("        "));
    }
}

/**
 * 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，
 * 写些句子在本子上。同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。
 * 例如，“student. a am I”。
 * 后来才意识到，这家伙原来把句子单词的顺序翻转了，
 * 正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？

 */

/*
使用递归 一行代码；
public class Solution {
    public String ReverseSentence(String str) {
        return (str.lastIndexOf(" ")==-1)?str:str.substring(str.lastIndexOf(" ")+1) +" "+ReverseSentence(str.substring(0,str.lastIndexOf(" ")));
    }
}
 */