package wenjing.List;

import wenjing.LeetCode.ListNode;

/**
 * Created by yamengwenjing on 2017-04-10.
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return  head;
        }
        ListNode currentNode = head;

        while (currentNode.next!=null){
            if(currentNode.next.val==val){
                currentNode.next = currentNode.next.next;
            }else
                currentNode = currentNode.next;
        }

        return head.val==val? head.next:head;
    }

    public ListNode removeElements2(ListNode head, int val) {
        if (head == null) return null;
        head.next = removeElements2(head.next, val);
        return head.val == val ? head.next : head;
    }
}
