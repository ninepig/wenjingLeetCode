package jiuzhang.linkedList;

import wenjing.LeetCode.ListNode;

/**
 * Created by yangw on 2017/8/3.
 */
public class removeNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow =dummy,fast = dummy;
        //let fast move n step at first
        while (n>0){
            fast = fast.next;
            n--;
        }
        //move slow and fast together to get end
        while (fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        //delete slow node;

        slow.next = slow.next.next;

        return dummy.next;
    }
}
