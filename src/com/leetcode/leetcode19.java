package com.leetcode;

/**
 * Created by carl on 2016/9/4.
 *  Remove Nth Node From End of List
 *
 *
 */
public class leetcode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head==null) return null;
        int length=1;
        ListNode p=head;
        while (p.next!=null){
            p=p.next;
            length++;
        }


        int target=length-n;  //找到要删除节点的前一个
        p=head;
        if(target==0) {
            p=p.next;
            return p;
        }
        while (target-1>0){
            p=p.next;
            target--;
        }
         if(p.next!=null){
             p.next=p.next.next;
         }
        else{
             p.next=null;
         }


        return head;

    }

    public static void main(String[] args) {


        ListNode a1=new ListNode(1);
        ListNode a2=new ListNode(2);
        ListNode a3=new ListNode(3);
        ListNode a4=new ListNode(4);
        ListNode a5=new ListNode(5);
        a1.next=a2;
        a2.next=a3;
        a3.next=a4;
        a4.next=a5;

        ListNode result=new leetcode19().removeNthFromEnd(a1,2);
        while(result!=null){
            System.out.println(result.val);
            result=result.next;
        }


    }
}

/**
 * Given a linked list, remove the nth node from the end of list and return its head.

 For example,

 Given linked list: 1->2->3->4->5, and n = 2.

 After removing the second node from the end, the linked list becomes 1->2->3->5.
 Note:
 Given n will always be valid.
 Try to do this in one pass.

双指针思想，两个指针相隔n-1，每次两个指针向后一步，当后面一个指针没有后继了，前面一个指针就是要删除的节点。

 */