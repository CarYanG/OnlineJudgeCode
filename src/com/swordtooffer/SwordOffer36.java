package com.swordtooffer;

/**
 * Created by carl on 2016/9/1.
 *
 * 两个链表的第一个公共结点
 *
 * 找出2个链表的长度，然后让长的先走两个链表的长度差，然后再一起走
 *
 * 还有走两趟的方法，相当简便
 */
public class SwordOffer36 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {

        if(pHead1==null||pHead2==null) return  null;
        ListNode temp1=pHead1;
        ListNode temp2=pHead2;
        int alength=0;
        while(temp1!=null){
            alength++;
            temp1=temp1.next;
        }

        int blength=0;
        while(temp2!=null){
            blength++;
            temp2=temp2.next;
        }

        int difflength=0;
        if(alength>=blength){
            difflength=alength-blength;
            while(difflength>0){
                pHead1=pHead1.next;
                difflength--;
            }

            while (pHead1!=null){
                if(pHead1.val==pHead2.val){
                    return pHead1;
                }
                else{
                    pHead1=pHead1.next;
                    pHead2=pHead2.next;
                }
            }
        }
        else{
            difflength=blength-alength;
            while(difflength>0){
                pHead2=pHead2.next;
                difflength--;
            }

            while (pHead2!=null){
                if(pHead2.val==pHead1.val){
                    return pHead2;
                }
                else{
                    pHead1=pHead1.next;
                    pHead2=pHead2.next;
                }
            }
        }

        return  null;

    }


    public static void main(String[] args) {
        ListNode head1=new ListNode(1);
        ListNode a2=new ListNode(2);
        ListNode a3=new ListNode(3);

        ListNode a4=new ListNode(4);
        ListNode a5=new ListNode(5);
        ListNode a6=new ListNode(6);
        ListNode a7=new ListNode(7);
        ListNode a8=new ListNode(1);
        head1.next=a2;
        a2.next=a3;
        a3.next=a4;
        a4.next=a5;
        a5.next=a6;
        a6.next=a7;
        a7.next=a8;


        ListNode head2=new ListNode(1);
        ListNode aa2=new ListNode(2);
        ListNode aa3=new ListNode(3);

//        ListNode aa4=new ListNode(4);
//        ListNode aa5=new ListNode(5);
        ListNode aa6=new ListNode(6);
        ListNode aa7=new ListNode(7);
        ListNode aa8=new ListNode(1);
        head2.next=aa2;
        aa2.next=aa3;
        aa3.next=aa6;
//        aa4.next=aa5;
//        aa5.next=aa6;
        aa6.next=aa7;
        aa7.next=aa8;


        ListNode result=new SwordOffer36().FindFirstCommonNode(head1,head2);

        System.out.println(result.val);





    }
}

/**
 * 输入两个链表，找出它们的第一个公共结点。

 */
/*
class Solution {
public:
    ListNode* FindFirstCommonNode( ListNode *pHead1, ListNode *pHead2) {
        ListNode *p1 = pHead1;
        ListNode *p2 = pHead2;
        while(p1!=p2){
            p1 = (p1==NULL ? pHead2 : p1->next);
            p2 = (p2==NULL ? pHead1 : p2->next);
        }
        return p1;
    }
};
两个链表一定有交点的话，法是指向短链表指针先走完，然后指向长链表，指向长链表指针后走完，指向短链表。所以，第二次走过，一定会在交点相遇。
 */