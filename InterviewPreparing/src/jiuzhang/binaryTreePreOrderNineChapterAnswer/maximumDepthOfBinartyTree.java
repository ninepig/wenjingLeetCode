package jiuzhang.binaryTreePreOrderNineChapterAnswer;

import wenjing.LeetCode.TreeNode;

/**
 * Created by yangw on 2017/6/26.
 */
public class maximumDepthOfBinartyTree {
    public int maxDepth(TreeNode root) {
     if(root == null){
         return 0;
     }
     int left = maxDepth(root.left);
     int right = maxDepth(root.right);

     return Math.max(left,right)+1;
    }
}
