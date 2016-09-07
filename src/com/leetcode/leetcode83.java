package com.leetcode;

/**
 * Created by carl on 2016/9/4.
 *
 * Remove Duplicates from Sorted List
 */
public class leetcode83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null) return  null;
        ListNode pre=head;
        ListNode current=pre.next;
        while(current!=null){
            if(current.val!=pre.val){
                pre.next=current;
                pre=current;
            }
            if(current.next==null){
                pre.next=null;
            }

            current=current.next;

        }

        return  head;

    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode a2=new ListNode(1);
        ListNode a3=new ListNode(2);

        ListNode a4=new ListNode(3);
        ListNode a5=new ListNode(3);
        ListNode a6=new ListNode(4);
        ListNode a7=new ListNode(5);
        ListNode a8=new ListNode(5);
        head.next=a2;
        a2.next=a3;
        a3.next=a4;
        a4.next=a5;
        a5.next=a6;
        a6.next=a7;
        a7.next=a8;


        ListNode result=new leetcode83().deleteDuplicates(head);
        while (result!=null){
            System.out.println(result.val);
            result=result.next;
        }

    }
}

/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.

 For example,
 Given 1->1->2, return 1->2.
 Given 1->1->2->3->3, return 1->2->3.

 */
