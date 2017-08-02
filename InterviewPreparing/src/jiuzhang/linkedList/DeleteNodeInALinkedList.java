package jiuzhang.linkedList;

import wenjing.LeetCode.ListNode;

/**
 * Created by yangw on 2017/8/2.
 */
public class DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
        if(node == null){
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;

    }
}
