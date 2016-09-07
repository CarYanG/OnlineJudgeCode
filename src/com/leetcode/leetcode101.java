package com.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by carl on 2016/9/4.
 *
 * 与剑指offer第58题相同
 *  Symmetric Tree
 */
public class leetcode101 {


    boolean isSymmetric(TreeNode pRoot)

    {
        //层析遍历这个树，分析每层的节点
        Queue<TreeNode> treeNodeQueue=new LinkedList<TreeNode>();
        if(pRoot!=null){
            treeNodeQueue.add(pRoot);
        }

        while(treeNodeQueue.size()!=0){
            int nowNumber=treeNodeQueue.size(); //记录当前队列的长度
            List<String> treeNodeList=new ArrayList<String>();
            for(int i=0;i<nowNumber;i++){
                TreeNode temp=treeNodeQueue.poll();
                if(temp.right!=null){
                    treeNodeQueue.offer(temp.right);
                    treeNodeList.add(temp.right.val+"");

                }
                else{
                    treeNodeList.add("#");
                }
                if(temp.left!=null){
                    treeNodeQueue.offer(temp.left);
                    treeNodeList.add(temp.left.val+"");
                }
                else{
                    treeNodeList.add("#");
                }

            }

            int low=0;
            int high=treeNodeList.size()-1;
            while(low<high) {
                String a=treeNodeList.get(low++);
                String b=treeNodeList.get(high--);
                if (!(a.equals(b))) {
                    return false;
                }
            }


        }


        return true;
    }

    public static void main(String argsp[]){
        TreeNode root=new TreeNode(5);
        TreeNode left1=new TreeNode(5);
        TreeNode left2=new TreeNode(5);
        TreeNode left3=new TreeNode(5);

        TreeNode right1=new TreeNode(5);
        TreeNode right2=new TreeNode(5);
        TreeNode right3=new TreeNode(5);

        root.left=left1;
        root.right=right1;

        left1.left=left2;
        left2.left=left3;

        right1.right=right2;
        right2.left=right3;

        System.out.println(new leetcode101().isSymmetric(root));

    }


}
/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

 For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

       1
     /  \
   2    2
  / \ / \
 3  4 4  3
 But the following [1,2,2,null,3,null,3] is not:
  1
 / \
 2   2
 \   \
 3    3
 Note:
 Bonus points if you could solve it both recursively and iteratively.

 Subscribe to see which companies asked this question

 */