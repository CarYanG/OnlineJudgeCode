package com.nowcoderhuawei;

import java.util.*;

/**
 * Created by carl on 2016/4/13.
 */
public class Huawei14 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int num=sc.nextInt();
            List<String> stringlist=new ArrayList<>();
            for(int i=0;i<num;i++){
                stringlist.add(sc.next().toString());
            }
            Collections.sort(stringlist, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
            });

            for(String s : stringlist){
                System.out.println(s);
            }


        }
    }
}


/**
 * 题目描述

 给定n个字符串，请对n个字符串按照字典序排列。
 输入描述:
 输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。


 输出描述:
 数据输出n行，输出结果为按照字典序排列的字符串。

 输入例子:
 9
 cap
 to
 cat
 card
 two
 too
 up
 boat
 boot

 输出例子:
 boat
 boot
 cap
 card
 cat
 to
 too
 two
 up



 import java.util.Collections;
 import java.util.Iterator;
 import java.util.Scanner;
 import java.util.Vector;

 public class StringSort {
 //方法一
 //  public static void main(String[] args) {
 //      Scanner in=new Scanner(System.in);
 //      int n=in.nextInt();
 //      String[] arr = new String[n];
 //      for (int i = 0; i < n; i++) {
 //          arr[i]=in.next();
 //      }
 //      sortString(arr);
 //      for (int i = 0; i < arr.length; i++) {
 //          System.out.println(arr[i]);
 //      }
 //  }
 //
 //  private static void sortString(String[] arr) {
 //      String temp=null;
 //      for (int i = 0; i < arr.length-1; i++) {
 //          for (int j = i+1; j < arr.length; j++) {
 //              if(arr[i].compareTo(arr[j])>0){
 //                  temp=arr[i];
 //                  arr[i]=arr[j];
 //                  arr[j]=temp;
 //              }
 //          }
 //      }
 //  }
 //方法二
 public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     Vector<String> ve=new Vector<String>();
     for (int i = 0; i < n; i++) {
         ve.add(in.next());
     }
    Collections.sort(ve);
    Iterator it=ve.iterator();
     while(it.hasNext()){
         System.out.println(it.next());
 }
 }
 }
 */