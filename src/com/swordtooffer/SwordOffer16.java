package com.swordtooffer;

import java.util.List;

/**
 * Created by Administrator on 2016/8/25.
 */
public class SwordOffer16 {
    public ListNode Merge(ListNode list1,ListNode list2) {

        if(list1==null) return list2;
        if(list2==null) return  list1;
        ListNode result=null;
        ListNode head=null;
        while(list1!=null && list2!=null){

            int temp;
            if(list1.val>list2.val)
            {
                temp=list2.val;
                list2=list2.next;
            }

            else{
                temp=list1.val;
                list1=list1.next;
            }



            if(result==null){
                result =new ListNode(temp);
                head=new ListNode(0);
                head.next=result;
            }
            else{
                ListNode nextNode=new ListNode(temp);
                result.next=nextNode;
                result=result.next;
            }

        }

        if(list1==null){
            while(list2!=null){
                ListNode nextNode=new ListNode(list2.val);
                list2=list2.next;
                result.next=nextNode;
            }

        }

        if(list2==null){
            while(list1!=null){
                ListNode nextNode=new ListNode(list1.val);
                list1=list1.next;
                result.next=nextNode;
            }

        }

        return  head.next;



    }

    public static void main(String[] args) {
        ListNode L1=new ListNode(1);
        ListNode L2=new ListNode(2);
        ListNode L3=new ListNode(3);

        ListNode L4=new ListNode(4);
        ListNode L5=new ListNode(5);
        ListNode L6=new ListNode(6);


        L1.next=L3;
        L3.next=L5;

        L2.next=L4;
        L4.next=L6;

        ListNode result=new SwordOffer16().Merge(L1,L2);

        while(result!=null){
            System.out.println(result.val);
            result=result.next;


        }

    }
}

/**
 * 题目描述

 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。

 */
