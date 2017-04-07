package wenjing.tree;

import wenjing.LeetCode.TreeNode;

/**
 * Created by yamengwenjing on 2017-04-06.
 */
public class pathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        //如果当前节点为空 则为false
        if(root == null){
            return false;
        }
        if(root.left == null&&root.right==null&&root.val == sum){
            return  true;
        }
        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);

    }

}
