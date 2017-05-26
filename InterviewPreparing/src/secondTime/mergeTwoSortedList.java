package secondTime;

import wenjing.LeetCode.ListNode;

/**
 * Created by Administrator on 2017/5/10.
 */
public class mergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1==null && l2 == null){
            return l1;
        }
        if(l1==null && l2!= null){
            return l2;
        }
        if(l1!=null && l2== null){
            return l1;
        }
        ListNode  newHead = new ListNode(0);
        ListNode pre = newHead;
        ListNode p1 = l1;
        ListNode p2 = l2;
        pre.next = p1;
        while(p1!=null&&p2!=null){
            if(p1.val<=p2.val){
                p1 = p1.next;
            }else {
                ListNode temp = p2.next;
                p2.next = pre.next;
                pre.next = p2;
                p2 = temp;
            }
            pre = pre.next;
        }

        if(p1 == null){
            pre.next = p2;
        }

        return newHead.next;





    }

}
