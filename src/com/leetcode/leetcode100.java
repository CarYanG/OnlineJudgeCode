package com.leetcode;

/**
 * Created by carl on 2016/9/4.
 *
 * Same Tree
 */
public class leetcode100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p != null && q != null) {
            if (p.val == q.val) {
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            }
        }

        if(p==null &&q==null){
            return true;
        }
        else {
            return  false;
        }

    }



    public static void main(String[] args) {
        TreeNode a=new TreeNode(0);
        TreeNode b=new TreeNode(0);
        System.out.println(new leetcode100().isSameTree(a,b));

    }


}

/**
 * Given two binary trees, write a function to check if they are equal or not.

 Two binary trees are considered equal if they are structurally identical and the nodes have the same value.

 */

/**
 * 非递归解法
 *
 */
/*
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Queue<TreeNode> q1 = new LinkedList<TreeNode>();
        Queue<TreeNode> q2 = new LinkedList<TreeNode>();

        q1.offer(p);
        q2.offer(q);

        while( !q1.isEmpty() && !q2.isEmpty() ) {
            TreeNode x = q1.poll();
            TreeNode y = q2.poll();

            if(x==null) {
                if( y!=null) return false;
                else continue;
            }

            if(y==null || x.val!=y.val) return false;

            q1.offer( x.left);
            q1.offer( x.right);
            q2.offer(y.left);
            q2.offer(y.right);
        }

        return true;
    }
}
*/