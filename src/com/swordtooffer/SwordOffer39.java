package com.swordtooffer;

/**
 * Created by Administrator on 2016/8/13.
 *
 * 最好不要用递归，重复计算高度
 */
public class SwordOffer39 {
    public boolean IsBalanced_Solution(TreeNode root) {

        if(root==null){
            return true;
        }
        else{
            int a=getHeight(root.right);
            int b=getHeight(root.left);
            if (a-b>1||a-b<-1){
                return false;
            }
            return IsBalanced_Solution(root.left)&& IsBalanced_Solution(root.right);


        }


    }

    public int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }

        return getHeight(root.left)>getHeight(root.right)? getHeight(root.left)+1:getHeight(root.right)+1;

    }


    public static void main(String args[]){
        TreeNode a1=new TreeNode(1);
        TreeNode a2=new TreeNode(2);
        TreeNode a3=new TreeNode(3);
        TreeNode a4=new TreeNode(4);
        TreeNode a5=new TreeNode(5);
        TreeNode a6=new TreeNode(6);

        a1.left=a2;
        a1.right=a3;
        a2.left=a4;
        a2.right=a5;
        a5.left=a6;


        System.out.println(new SwordOffer39().IsBalanced_Solution(a1));
        System.out.println(new SwordOffer39().getHeight(a5));

    }
}

/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。

 */