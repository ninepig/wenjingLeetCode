package jiuzhang.linkedList.practise;

import wenjing.LeetCode.ListNode;

/**
 * Created by yangw on 2017/8/2.
 */
public class partitionList {
    public ListNode partition(ListNode head, int x) {

        if(head==null){
            return head;
        }
        ListNode dummyLeft = new ListNode(0),dummyRight = new ListNode(0);
        //right left are the reference to dummyleft,dummyright. draw a picture , you can see that
        ListNode left =dummyLeft;
        ListNode right = dummyRight;


        while (head!=null){
            if(head.val<x){
                //if head value less x , we set head to left.next, then we pointer left to head!
                left.next = head;
                left = head;
            }else {
                right.next = head;
                right = head;
            }
            head = head.next;
        }
        right.next = null;
        //connect left and right.
        left.next = dummyRight.next;

        return dummyLeft.next;
    }
}
