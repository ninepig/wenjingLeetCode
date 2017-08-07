package jiuzhang.binaryTree.leetcode;

import wenjing.LeetCode.ListNode;
import wenjing.LeetCode.TreeNode;

/**
 * Created by yangw on 2017/8/6.
 */
public class convertSortedListToBST {
//    private ListNode current;
//
//    private int getListLength(ListNode head) {
//        int size = 0;
//        while (head != null) {
//            size++;
//            head = head.next;
//        }
//        return size;
//    }
//
//    public TreeNode sortedListToBST(ListNode head) {
//        int size;
//        current = head;
//        size = getListLength(head);
//        return sortedListToBSTHelper(size);
//    }
//
//    public TreeNode sortedListToBSTHelper(int size) {
//        if (size <= 0) {
//            return null;
//        }
//        TreeNode left = sortedListToBSTHelper(size / 2);
//        TreeNode root = new TreeNode(current.val);
//        current = current.next;
//        TreeNode right = sortedListToBSTHelper(size - 1 - size / 2);
//
//        root.left = left;
//        root.right = right;
//        return root;
//    }
//
//    //快慢指针的方法 我觉得很好 应该是nlogn
//    public TreeNode sortedListToBST2(ListNode head) {
//        return toBST(head,null);
//    }
//
//    public TreeNode toBST(ListNode head,ListNode tail){
//        if(head == tail) return null;
//        ListNode slower = head;
//        ListNode faster = head;
//        while(faster!=tail){
//            faster = faster.next;
//            if(faster!=tail){
//                faster = faster.next;
//                slower = slower.next;
//            }
//        }
//        TreeNode root = new TreeNode(slower.val);
//        root.left = toBST(head,slower);
//        root.right =  toBST(slower.next,tail);
//        return root;
//    }
public TreeNode sortedListToBST2(ListNode head) {
    return toBst(head,null);
}

    private TreeNode toBst(ListNode head, ListNode tail) {
        if(head==null){
            return null;
        }
        ListNode slower = head;
        ListNode faster = head;
        while (faster!=tail){
            faster = faster.next;
            if(faster!=tail){
                faster = faster.next;
                slower = slower.next;
            }
        }
        TreeNode root = new TreeNode(slower.val);
        root.left = toBst(head,slower);
        root.right = toBst(slower.next,tail);
        return root;
    }


}
