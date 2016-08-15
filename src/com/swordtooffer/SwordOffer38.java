package com.swordtooffer;

/**
 * Created by carl on 2016/8/15.
 *
 * 除了用递归，还可以利用bfs的思想，层次遍历这颗树
 */
public class SwordOffer38 {
    public int TreeDepth(TreeNode pRoot)
    {
        if(pRoot==null){
            return 0;
        }
        else{
            int a=TreeDepth(pRoot.right);
            int b=TreeDepth(pRoot.left);
            return a>b?a+1:b+1;
        }

    }
}

/**
 * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。

 */
