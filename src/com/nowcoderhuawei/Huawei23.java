package com.nowcoderhuawei;


import java.util.*;

/**
 * Created by carl on 2016/4/16.
 */
public class Huawei23 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String a=sc.next();
            LinkedHashMap lhs=new LinkedHashMap();
            for(int i=0;i<a.length();i++){
                if(lhs.containsKey(a.charAt(i))){
                    lhs.put(a.charAt(i),(int)lhs.get(a.charAt(i))+1);
                }
                else {
                    lhs.put(a.charAt(i),1);
                }
            }


            List<Map.Entry<Character, Integer>> list = new LinkedList<Map.Entry<Character, Integer>>(lhs.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>()
            {
                public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2)
                {
                    if(o2.getValue()!=null&&o1.getValue()!=null&&o2.getValue().compareTo(o1.getValue())<0){
                        return 1;
                    }else{
                        return -1;
                    }

                }
            });

           int min=list.get(0).getValue();
            for(Character ch:a.toCharArray()){
                if((int)lhs.get(ch)!=min){

                    System.out.print(ch);
                }
            }
            System.out.println("");


//
//            for(Iterator<Map.Entry<Character, Integer>> ite = list.iterator(); ite.hasNext();) {
//                Map.Entry<Character, Integer> map = ite.next();
//                System.out.println("key-value: " + map.getKey() + "," + map.getValue());
//            }
//
//
//            int c=(int)lhs.values().toArray()[0];
//            System.out.println(c);

        }
    }
}

/**
 * 题目描述

 实现删除字符串中出现次数最少的字符， 若多个字符出现次数一样，则都删除。输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。

 输入描述:
 字符串只包含小写英文字母, 不考虑非法输入，输入的字符串长度小于等于20个字节。


 输出描述:
 删除字符串中出现次数最少的字符后的字符串。

 输入例子:
 abcdd

 输出例子:
 dd

 */

/*
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String s = in.nextLine();
            int[] a = new int[26];
            for(int i=0;i<s.length();i++){
                a[s.charAt(i)-97]++;
            }
            int min = 21;
            //找出出现最小的次数
            for(int i=0;i<26;i++){
                if(a[i]<min && a[i]>0){
                    min = a[i];
                }
            }
            StringBuilder toBeDeleted = new StringBuilder();
            for(int i=0;i<26;i++){
                if(a[i]==min){
                    char c = (char)('a'+i);
                    toBeDeleted.append(c);
                }
            }
            String str = toBeDeleted.toString();
            StringBuilder res = new StringBuilder();
            for(int i=0;i<s.length();i++){
                if(!str.contains(s.charAt(i)+"")){
                    res.append(s.charAt(i));
                }
            }
            System.out.println(res);
        }
    }

}
*/
