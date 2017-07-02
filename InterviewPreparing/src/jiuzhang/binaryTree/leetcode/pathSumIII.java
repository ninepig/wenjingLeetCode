package jiuzhang.binaryTree.leetcode;

import wenjing.LeetCode.TreeNode;

/**
 * Created by wenjingyang on 7/2/17.
 */
public class pathSumIII {
    public int pathSum(TreeNode root, int sum) {
        if(root == null){
            return 0;
        }
        return  findPath(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);
    }

    private int findPath(TreeNode root, int sum) {
        int result = 0;
        if( root == null){
            return result;
        }
        if(sum == root.val){
            result++;
        }
        result += findPath(root.left,sum-root.val);
        result += findPath(root.right,sum-root.val);
        return result;
    }
}
