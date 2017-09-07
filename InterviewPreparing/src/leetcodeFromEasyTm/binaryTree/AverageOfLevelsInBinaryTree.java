package leetcodeFromEasyTm.binaryTree;

import wenjing.LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by yangw on 2017/9/1.
 */
public class AverageOfLevelsInBinaryTree {

    public List<Double> averageOfLevels(TreeNode root) {

         if(root == null){
             return null;
         }
        ArrayList<Double> result = new ArrayList<>();
         LinkedList<TreeNode> queue = new LinkedList<>();
         int currentLevelNode = 0;
         double sum = 0;
         int nextLevelNode = 0;
         int levelNodeSum = 0;

         queue.offer(root);
         currentLevelNode +=1;
        levelNodeSum+=1;

         while (!queue.isEmpty()){
             TreeNode temp = queue.poll();
             sum+= temp.val;
             currentLevelNode--;

             if(temp.left!=null){
                 queue.offer(temp.left);
                 nextLevelNode++;
             }
             if(temp.right!=null){
                 queue.offer(temp.right);
                 nextLevelNode++;
             }
             if(currentLevelNode==0){
                 result.add(sum/levelNodeSum);
                 currentLevelNode = nextLevelNode;
                 levelNodeSum = nextLevelNode;
                 nextLevelNode = 0;
                 sum = 0;
             }
         }

         return result;



    }

}
