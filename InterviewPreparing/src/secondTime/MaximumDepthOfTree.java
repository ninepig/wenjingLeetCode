package secondTime;

import wenjing.LeetCode.TreeNode;

import java.util.LinkedList;

/**
 * Created by yamengwenjing on 2017-04-25.
 */
public class MaximumDepthOfTree {
    public int maxDepthRe(TreeNode root) {
        if(root == null){
            return 0;
        }
        return Math.max(maxDepthRe(root.left),maxDepthRe(root.right))+1;

    }

    public int maxDepthQueue(TreeNode root){
        if(root == null ){
            return 0;
        }
        LinkedList<TreeNode> q = new LinkedList<>();
        int level = 0;
        q.offer(root);
        int currentLevelNode = 1;
        int nextLevelNode = 0;

        while (!q.isEmpty()){
            TreeNode thisNode = q.poll();
            currentLevelNode--;
            if(thisNode.left!=null){
                q.offer(thisNode.left);
                nextLevelNode++;
            }
            if(thisNode.right!=null){
                q.offer(thisNode.right);
                nextLevelNode++;
            }
            if(currentLevelNode==0){
                level++;
                currentLevelNode = nextLevelNode;
                // 忘记了加这一行 很关键。
                nextLevelNode = 0;
            }
        }
         return level;

    }
}
