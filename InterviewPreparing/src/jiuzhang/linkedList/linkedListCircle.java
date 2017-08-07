package jiuzhang.linkedList;

import wenjing.LeetCode.ListNode;

import java.util.HashSet;

/**
 * Created by yangw on 2017/8/3.
 */
public class linkedListCircle {
    public boolean hasCycleNormal(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;

    }

    public boolean hasCycleHsh(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        HashSet<ListNode> set = new HashSet<>();
        while (head!=null){
            if(set.contains(head)){
                return true;
            }else {
                set.add(head);
            }
            head=head.next;
        }
        return  false;
    }
}
