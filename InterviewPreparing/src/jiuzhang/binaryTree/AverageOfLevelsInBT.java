package jiuzhang.binaryTree;

import wenjing.LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by yangw on 2017/8/23.
 */
public class AverageOfLevelsInBT {
    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> result = new ArrayList<>();
        if (root==null){
            return result;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        int levelNodeNumber = 0;
        //这个要注意 sum 可能越界 所以要用double
        double levelNodeSum = 0;
        int levelNodeAverageNodeNumber = 0;
        int nextLevelNode = 0;

        queue.offer(root);
        levelNodeNumber +=1;
        levelNodeAverageNodeNumber+=1;
        while (!queue.isEmpty()){
            TreeNode currentNode = queue.poll();
            levelNodeNumber--;
            levelNodeSum+=currentNode.val;
            if(currentNode.left!=null){
                queue.add(currentNode.left);
                nextLevelNode++;
            }
            if(currentNode.right!=null){
                queue.add(currentNode.right);
                nextLevelNode++;
            }
            if(levelNodeNumber==0){
                result.add(levelNodeSum/levelNodeAverageNodeNumber);
                levelNodeNumber = nextLevelNode;
                levelNodeAverageNodeNumber = levelNodeNumber;
                nextLevelNode = 0;
                levelNodeSum=0;
            }
        }
        return result;

    }
}
