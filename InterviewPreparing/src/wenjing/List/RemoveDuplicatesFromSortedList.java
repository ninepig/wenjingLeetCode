package wenjing.List;

import wenjing.LeetCode.ListNode;

import java.util.HashSet;

/**
 * Created by yamengwenjing on 2017-03-21.
 */
public class RemoveDuplicatesFromSortedList {


    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }

        ListNode currentPoint = head;
//        int tempValue = currentPoint.val;
        while (currentPoint!=null&&currentPoint.next!=null){
            if(currentPoint.next.val == currentPoint.val){
                currentPoint.next = currentPoint.next.next;
            }else {
                currentPoint = currentPoint.next;
            }

        }

        return head;
    }


}
