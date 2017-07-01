package jiuzhang.binaryTree.leetcode;

import wenjing.LeetCode.TreeNode;

/**
 * Created by wenjingyang on 7/1/17.
 */
public class sameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(q==null&&p==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        if(p.val!=q.val){
            return  false;
        }

        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);



    }
}
