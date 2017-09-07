package leetcodeFromEasyTm.binaryTree;

import wenjing.LeetCode.TreeNode;

/**
 * Created by yangw on 2017/9/6.
 */
public class pathSum {
    public int pathSum(TreeNode root, int sum) {
            if (root==null){
                return 0;
            }
            //对于当前节点 计算他下面的路径，他左边的节点，他右边的节点
            return getSum(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);

    }

    private int getSum(TreeNode root, int sum) {
        int res = 0;
        if (root == null) {
            return 0;
        }
        if (root.val == sum) {
            res++;
        }
        //不断计算以某个节点开始，是否下面还有值加起来之和ok。
        res += getSum(root.left, sum - root.val);
        res += getSum(root.right, sum - root.val);
        return res;
    }
}
