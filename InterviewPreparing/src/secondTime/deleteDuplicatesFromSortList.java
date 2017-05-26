package secondTime;

import wenjing.LeetCode.ListNode;

/**
 * Created by yamengwenjing on 2017-05-04.
 */
public class deleteDuplicatesFromSortList {

    public ListNode deleteDuplicates(ListNode head) {

        if(head==null){
            return head;
        }
        int tempVal = head.val;
        ListNode current = head;

        while(current.next!=null){
            ListNode temp = current.next;
            if(tempVal == temp.val){
                current.next = current.next.next;
            }else {
                current = current.next;
                tempVal = current.val;
            }

        }




        return head;
    }


}
