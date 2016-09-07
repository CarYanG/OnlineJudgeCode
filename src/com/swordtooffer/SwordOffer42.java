package com.swordtooffer;

/**
 * Created by carl on 2016/9/6.
 *
 * 和为S的两个数字
 */

import java.util.ArrayList;
public class SwordOffer42 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> result=new ArrayList<>();


        int low=0;
        int high=array.length-1;

        while(low<high){
            if(array[low]+array[high]>sum){
                high--;
            }
            else if(array[low]+array[high]==sum){
                result.add(array[low]);
                result.add(array[high]);
                break;
            }
            else if(array[low]+array[high]<sum){
                low++;
            }

        }
        return  result;

    }

    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> result=new SwordOffer42().FindNumbersWithSum(array,16);

        for(Integer a:result){
            System.out.print(a+",");
        }
    }
}

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 *
 输出描述:
 对应每个测试案例，输出两个数，小的先输出。



 数列满足递增，设两个头尾两个指针i和j，
 若ai + aj == sum，就是答案（相差越远乘积越小）
 若ai + aj > sum，aj肯定不是答案之一（前面已得出 i 前面的数已是不可能），j -= 1
 若ai + aj < sum，ai肯定不是答案之一（前面已得出 j 后面的数已是不可能），i += 1
 O(n)
 */