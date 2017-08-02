package jiuzhang.linkedList.practise;

import wenjing.LeetCode.ListNode;

/**
 * Created by yangw on 2017/8/2.
 */
public class RemoveDulicatedFromSlII {
    public ListNode deleteDuplicates(ListNode head) {
            if(head==null||head.next==null){
                return  head;
            }
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            head = dummy;

            while (head.next!=null&&head.next.next!=null){
                if(head.next.val==head.next.next.val){
                    int temp = head.next.val;
                    //if the next node value is eqaul to current,delete it.till the node value not equal to temp value
                    while (head.next!=null&&(head.next.val==temp)){
                        head.next = head.next.next;
                    }
                }else
                    head = head.next;
            }
            return dummy.next;


    }
}
