package jiuzhang.linkedList;

import wenjing.LeetCode.ListNode;

/**
 * Created by yangw on 2017/7/16.
 */
public class sortList {
    public ListNode sortList(ListNode head) {
        if(head == null||head.next==null){
            return head;
        }
        ListNode mid = findMid(head);
        ListNode right = sortList(mid.next);
        mid.next = null;
        ListNode left = sortList(head);

        return merge(left,right);
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode();
        ListNode head = dummy;
        while (left!=null&&right!=null){
            if(left.val<right.val){
                head.next = left;
                left = left.next;
            }else {
                head.next=right;
                right = right.next;
            }
            head = head.next;
        }
        if(left !=null){
            head.next = left;
        }
        if(right!=null){
            head.next=right;
        }
        return dummy.next;
    }

    private ListNode findMid(ListNode head) {
        ListNode slow = head, fast = head.next;
        while (fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
