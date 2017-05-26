package secondTime;

import wenjing.LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Administrator on 2017/5/9.
 */
public class levelOrderTravel {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> resultList = new ArrayList<>();
        if(root == null){
            return  resultList;
        }
        LinkedList<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while(!nodeQueue.isEmpty()){
            int currentLevelNodeNumber = nodeQueue.size();
            List<Integer> thisList = new ArrayList<>();
            for(int i = 0 ;i<currentLevelNodeNumber;i++){
                TreeNode node =nodeQueue.pop();
                thisList.add(node.val);
                if(node.left!=null){
                    nodeQueue.offer(node.left);
                }
                if (node.right!=null){
                    nodeQueue.offer(node.right);
                }
            }
            resultList.add(0,thisList);
        }

        return resultList;

    }
}
