package com.swordtooffer;

/**
 * Created by Administrator on 2016/8/13.
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
        if(root.left!=null||root.right!=null){
            return 1;
        }

        return getHeight(root.left)>getHeight(root.right)? getHeight(root.left):getHeight(root.right);

    }
}

/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。

 */