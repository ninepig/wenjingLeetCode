package jiuzhang.linkedList;

import wenjing.LeetCode.ListNode;

/**
 * Created by wenjingyang on 7/10/17.
 */
public class deleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null||head.next==null){
            return  head;
        }
        ListNode currentNode = head;

        while (currentNode.next!=null){
            if(currentNode.next.val == currentNode.val){
                currentNode.next = currentNode.next.next;
            }else {
                currentNode=currentNode.next;
            }
        }

        return head;

    }

}
