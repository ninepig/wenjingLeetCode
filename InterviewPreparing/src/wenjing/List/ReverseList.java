package wenjing.List;

import wenjing.LeetCode.ListNode;

/**
 * Created by yamengwenjing on 2016-11-21.
 */
public class ReverseList {
    public ListNode reverseList(ListNode head){
        if(head == null){
            return  head;
        }
        //画图解决
        ListNode currentNode = head;
        ListNode newHead = null;
        while(currentNode !=null){
//          //每次遍历都会创造一个新的节点，新的节点就是新的头点，但是要让newhead指向这个节点，这个新的节点的下一个节点是之前的头结点
            ListNode tempNode = currentNode;
            currentNode = currentNode.next;
            tempNode.next = newHead;
            newHead = tempNode;
        }

        return newHead;
    }

    public ListNode reverseListRe(ListNode head){
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

    public ListNode reverseListFeb2017(ListNode head){
        if(head==null){
            return head;
        }
        ListNode newHead = null;
        ListNode currentNode = head;
        while(currentNode!=null){
            ListNode tempNode = currentNode;
            currentNode = currentNode.next;
            tempNode.next = newHead;
            newHead = tempNode;
        }

        return newHead;
    }


}
