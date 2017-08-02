package jiuzhang.linkedList.practise;

import wenjing.LeetCode.ListNode;

/**
 * Created by yangw on 2017/8/2.
 */
public class removeDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
            //如果长度为1的链表 直接返回
            if(head == null||head.next==null){
                return head;
            }
            ListNode current = head;
            while (current!=null&&current.next!=null) {
                if (current.val == current.next.val) {
                    current.next = current.next.next;
                } else {
                    current = current.next;
                }
            }
            return head;
    }
}
