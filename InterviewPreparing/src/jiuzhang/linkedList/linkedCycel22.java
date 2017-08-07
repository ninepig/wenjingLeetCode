package jiuzhang.linkedList;

import wenjing.LeetCode.ListNode;

/**
 * Created by yangw on 2017/8/3.
 */
public class linkedCycel22 {
    public ListNode detectCycle(ListNode head) {
     {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                break;
            }
        }
        if(fast==null||fast.next==null){
            return null;
        }
        slow =head;
        while (slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }
    }
}
