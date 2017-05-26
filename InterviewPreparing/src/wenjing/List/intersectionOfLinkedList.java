package wenjing.List;

import wenjing.LeetCode.ListNode;

/**
 * Created by yamengwenjing on 2017-04-12.
 */
public class intersectionOfLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB==null){
            return null;
        }
        int lengthA=0,lengthB=0;
        ListNode preA =headA;
        ListNode preB = headB;
        while (preA!=null){
            preA = preA.next;
            lengthA++;
        }
        while (preB!=null){
            preB =preB.next;
            lengthB++;
        }
        if(preA!=preB){
            return null;
        }
        int difference = Math.abs(lengthA-lengthB);
        if(lengthA>lengthB){
            while (difference>0){
                headA = headA.next;
                difference--;
            }
        }else {
            while (difference>0){
                headB = headB.next;
                difference--;
            }
        }
        while (headA!=headB){
            headA = headA.next;
            headB = headB.next;
        }

        return headA;


    }


}
