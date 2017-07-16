package jiuzhang.linkedList;

import wenjing.LeetCode.ListNode;

/**
 * Created by wenjingyang on 7/10/17.
 */
public class deleteDuplicatedNodeii {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next =head;
        head = dummy;
        //记住 如果用了dummy head是从dummy开始的
        while (head.next!=null&&head.next.next!=null){
            if(head.next.val==head.next.next.val){
                int tempValue = head.next.val;
                while (head.next!=null&&head.next.val==tempValue){
                    head.next=head.next.next;
                }
            }else {
//                head.next = head.next.next;
                head =head.next;
            }
        }
        return dummy.next;
    }
}
