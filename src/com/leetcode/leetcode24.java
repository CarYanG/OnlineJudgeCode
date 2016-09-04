package com.leetcode;

/**
 * Created by carl on 2016/9/4.
 *
 *  Swap Nodes in Pairs
 */
public class leetcode24 {
    public ListNode swapPairs(ListNode head) {
        if (head ==null ) return  null;


        //处理要返回的头节点
        if(head.next==null) return head;

        ListNode next=head.next;

        ListNode nextpair=next.next;

        next.next=head;

        head.next=swapPairs(nextpair);



        return next;
    }

    public static void main(String[] args) {


        ListNode a1=new ListNode(1);
        ListNode a2=new ListNode(2);
        ListNode a3=new ListNode(3);
        ListNode a4=new ListNode(4);
        a1.next=a2;
        a2.next=a3;
        a3.next=a4;

        ListNode result=new leetcode24().swapPairs(a1);
        while(result!=null){
            System.out.println(result.val);
            result=result.next;
        }


    }
}
/**
 * Given a linked list, swap every two adjacent nodes and return its head.

 For example,
 Given 1->2->3->4, you should return the list as 2->1->4->3.

 Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.

 */