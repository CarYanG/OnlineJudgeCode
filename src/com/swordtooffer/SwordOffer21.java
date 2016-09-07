package com.swordtooffer;

import java.util.HashMap;

/**
 * Created by carl on 2016/9/7.
 *
 * 栈的压入、弹出序列
 */
public class SwordOffer21 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        return  true;
    }

    public static void main(String[] args) {
        int pushA[]={1,2,3,4,5};
        int popA[]={3,5,4,2,1};
        int []popB={4,3,5,1,2};
        System.out.println(new SwordOffer21().IsPopOrder(pushA,popA));
    }
}

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，
 * 请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4，5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * （注意：这两个序列的长度是相等的）

 */