package jiuzhang.binaryTree.leetcode;

import wenjing.LeetCode.TreeNode;

/**
 * Created by wenjingyang on 7/2/17.
 */
public class subTreeOfAnotherTree {

//    Boolean ifSubtree = true;

//    public boolean isSubtree(TreeNode s, TreeNode t) {
//        if (s == null) return false;
//        if (isSame(s, t)) return true;
//        return isSubtree(s.left, t) || isSubtree(s.right, t);
//    }
//
//    private boolean isSame(TreeNode s, TreeNode t) {
//        if (s == null && t == null) return true;
//        if (s == null || t == null) return false;
//
//        if (s.val != t.val) return false;
//
//        return isSame(s.left, t.left) && isSame(s.right, t.right);
//    }

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null){
            return false;
        }
        if (isSameTree(s,t)){
            return true;
        }

        return isSubtree(s.left,t)||isSubtree(s.right,t);


    }

    private boolean isSameTree(TreeNode s, TreeNode t) {

        if(s==null&&t==null){
            return true;
        }
        if(s==null||t==null){
            return false;
        }
        if(s.val!=t.val){
            return false;
        }

        return isSameTree(s.left,t.left)&&isSameTree(s.right,t.right);
    }
}
