package wenjing.tree;

import wenjing.LeetCode.TreeNode;

/**
 * Created by yamengwenjing on 2016-11-16.
 * 二叉树深度问题，在深度问题上加一些限定条件就可以了，用一个全局变量 用来判断是否平衡。，在递归计算左右高度，只要高度之差超过1，则不平衡
 *
 */
public class BalancedBinaryTree {
    private  boolean isBalanced = true;
    private int treeDepth(TreeNode root){
        if(!isBalanced){
            return -1;
        }
        if(root == null){
            return 0;
        }
        int leftDepth = treeDepth(root.left);
        int rightDepth = treeDepth(root.right);
        if(Math.abs(leftDepth-rightDepth)>1){
            isBalanced =false;
            return -1;
        }

        return Math.max(leftDepth,rightDepth)+1;
    }

    public boolean isBalanced(TreeNode root) {

        treeDepth(root);
        return isBalanced;

    }
//    boolean isBalancedTest = true;
//    public boolean isBalanced2(TreeNode root) {
//        treeDepthHelper(root);
//        return isBalancedTest;
//    }
//
//    private int treeDepthHelper(TreeNode root) {
//        if(!isBalancedTest){
//            return -1;
//        }
//        if(root==null){
//            return 1;
//        }
//        int leftDepth = treeDepth(root.left);
//        int rightDepth = treeDepth(root.right);
//
//        if(Math.abs(leftDepth-rightDepth)>1){
//            isBalanced = false;
//            return -1;
//        }
//        return Math.max(leftDepth,rightDepth)+1;
//
//    }


}
