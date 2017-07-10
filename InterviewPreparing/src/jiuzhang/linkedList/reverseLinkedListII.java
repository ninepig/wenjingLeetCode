package jiuzhang.linkedList;

import wenjing.LeetCode.ListNode;

/**
 * Created by yangw on 2017/7/10.
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.

 For example:
 Given 1->2->3->4->5->NULL, m = 2 and n = 4,

 return 1->4->3->2->5->NULL.

 Note:
 Given m, n satisfy the following condition:
 1 ? m ? n ? length of list.
 */
public class reverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int m, int n) {

            if(head==null||m>n){
                return null;
            }

            ListNode dummpy = new ListNode(0);
            dummpy.next = head;
            head = dummpy;

            //find the node before m node
            for(int i = 1; i<m;i++){
                if(head == null){
                    return null;
                }
                head = head.next;
            }

            ListNode preMnode = head;
            ListNode mNode =head.next;
            //postnNode 是最后nnode 完事以后的节点
            ListNode nNode = mNode,postnNode = mNode.next;

            for (int i = m ;i<n;i++){
                if (nNode == null){
                    return null;
                }
                ListNode temp = postnNode.next;
                postnNode.next = nNode;
                nNode =postnNode;
                postnNode = temp;
            }
            //交换完了以后 mnode 其实是最后一个节点了，因为最早的时候第一个nnode 其实就是mnode, 然后把postnnode放在mnode的尾巴上
            //把之前的mnode之前的点 后面接上新的头就可以了
            mNode.next = postnNode;
            preMnode.next = nNode;

            return dummpy.next;

    }
}