package com.swordtooffer;

/**
 * Created by carl on 2016/4/18.
 */
public class SwordOffer07 {
    public static void main(String args[]){

    }
    public int JumpFloor(int target) {
        if(target==1){
            return 1;
        }
        if(target==2){
            return 2;
        }
        if(target==3){
            return 3;
        }
        if(target==4){
            return 5;
        }
        if(target>=5){
            return JumpFloor(target-1)+JumpFloor(target-2);
        }

        return 0;

    }

}
/**
 *题目描述

 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法

 对于本题,前提只有 一次 1阶或者2阶的跳法。
 a.如果两种跳法，1阶或者2阶，那么假定第一次跳的是一阶，那么剩下的是n-1个台阶，跳法是f(n-1);
 b.假定第一次跳的是2阶，那么剩下的是n-2个台阶，跳法是f(n-2)
 c.由a\b假设可以得出总跳法为: f(n) = f(n-1) + f(n-2)
 d.然后通过实际的情况可以得出：只有一阶的时候 f(1) = 1 ,只有两阶的时候可以有 f(2) = 2
 e.可以发现最终得出的是一个斐波那契数列：

 | 1, (n=1)
 f(n) =     | 2, (n=2)
 | f(n-1)+f(n-2) ,(n>2,n为整数)




 */
//public class Solution {
//    public int JumpFloor(int target) {
//        if (target <= 0) {
//            return -1;
//        }  else if (target == 1) {
//            return 1;
//        } else if (target ==2) {
//            return 2;
//        } else {
//            return  JumpFloor(target-1)+JumpFloor(target-2);
//        }
//    }
//}


/*
总之就是用迭代不用递归就好
class Solution {
    public:
    int jumpFloor(int number) {
        if(number==1||number==2)
        {return number;}

        int jumpFib=0;
        int NumberMinusOne=2;
        int NumberMinusTwo=1;
        for(int i=3;i<=number;i++){
            jumpFib = NumberMinusOne+NumberMinusTwo;
            NumberMinusTwo = NumberMinusOne;
            NumberMinusOne = jumpFib;

        }
        return jumpFib;



    }
};*/


/*class Solution {//动态规划

    public:

    int jumpFloor(int number) {

        int res1 =1,res2 = 1;

        while(number--){

            res2+=res1;

            res1 =res2 - res1;

        }

        return res1;

    }

};*/
