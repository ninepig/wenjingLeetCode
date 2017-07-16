package jiuzhang.linkedList;

import wenjing.LeetCode.ListNode;

/**
 * Created by yangw on 2017/7/16.
 */
public class partitionList {
    public ListNode partition2(ListNode head, int x) {

        if(head==null){
            return head;
        }
       ListNode tempHead = head;
        ListNode firstDummy = new ListNode(0);
        ListNode secondDummy = new ListNode(0);
        firstDummy.next = head;
        secondDummy.next = head;
        head = firstDummy;

        while (head.next!=null){
            if(head.next.val<3){
                head = head.next;
            }else {
                head.next = head.next.next;
            }
        }

        tempHead = secondDummy;
        while (tempHead.next!=null){
            if(tempHead.next.val>=3){
                tempHead = tempHead.next;
            }else {
                tempHead.next = tempHead.next.next;
            }
        }
        head.next = secondDummy.next;

        return firstDummy.next;
    }
    public ListNode partition(ListNode head, int x) {

        if(head==null){
            return head;
        }
        ListNode dummyLeft = new ListNode(0),dummyRight= new ListNode(0);
        ListNode left = dummyLeft,right = dummyRight;

        while (head !=null){
            if(head.val<x){
                left.next = head;
                left = head;
            }else {
                right.next = head;
                right = head;
            }
            head = head.next;
        }
        right.next = null;
        left.next = dummyRight.next;
        return dummyLeft.next;
    }

}
