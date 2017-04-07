package wenjing.List;

import wenjing.LeetCode.ListNode;

/**
 * Created by yamengwenjing on 2017-03-28.
 */
public class MergeTwoSortedArray {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null&&l2==null){
            return null;
        }
        if(l1==null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        //链表中用一个helper类来保存一个状态
        ListNode helper = new ListNode();
        //preNode 是 指针
        ListNode preNode = helper;
        //把指针指向L1表
        preNode.next = l1;

        while (l1!=null&&l2!=null){
            /*
            链表在l1上进行操作，如果L1<L2 则直接往下移动链表即可，不需要改变位置，如果L2的值小于L1的值，则说明我们需要把L2插入到L1上。 要保存L2后序的点。
            把当前的L2的点插入指针之后。 L2后面跟着是原来节点的后序
             */
            if(l1.val<=l2.val){
                l1 = l1.next;
            }
            else{
                ListNode tempNode = l2.next;
                preNode.next = l2;
                l2.next = preNode.next;
                l2 = tempNode;

            }
            preNode = preNode.next;
        }

        return helper.next;
    }
}
