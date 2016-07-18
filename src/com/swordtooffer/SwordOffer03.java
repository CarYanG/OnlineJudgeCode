package com.swordtooffer;
import java.util.ArrayList;


/**
 * Created by carl on 2016/4/20.
 *
 * 从尾到头打印链表
 *
 * 采用递归的方式
 */
public class SwordOffer03 {

    ArrayList<Integer> result=new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        if (listNode!=null){

            printListFromTailToHead(listNode.next);
            result.add(listNode.val);
        }
        return result;
    }



}


 class ListNode {
          int val;
          ListNode next = null;
          ListNode(int val)
          {
              this.val = val;
          }
       }


/**
 * 题目描述

 输入一个链表，从尾到头打印链表每个节点的值。
 输入描述:
 输入为链表的表头


 输出描述:
 输出为需要打印的“新链表”的表头

 */
