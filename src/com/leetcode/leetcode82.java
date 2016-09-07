package com.leetcode;

/**
 * Created by carl on 2016/9/4.
 *
 *
 * 82. Remove Duplicates from Sorted List II
 *
 *
 * 与剑指offer第56题相同
 */
public class leetcode82 {
    public ListNode deleteDuplicates(ListNode pHead)
    {
        if(pHead!=null){
            ListNode head=new ListNode(-1);
            head.next=pHead;

            ListNode current=pHead;
            ListNode pre=head;
            int wrong=-1;
            ListNode next=null;

            while (current!=null){
                next=current.next;
                if(next==null){
                    if(wrong!=current.val){
                        pre.next=current;
                        pre=current;
                        pre.next=null;
                    }else{
                        pre.next=null;
                    }

                }
                else if(current.val==next.val){  //与后一个相等
                    wrong=current.val;
                }
                else if(current.val!=wrong){    //与后一个不相等，而且当前也不是错误节点
                    pre.next=current;

                    pre=current;
                }

                current=current.next;

            }
            if(pre==head ){
                return null;
            }
            else
                return head.next;
        }



        else{
            return  null;
        }



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


        ListNode result=new leetcode82().deleteDuplicates(head);
        while (result!=null){
            System.out.println(result.val);
            result=result.next;
        }



    }
}

/**
 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

 For example,
 Given 1->2->3->3->4->4->5, return 1->2->5.
 Given 1->1->1->2->3, return 2->3.

 */