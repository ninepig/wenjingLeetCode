package leetcodeFromEasyTm.binaryTree;

import wenjing.LeetCode.TreeNode;

/**
 * Created by yangw on 2017/9/3.
 */
public class isSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }

        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
