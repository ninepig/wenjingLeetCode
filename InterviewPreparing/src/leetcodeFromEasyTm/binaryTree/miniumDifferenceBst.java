package leetcodeFromEasyTm.binaryTree;

import wenjing.LeetCode.TreeNode;

import java.util.ArrayList;

/**
 * Created by yangw on 2017/9/2.
 */
public class miniumDifferenceBst {
    public int getMinimumDifference(TreeNode root) {

        ArrayList<Integer> sortArray = new ArrayList<>();
        travel(sortArray,root);

        int min = Integer.MAX_VALUE;
        for(int i= 0 ; i<sortArray.size()-1;i++ ){
            min = Math.min(min, Math.abs(sortArray.get(i)-sortArray.get(i+1)));
        }
        return min;
    }

    private void travel(ArrayList<Integer> sortArray, TreeNode root) {

        if (root == null){
            return;
        }
        travel(sortArray,root.left);
        sortArray.add(root.val);
        travel(sortArray,root.right);
    }
}
