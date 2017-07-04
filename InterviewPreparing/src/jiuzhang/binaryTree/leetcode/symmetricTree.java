package jiuzhang.binaryTree.leetcode;

import wenjing.LeetCode.TreeNode;

/**
 * Created by wenjingyang on 7/3/17.
 */
public class symmetricTree {
    public boolean isSymmetric(TreeNode root) {

        if(root==null){
            return true;
        }

        return helper(root.left,root.right);

    }

    private boolean helper(TreeNode p, TreeNode q) {

        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
//        if(p.left!=q.right){
//            return false;
//        }
//        if(p.right!=q.left){
//            return false;
//        }
        //把两颗子树看出树的话 要做的比较是 root val 相同 ，同时左树等于右树，右树等于左树 想错了

        return (p.val == q.val)&&helper(p.left,q.right)&&helper(p.right,q.left);

    }
}
