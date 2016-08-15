package com.swordtooffer;

/**
 * Created by carl on 2016/8/15.
 *
 *  设题目中这两个只出现1次的数字分别为A和B，如果能将A，B分开到二个数组中，那显然符合“异或”解法的关键点了。
 *
 *  因此这个题目的关键点就是将A，B分开到二个数组中。
 */
public class SwordOffer40 {
    private void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        //先求异或结果
            int a=0;
            for(int i=0;i<array.length;i++){
                a=a^array[i];
            }
        System.out.println("a="+a);
        //找出A，B从低位开始不同的位
            int j=0;
            for(;j<32;j++){
                if((a>>j & 1)!=0){
                    System.out.println("error");
                    break;
                }

            }
        System.out.println("j="+j);


        //开始分组
            for(int i=0;i<array.length;i++){
                if((array[i]>>j &1)==0){
                    num1[i]=array[i];
                }
           else
                {
                    num2[i]=array[i];
                }
            }

        //找出组内的要求的数字
        int m=0;
        for(int i=0;i<num1.length;i++){
            System.out.println(num1[i]);
            m=m^num1[i];
        }
        num1[0]=m;
        System.out.println("********");

        int n=0;
        for(int i=0;i<num2.length;i++){
            System.out.println(num2[i]);
            n=n^num2[i];
        }
        num2[0]=n;
        System.out.println("********");
        System.out.println(num1[0]);
        System.out.println(num2[0]);

    }


    public static void main(String[] args) {
//        int []array={2,4,3,6,3,2,5,5};
//        int num1[]=new int [array.length];
//        int num2[]=new int [array.length];
//        new SwordOffer40().FindNumsAppearOnce(array,num1,num2);
    }

}
/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。

 */