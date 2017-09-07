package leetcodeFromEasyTm.linkList;

import wenjing.LeetCode.ListNode;

/**
 * Created by yangw on 2017/9/3.
 */
public class deleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;

    }
}
