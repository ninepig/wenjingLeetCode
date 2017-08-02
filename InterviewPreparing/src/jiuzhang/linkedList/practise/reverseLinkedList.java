package jiuzhang.linkedList.practise;

import wenjing.LeetCode.ListNode;

/**
 * Created by yangw on 2017/8/2.
 */
public class reverseLinkedList {
    public ListNode reverseList(ListNode head) {

        if(head == null){
            return head;
        }
        ListNode pre = null;
        while (head!=null){
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;

    }
    public ListNode reverseListRe(ListNode head) {

        if(head == null ||head.next==null){
            return head;
        }

        ListNode newHead = reverseList(head.next);
        head.next.next=head;
        head.next = null;

        return newHead;
    }
}
