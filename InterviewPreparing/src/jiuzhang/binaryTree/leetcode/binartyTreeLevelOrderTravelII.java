package jiuzhang.binaryTree.leetcode;

import wenjing.LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by wenjingyang on 7/2/17.
 */
public class binartyTreeLevelOrderTravelII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null){
            return  new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()){
            int currentLevelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for(int i=0;i<currentLevelSize;i++){
                TreeNode thisNode = queue.poll();
                currentLevel.add(thisNode.val);
                if(thisNode.left!=null){
                    queue.add(thisNode.left);
                }
                if (thisNode.right!=null){
                    queue.add(thisNode.right);
                }
            }
            result.add(0,currentLevel);
        }
        return result;
    }
}
