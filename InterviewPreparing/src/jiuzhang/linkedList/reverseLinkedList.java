package jiuzhang.linkedList;


import wenjing.LeetCode.ListNode;

/**
 * Created by yangw on 2017/7/10.
 *
 */
public class reverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode prev = null;
        while (head!=null){
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }

}
