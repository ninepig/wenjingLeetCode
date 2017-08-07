package jiuzhang.linkedList.practise;

import wenjing.LeetCode.ListNode;

/**
 * Created by yangw on 2017/8/2.
 */
public class reverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int m, int n) {
            if(head == null){
                return head;
            }
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            head = dummy;

            for(int i = 1 ; i<m ; i++){
                if(head!=null){
                    head = head.next;
                }
            }
            ListNode pMnode = head;
            ListNode mNode = head.next;
            ListNode nNode = mNode;
            ListNode postNNode = nNode.next;

            for(int j = m ; m<n ; j++){
                if(nNode == null){
                    return null;
                }
                ListNode temp = postNNode.next;
                postNNode.next = nNode;
                nNode = postNNode;
                postNNode = temp;
            }
            pMnode.next = nNode;
            mNode.next = postNNode;


            return dummy.next;

    }
}
