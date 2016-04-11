package com.nowcoderhuawei;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by carl on 2016/4/11.
 */
public class Huawei08 {

    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int number=input.nextInt();
            HashMap<Integer,Integer> data=new HashMap();
            for(int i=0;i<number;i++){
                int key =input.nextInt();
                int value=input.nextInt();
                if(data.containsKey(key)){
                    data.put(key,data.get(key)+value);
                }
                else
                    data.put(key,value);
            }


          for(Integer a:data.keySet()){
              System.out.println(a+" "+data.get(a));
          }

        }
    }
}


/**
 * 题目描述

 数据表记录包含表索引和数值，请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。

 输入描述:
 先输入键值对的个数
 然后输入成对的index和value值，以空格隔开


 输出描述:
 输出合并后的键值对（多行）

 输入例子:
 4
 0 1
 0 2
 1 2
 3 4

 输出例子:
 0 3
 1 2
 3 4

 */