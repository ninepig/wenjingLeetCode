package wenjing.List;

import wenjing.LeetCode.ListNode;

/**
 * Created by yamengwenjing on 2017-02-27.
 */
public class DeleteNodeInLinkedList {
    public void deleteNode(ListNode node) {
        if(node==null){
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;

    }
}
