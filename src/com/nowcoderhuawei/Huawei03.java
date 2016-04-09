package com.nowcoderhuawei;


import java.util.*;

/**
 * Created by carl on 2016/4/9.
 */
public class Huawei03 {


    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);


        while (input.hasNext()) {
            TreeSet inputarray = new TreeSet();
            int n = input.nextInt();
            if (n > 0) {
                for (int i = 0; i < n; i++) {
                    inputarray.add(input.nextInt());
                }
            }
            for (Object a : inputarray) {
                System.out.println(a);
            }
        }
    }
}


/**
 * 题目描述
 * <p>
 * 明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数（N≤100），对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。然后再把这些数从小到大排序，按照排好的顺序去找同学做调查。请你协助明明完成“去重”与“排序”的工作。
 * <p>
 * <p>
 * Input Param
 * n               输入随机数的个数
 * inputArray      n个随机整数组成的数组
 * <p>
 * Return Value
 * OutputArray    输出处理后的随机整数
 * <p>
 * <p>
 * 注：测试用例保证输入参数的正确性，答题者无需验证。
 * <p>
 * <p>
 * <p>
 * <p>
 * 输入描述:
 * 输入多行，先输入随机整数的个数，在输入相应个数的整数
 * <p>
 * <p>
 * 输出描述:
 * 返回多行，处理后的结果
 * <p>
 * 输入例子:
 11
 10
 20
 40
 32
 67
 40
 20
 89
 300
 400
 15
 * <p>
 * 输出例子:
 * 10
 * 15
 * 20
 * 32
 * 40
 * 67
 * 89
 * 300
 * 400
 */

/**
 * import java.util.Scanner;
 /**
 * 1、测试数据有多组，一定要有while
 * 2、需要手动输入数据，而不是计算机产生随机数
 * @author Administrator

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        while(sr.hasNext()) {
            intn = sr.nextInt();
            int[] a = newint[n];
            for(inti = 0; i < n; i++) {
                a[i] = sr.nextInt();
            }
            int[] c = qucong(a);

            for(inti = 0; i < 1000; i++) {
                if(c[i] == 1) {
                    System.out.println(i);
                }
            }
        }
    }
//位算法，去除重複數
    public static int[] qucong(int[] a) {
        int[] b = newint[1000];
        for(inti = 0; i < 1000; i++) {
            b[i] = 0;
        }
        for(inti = 0; i < a.length; i++) {
            b[a[i]] = 1;
        }
        returnb;
    }
}

 */