package com.nowcoderhuawei;

/**
 * Created by carl on 2016/4/11.
 */
import java.util.Scanner;
public class Huawei07 {
    public void function(double a){
        if((a-(int)a)>=0.5){
            System.out.println((int)a+1);
        }
        else
            System.out.println((int) a);
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            double a = input.nextDouble();
            new Huawei07().function(a);
        }
    }
}

/**
 * 题目描述

 写出一个程序，接受一个浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 输入描述:
 输入一个浮点数值


 输出描述:
 输出该数值的近似整数值

 输入例子:
 5.5

 输出例子:
 6



 import java.util.Scanner;

 import java.math.BigDecimal;



 public class  Approximate{



 public static void main(String[] args) {

 Scanner in=new Scanner(System.in);

 float fl=in.nextFloat();

 //方法一

 BigDecimal i=new BigDecimal(fl).setScale(0, BigDecimal.ROUND_HALF_UP);

 System.out.println(i);



 //方法二

 System.out.println(getApproximate(fl));



 //方法三

 if(fl>=0){

 System.out.println((int)((fl*10+5)/10));

 }

 else{

 System.out.println((int)((fl*10-5)/10));

 }

 }



 private static int getApproximate(float fl) {

 if(fl==0) return 0;

 int i=(int) fl;

 if(fl>0){

 if(fl-i>=0.5)

 return i+1;

 }else {

 if(i-fl>=0.5)

 return i-1;

 }

 return i;

 }

 }

 */
