package com.swordtooffer;

import java.util.Stack;

/**
 * Created by carl on 2016/8/11.
 */
public class SwordOffer58 {


    boolean isSymmetrical(TreeNode pRoot)

    {
        //遍历一下这个树，利用一个栈作为辅助
        Stack<TreeNode> treeNode=new Stack<>();
        treeNode.push(pRoot);

        while(treeNode.size()!=0){
            TreeNode nowRoot=treeNode.pop();
            if(nowRoot.left!=null || nowRoot.right!=null){
                int leftnumber;
                leftnumber= nowRoot.left==null? -1:nowRoot.left.val;
                int rightnumber;
                rightnumber= nowRoot.right==null? -1:nowRoot.right.val;

                if(leftnumber!=rightnumber){
                    return false;

                }
            }
            if(nowRoot.left!=null){
                treeNode.push(nowRoot.left);
            }
            if(nowRoot.right!=null){
                treeNode.push(nowRoot.right);
            }

        }

        return true;
    }
}

/**
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。

 */