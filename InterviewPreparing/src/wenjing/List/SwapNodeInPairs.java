package wenjing.List;

import wenjing.LeetCode.ListNode;

/**
 * Created by yamengwenjing on 2016-11-15.
 */
public class SwapNodeInPairs {

    //把第二节点保存下来
    //第一个节点的下一个节点是翻转后的第三个节点
    //第一个节点变成第二个节点
    public ListNode swapPairs(ListNode head) {

        if(head==null||head.next==null){
            return head;
        }
        ListNode tempNode = head.next;
        head.next = swapPairs(head.next.next);
        tempNode.next = head;

        return tempNode;

    }



}
