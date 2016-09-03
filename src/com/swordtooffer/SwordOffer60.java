package com.swordtooffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by carl on 2016/8/15.
 */
public class SwordOffer60 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result=new  ArrayList<ArrayList<Integer>>();;
        if(pRoot==null) return result;
        else {
            Queue<TreeNode> temp=new LinkedList<>();
            temp.add(pRoot);

            while(temp.size()!=0){
                ArrayList<Integer> listtemp=new ArrayList<>();

                for(TreeNode a:temp){
                    listtemp.add(a.val);
                }
                result.add(listtemp);

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

        ArrayList<ArrayList<Integer>> result=new SwordOffer60().Print(head);

        for(ArrayList<Integer> a:result){

            for(Integer b:a){
                System.out.print(b+",");
            }
            System.out.println();
        }




    }

}

/**
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。

 */
