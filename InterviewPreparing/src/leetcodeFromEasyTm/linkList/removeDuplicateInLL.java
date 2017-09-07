package leetcodeFromEasyTm.linkList;

import wenjing.LeetCode.ListNode;

/**
 * Created by yangw on 2017/9/6.
 */
public class removeDuplicateInLL {
    public ListNode deleteDuplicates(ListNode head) {
            if (head == null){
                return head;
            }

            ListNode current = head;
            while (current!=null&&current.next!=null) {
                if (current.val == current.next.val) {
                    current.next = current.next.next;
                } else {
                    //必须要else以后才能 current= current.next 要不然就移动两次了啊
                    current = current.next;
                }
            }

            return head;

    }
}
