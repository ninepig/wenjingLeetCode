package jiuzhang.binaryTree.leetcodeP2;

import wenjing.LeetCode.TreeNode;

/**
 * Created by yangw on 2017/7/6.
 * Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.

 You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.

 Example 1:
 Input:
 Tree 1                     Tree 2
 1                         2
 / \                       / \
 3   2                     1   3
 /                           \   \
 5                             4   7
 Output:
 Merged tree:
 3
 / \
 4   5
 / \   \
 5   4   7
 Note: The merging process must start from the root nodes of both trees.
 */
public class mergeTwoBinaryTree {
    /*
    这道题是生成一颗新树，所以需要遍历的同时，不断生成新的节点。然后左右递归走下去。 关键就是 如何选择怎么生成新的节点
    1p 左有 q左没有，那就是P左作为结点
    2p有 q右没有，那就是Q右作为结点
    3p q左右都没有 not null note，return null
    4p q 左右都有，。。。
    遍历下去即可。
     */
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        TreeNode root = helper(t1,t2);

        return root;
    }

    private TreeNode helper(TreeNode t1, TreeNode t2) {
        if(t1==null&&t2==null){
            return null;
        }
        TreeNode thisNode = new TreeNode(0);
        if(t1==null&&t2!=null){
             thisNode = new TreeNode(t2.val);
            thisNode.left = helper(null,t2.left);
            thisNode.right = helper(null,t2.right);

        }else if(t1!=null&&t2==null){
             thisNode = new TreeNode(t1.val);
            thisNode.left = helper(t1.left,null);
            thisNode.right = helper(t1.right,null);

        }else if(t1!=null&&t2!=null){
             thisNode = new TreeNode(t1.val + t2.val);
            thisNode.left = helper(t1.left,t2.left);
            thisNode.right = helper(t1.right,t2.right);

        }
        return thisNode;
    }


}
