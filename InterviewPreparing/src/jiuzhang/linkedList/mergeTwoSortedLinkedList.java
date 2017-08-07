package jiuzhang.linkedList;

import wenjing.LeetCode.ListNode;

/**
 * Created by yangw on 2017/8/3.
 */
public class mergeTwoSortedLinkedList {
    public ListNode mergeTwoListsNorec(ListNode l1, ListNode l2) {

        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }

        ListNode dummy = new ListNode(0),head = dummy;
        while (l1!=null&&l2!=null){
            if(l1.val<l2.val){
                head.next = l1;
                l1 = l1.next;
            }else {
                head.next=l2;
                l2 =l2.next;
            }
            head = head.next;
        }
        if(l1!=null){
            head.next=l1;
        }
        if(l2!=null){
            head.next= l2;
        }
        return dummy.next;
    }
    //递归的更简单
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }

        ListNode mergeHead;
        if(l1.val < l2.val){
            mergeHead = l1;
            mergeHead.next = mergeTwoLists(l1.next, l2);
        }
        else{
            mergeHead = l2;
            mergeHead.next = mergeTwoLists(l1, l2.next);
        }
        return mergeHead;
    }
}
