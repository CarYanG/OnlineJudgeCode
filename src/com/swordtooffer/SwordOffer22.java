package com.swordtooffer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/**
 * Created by carl on 2016/8/31.
 * 从上往下打印二叉树
 */
public class SwordOffer22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (root == null) return result;
        else {
            Queue<TreeNode> temp = new LinkedList<>();
            temp.add(root);

            while (temp.size() != 0) {

                if (temp.element().left != null) {
                    temp.add(temp.element().left);
                }
                if (temp.element().right != null) {
                    temp.add(temp.element().right);
                }
                result.add(temp.poll().val);


            }


            return result;
        }

    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(8);
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(3);
        TreeNode a4 = new TreeNode(4);
        TreeNode a5 = new TreeNode(5);
        TreeNode a6 = new TreeNode(6);

        head.left = a1;
        head.right = a2;
        a1.left = a3;
        a1.right = a4;
        a2.left = a5;
        a2.right = a6;

        ArrayList<Integer> result = new SwordOffer22().PrintFromTopToBottom(head);

        for (Integer a : result) {


            System.out.print(a + ",");

        }
    }
}
/*
从上往下打印出二叉树的每个节点，同层节点从左至右打印。

 */