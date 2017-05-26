package secondTime;

import wenjing.LeetCode.TreeNode;

/**
 * Created by yamengwenjing on 2017-04-27.
 */
public class sumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left!=null&&root.left.left==null&&root.left.right==null){
            return root.left.val+sumOfLeftLeaves(root.right);
        }else {
            return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
        }


    }


}
