package leetcodeFromEasyTm.linkList;

import wenjing.LeetCode.ListNode;

/**
 * Created by yangw on 2017/9/4.
 */
public class reverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode current = head;
        while(current!=null){
            ListNode temp = current.next;
            current.next = pre;
            pre = current;
            current = temp;
        }
        return pre;
    }
    public ListNode reverseListRec(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        //递归头结点的下一个节点
        ListNode newHead = reverseList(head.next);
        //头结点的下个节点的已经到了最后面，然后把他的下一个节点给新的头结点
        head.next.next = head;
        //head.next 设为空就可以
        head.next = null;

        return newHead;

    }


}
