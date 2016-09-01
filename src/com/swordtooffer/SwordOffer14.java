package com.swordtooffer;

/**
 * Created by carl on 2016/8/31.
 * 链表中倒数第k个结点
 */
public class SwordOffer14 {
    public ListNode FindKthToTail(ListNode head,int k) {

        if(head==null){
            return null;
        }
        if (k==0) {
            return null;
        }

        ListNode p=head;
        ListNode q=head;

        while (k-1>0){
            if(p.next==null){
                return null;
            }
            else {
                p=p.next;
            }
            k--;

        }
        while(p.next!=null){
            p=p.next;
            q=q.next;
        }


        return q;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode a2=new ListNode(2);
        ListNode a3=new ListNode(3);

        ListNode a4=new ListNode(4);
        ListNode a5=new ListNode(5);
        ListNode a6=new ListNode(6);
        ListNode a7=new ListNode(7);
        ListNode a8=new ListNode(8);
        head.next=a2;
        a2.next=a3;
        a3.next=a4;
        a4.next=a5;
        a5.next=a6;
        a6.next=a7;
        a7.next=a8;


        ListNode result=new SwordOffer14().FindKthToTail(head,0);
        if(result==null){
            System.out.println("null");
        }
        else

            System.out.println(result.val);



    }
}
/*
输入一个链表，输出该链表中倒数第k个结点。


倒数第k个，也就是正数total-k个
public class Solution {
    public ListNode FindKthToTail(ListNode list,int k) {
if (list == null)   return list;

        ListNode node = list;
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        if (count < k)  return null;

        ListNode p = list;
        for (int i = 0; i < count - k; i++) {
            p = p.next;
        }

        return p;
    }
}
 */