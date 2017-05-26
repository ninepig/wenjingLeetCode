package secondTime;

import wenjing.LeetCode.ListNode;

/**
 * Created by yamengwenjing on 2017-05-01.
 */
public class reverseLinkedList {

    public ListNode reverseList(ListNode head) {

        if(head == null){
            return head;
        }

        ListNode pre = null;
        ListNode current = head;
        while(current!=null){
            ListNode tempNode = current;
            current = current.next;
            tempNode.next = pre;
            pre =tempNode;
        }

        return pre;

    }
}
