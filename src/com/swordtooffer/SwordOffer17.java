package com.swordtooffer;

/**
 * Created by carl on 2016/8/31.
 *
 * 树的子结构
 */
public class SwordOffer17 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root2==null||root1==null) return  false;

        while (root1!=null){

            if(root1.val==root2.val){

            }
        }



        return  false;
    }
}

/**
 *
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）

 */