package com.swordtooffer;



/**
 * Created by Administrator on 2016/8/26.
 */
public class SwordOffer15 {
    public ListNode ReverseList(ListNode head) {


        if (head==null) return null;
        ListNode pre=head;  //前一个节点
        ListNode current=pre.next;  //当前节点
        pre.next=null;
        while (current!=null){
            ListNode next=current.next;   //预留下一节点
            current.next=pre;

            pre=current;

            current=next;

        }

        return pre;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode a2=new ListNode(2);
        ListNode a3=new ListNode(3);

        ListNode a4=new ListNode(4);
        ListNode a5=new ListNode(5);
        ListNode a6=new ListNode(6);
        ListNode a7=new ListNode(7);
        ListNode a8=new ListNode(1);
        head.next=a2;
        a2.next=a3;
        a3.next=a4;
        a4.next=a5;
        a5.next=a6;
        a6.next=a7;
        a7.next=a8;


        ListNode result=new SwordOffer15().ReverseList(head);
        while (result!=null){
            System.out.println(result.val);
            result=result.next;
        }



    }
}


/**
 *
 * 输入一个链表，反转链表后，输出链表的所有元素。

 */