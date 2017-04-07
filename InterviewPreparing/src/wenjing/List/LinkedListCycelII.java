package wenjing.List;

import wenjing.LeetCode.ListNode;

/**
 * Created by yamengwenjing on 2017-04-02.
 *找环的第一个点
 */
public class LinkedListCycelII {

    public ListNode detectCycle(ListNode head) {
        if(head == null||head.next==null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                break;
            }
        }
        //if there is no cycle
        if (fast == null || fast.next == null) {
            return null;
        }

        slow = head;
        while (fast!=slow){
            slow =slow.next;
            fast=fast.next;
        }
        return slow;



    }
}
