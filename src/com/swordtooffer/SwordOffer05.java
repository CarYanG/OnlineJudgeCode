package com.swordtooffer;
import java.util.Stack;

/**
 * Created by carl on 2016/8/11.
 */


public class SwordOffer05 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);


    }

    public int pop() {
        //将栈1的元素除去栈底的那个都移到栈2，栈1出栈，栈2的所有元素再回到栈1，麻烦
        int number=stack1.size();
        for(int i=0;i<number-1;i++){
            int temp=stack1.pop();
            stack2.push(temp);
        }
        int result=stack1.pop();

        number=stack2.size();
        for(int j=0;j<number;j++){
            int temp=stack2.pop();
            stack1.push(temp);
        }
        System.out.println(result);

        return result;
    }

    public static void main(String args[]){
        SwordOffer05 test=new SwordOffer05();
        test.push(1);
        test.push(2);
        test.push(3);

//      System.out.println(test.stack1.size());


        test.pop();
        test.pop();
    }
}




/*
题目描述

用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */

/*
用两个栈实现一个队列的功能?要求给出算法和思路!
<分析>：
入队：将元素进栈A
出队：判断栈B是否为空，如果为空，则将栈A中所有元素pop，并push进栈B，栈B出栈；
 如果不为空，栈B直接出栈。
用两个队列实现一个栈的功能?要求给出算法和思路!
<分析>：
入栈：将元素进队列A
出栈：判断队列A中元素的个数是否为1，如果等于1，则出队列，否则将队列A中的元素
以此出队列并放入队列B，直到队列A中的元素留下一个，然后队列A出队列，再把   队列B中的元素出队列以此放入队列A中。
 */