package jiuzhang.linkedList;

import wenjing.LeetCode.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by yangw on 2017/8/3.
 */
public class mergeKlists {
    public ListNode mergeKLists(ListNode[] lists) {

        ListNode dummy = new ListNode(0), cur = dummy;
        if (lists == null || lists.length < 1) {
            return null;
        }
        PriorityQueue<ListNode> minHeap = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>() {
            public int compare(ListNode l1, ListNode l2) {
                return l1.val - l2.val;
            }
        });
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                minHeap.offer(lists[i]);
            }
        }
        while (!minHeap.isEmpty()) {
            ListNode temp = minHeap.poll();
            cur.next = temp;
            if (temp.next != null) {
                minHeap.offer(temp.next);
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}
