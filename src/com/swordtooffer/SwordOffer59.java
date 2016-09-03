package com.swordtooffer;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by carl on 2016/9/1.
 *
 * 按之字形顺序打印二叉树
 */
public class SwordOffer59 {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result=new  ArrayList<ArrayList<Integer>>();
        int count=1;
        if(pRoot==null) return result;
        else {
            Queue<TreeNode> temp=new LinkedList<>();
            temp.add(pRoot);

//            LinkedList<TreeNode> temp = new LinkedList<>();
//            temp.descendingIterator();   //用于从右向左
//            temp.iterator()    //用于从左向右

            while(temp.size()!=0){
                ArrayList<Integer> listtemp=new ArrayList<>();

                for(TreeNode a:temp){
                    listtemp.add(a.val);
                }
                if(count%2==0){
                    Collections.reverse(listtemp);
                    result.add(listtemp);
                }
                else{
                    result.add(listtemp);
                }


                count++;
                int i=temp.size();



                for(int j=0;j<i;j++){

                    if(temp.element().left!=null){
                        temp.add(temp.element().left);
                    }
                    if(temp.element().right!=null){
                        temp.add(temp.element().right);
                    }

                    temp.poll();



                }





            }


            return  result;
        }

    }


    public static void main(String[] args) {
        TreeNode head=new TreeNode(8);
        TreeNode a1=new TreeNode(1);
        TreeNode a2=new TreeNode(2);
        TreeNode a3=new TreeNode(3);
        TreeNode a4=new TreeNode(4);
        TreeNode a5=new TreeNode(5);
        TreeNode a6=new TreeNode(6);

        head.left=a1;
        head.right=a2;
        a1.left=a3;
        a1.right=a4;
        a2.left=a5;
        a2.right=a6;

        ArrayList<ArrayList<Integer>> result=new SwordOffer59().Print(head);

        for(ArrayList<Integer> a:result){

            for(Integer b:a){
                System.out.print(b+",");
            }
            System.out.println();
        }




    }

}



/**
 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 *
 *
 *
 * /**
 * 大家的实现很多都是将每层的数据存进ArrayList中，偶数层时进行reverse操作，
 * 在海量数据时，这样效率太低了。
 * （我有一次面试，算法考的就是之字形打印二叉树，用了reverse，
 * 直接被鄙视了，面试官说海量数据时效率根本就不行。）
 *
 * 下面的实现：不必将每层的数据存进ArrayList中，偶数层时进行reverse操作，直接按打印顺序存入
 * 思路：利用Java中的LinkedList的底层实现是双向链表的特点。
 *     1)可用做队列,实现树的层次遍历
 *     2)可双向遍历,奇数层时从前向后遍历，偶数层时从后向前遍历
 */




