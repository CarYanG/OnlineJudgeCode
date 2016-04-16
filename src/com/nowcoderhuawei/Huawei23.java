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
                    lhs.put(a.charAt(i),lhs.get(a.charAt(i)+1));
                }
                else {
                    lhs.put(a.charAt(i),0);
                }
            }
            List<Map.Entry<String, Integer>> infoIds =
                    new ArrayList<Map.Entry<String, Integer>>(lhs.entrySet());

            Collections.sort(infoIds, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o1.getValue().compareTo(o2.getValue());
                }
            });


            int c=(int)lhs.values().toArray()[0];
            System.out.println(c);

        }
    }
}

/**
 * 题目描述

 实现删除字符串中出现次数最少的字符，若多个字符出现次数一样，则都删除。输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。

 输入描述:
 字符串只包含小写英文字母, 不考虑非法输入，输入的字符串长度小于等于20个字节。


 输出描述:
 删除字符串中出现次数最少的字符后的字符串。

 输入例子:
 abcdd

 输出例子:
 dd

 */