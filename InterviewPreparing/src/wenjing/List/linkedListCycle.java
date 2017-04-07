package wenjing.List;


import wenjing.LeetCode.ListNode;

/**
 * Created by yamengwenjing on 2016-11-16.
 */
public class linkedListCycle {
    public boolean hasCycle(ListNode head) {
//        if(head==null||head.next==null){
//            return false;
//        }
//        ListNode fastPointer = new ListNode(0);
//        fastPointer = head;
//        ListNode slowPointer = new ListNode(0);
//        slowPointer = head;
//        while(head!=null&&head.next!=null){
//            fastPointer = fastPointer.next.next;
//            slowPointer = slowPointer.next;
//            if(fastPointer == slowPointer){
//                return true;
//            }
//            head = head.next;
//        }
//
//             return false;
        if( head == null) return false;

        ListNode fast, slow=fast=head;
    //仔细想想，必须是fast.next 不能使fast.next.next != null 这样是有可能为空的 因为你这里需要用他的值
        //runner.next!=null && runner.next.next!=null或者是这样的条件也可以
        while( fast != null && fast.next != null) {
            fast = fast.next.next;  //2x fast
            slow = slow.next;       //1x fast

            //If they meet, then has cycle
            if( fast == slow) return true;
        }

        return false;
    }
    public boolean hasCycle2(ListNode head) {
       if(head==null||head.next==null){
           return  false;
       }
        ListNode slow = head,fast=head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;



    }




}
