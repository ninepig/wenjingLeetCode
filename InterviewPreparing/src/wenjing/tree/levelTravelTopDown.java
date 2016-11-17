package wenjing.tree;

import wenjing.LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by yamengwenjing on 2016-11-16.
 * similar to 107 ， 107 bottom up，this one top down
 */
public class levelTravelTopDown {
    public List<List<Integer>> levelOrder(TreeNode root) {
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
            resultList.add(thisLevelResult);


        }


        return resultList;

    }
}
