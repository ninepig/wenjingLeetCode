package wenjing.List;

import wenjing.LeetCode.ListNode;

import java.util.ArrayList;

/**
 * Created by yamengwenjing on 2017-04-09.
 */
public class palindromeLinkedList {

    //夹逼法
    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return true;
        }
        ArrayList<Integer> resultList = new ArrayList<>();
        ListNode temp = new ListNode(0);
        temp.next = head;
//		resultList.add(head.val);
        ListNode currentNode;

        while(temp.next!=null){
            currentNode = temp.next;
            temp = temp.next;
            resultList.add(currentNode.val);
        }

        int left = 0 ;
        int right = resultList.size()-1;

        while(left<right){

            int leftNumber = resultList.get(left);
            int rightNumber =resultList.get(right);
            //System.out.println(leftNumber +"right"+ rightNumber);
            if(leftNumber!=rightNumber){
                return false;
            }
            left++;
            right--;

        }

        return true;
    }

    private ListNode reverseNodeRecurve(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode newHead = new ListNode();
        newHead = reverseNodeRecurve(head);
        newHead.next.next = head;
        newHead.next = null;

        return newHead;
    }


    public boolean isPalindromeNoSpace(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) { // odd nodes: let right half smaller
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;

        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }


}
