package com.swordtooffer;

import java.util.*;

/**
 * Created by carl on 2016/9/1.
 * 第一个只出现一次的字符
 */
public class SwordOffer34 {
    public int FirstNotRepeatingChar(String str) {
        if(str.equals("")){
            return 0;
        }
        char a[]=str.toCharArray();
        LinkedHashMap<Character,Integer> temp=new LinkedHashMap<>();
        for(char c:a){
            if(temp.containsKey(c)){
                temp.put(c,temp.get(c)+1);
            }
            else{
                temp.put(c,1);
            }
        }

        Iterator it=temp.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry entry=(Map.Entry) it.next();
            if((Integer)entry.getValue()==1){
                return str.indexOf(entry.getKey()+"");
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        String a="abcdefggfcb";
        System.out.println(new SwordOffer34().FirstNotRepeatingChar(a));
    }
}

/**
 * 在一个字符串(1<=字符串长度<=10000，全部由大小写字母组成)中找到第一个只出现一次的字符,并返回它的位置


 可以使用hash的思想，构建一个hash[256]的数组，来作为hash表

 int FirstNotRepeatingChar(string str) {
    if ( str.length() == 0)
     return -1;

 unsigned int hashTime[256] = {0};
     for(int i =0;i<str.length();++i)
         hashTime[str[i]]++;

     for(int i =0;i<str.length();++i)
 {
     if(hashTime[str[i]] == 1)
     return i;
 }
     return -1;
 }
 */