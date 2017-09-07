package leetcodeFromEasyTm.binaryTree;

import wenjing.LeetCode.ListNode;
import wenjing.LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by yangw on 2017/9/6.
 */
public class binaryTreeLevelOrder {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
            if(root==null){
                return null;
            }
            List<List<Integer>> resultList = new ArrayList<>();
            LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> currentLevelList = new ArrayList<>();
            for(int i = 0; i< size; i++){
                TreeNode temp = queue.poll();
                currentLevelList.add(temp.val);
                if(temp.left!=null){
                    queue.offer(temp.left);
                }
                if(temp.right!=null){
                    queue.offer(temp.right);
                }
            }
            resultList.add(0,currentLevelList);

        }

        return resultList;

    }

}
