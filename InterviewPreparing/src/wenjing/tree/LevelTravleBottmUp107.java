package wenjing.tree;

import wenjing.LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.LinkedList;
import java.util.List;

public class LevelTravleBottmUp107 {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        if(root ==null){
            return new ArrayList<>();
        }

        List<List<Integer>> resultList = new ArrayList<>();

        LinkedList<TreeNode> nodeQueue = new LinkedList<>();

        nodeQueue.add(root);

        while(!nodeQueue.isEmpty()){

            int currentLevelSize = nodeQueue.size();
            List<Integer> thisLevelResult = new ArrayList<>();

            for(int i = 0; i<currentLevelSize;i++){
                TreeNode currentNode = nodeQueue.pop();
                thisLevelResult.add(currentNode.val);

                if(currentNode.left!=null){
                    nodeQueue.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    nodeQueue.offer(currentNode.right);
                }

            }
            resultList.add(0,thisLevelResult);
        }


        return resultList;


    }

    public List<List<Integer>> levelOrderBottom2(TreeNode root){
        if(root == null){
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> resultList = new ArrayList<>();
        LinkedList<TreeNode> queueList = new LinkedList<>();
        queueList.offer(root);
        while (!queueList.isEmpty()){
            int levelSize = queueList.size();
            ArrayList<Integer> thisLevelResult = new ArrayList<>();
            for(int i = 0;i<levelSize;i++){
                TreeNode currentNode = queueList.pop();
                thisLevelResult.add(currentNode.val);
                if(currentNode.left!=null){
                    queueList.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    queueList.offer(currentNode.right);
                }
            }
            resultList.add(0,thisLevelResult);
        }
        return resultList;

    }


}