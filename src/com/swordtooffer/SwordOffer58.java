package com.swordtooffer;

import java.util.*;

/**
 * Created by carl on 2016/8/11.
 */
public class SwordOffer58 {


    boolean isSymmetrical(TreeNode pRoot)

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
//            if(treeNodeQueue.size()!=0){
//                List<Integer> treeNodeList=new ArrayList<Integer>();
//                Iterator iterator = treeNodeQueue.iterator();
//                while(iterator.hasNext()){
//                    TreeNode element = (TreeNode) iterator.next();
//                    treeNodeList.add(element.val);
//                }
//
//                if(treeNodeList.size()%2!=0){  //奇数，不对称
//                    return false;
//                }
//                int low=0;
//                int high=treeNodeList.size()-1;
//                while(low<high){
//                    if(treeNodeList.get(low++)!=treeNodeList.get(high--)){
//                        return false;
//
//                    }
//                }
//            }

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

        System.out.println(new SwordOffer58().isSymmetrical(root));

    }
}

/**
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。

 */