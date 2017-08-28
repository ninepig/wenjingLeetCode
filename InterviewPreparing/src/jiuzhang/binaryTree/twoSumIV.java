package jiuzhang.binaryTree;

import wenjing.LeetCode.TreeNode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by yangw on 2017/8/23.
 */
public class twoSumIV {
    public boolean findTargetDfs(TreeNode root, int k) {
        if (root==null){
            return false;
        }
        HashSet<Integer> set= new HashSet();

        return dfs(root,k,set);
    }

    private boolean dfs(TreeNode root, int k, HashSet<Integer> set) {
        if(root == null){
            return false;
        }
        if (set.contains(k-root.val)){
            return true;
        }
        set.add(root.val);
        return dfs(root.left,k,set)||dfs(root.right,k,set);
    }

    // bst -->inorder--> sortedArray
    public boolean findTargetSortedArray(TreeNode root, int k) {
        if(root==null){
            return false;
        }
        List<Integer> array = new ArrayList<>();
        inOrder(array,root);

        int left = 0, right = array.size()-1;
        while (left<right){
            int sum = array.get(left)+array.get(right);
            if(sum == k){
                return  true;
            }else if (sum<k){
                left++;
            }else {
                right--;
            }
        }
        return false;
    }

    private void inOrder(List<Integer> array, TreeNode root) {
        if (root==null){
            return;
        }
        inOrder(array,root.left);
        array.add(root.val);
        inOrder(array,root.right);

    }
}
