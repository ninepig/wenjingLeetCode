package leetcodeFromEasyTm.binaryTree;

import wenjing.LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by yangw on 2017/9/1.
 */
public class TwoSum4 {
    public boolean findTarget(TreeNode root, int k) {

        HashSet<Integer> map = new HashSet<>();
        //不能加啊 兄弟 要在底柜里面加，因为加入了递归还会加一次啊！
//        map.add(root.val);
        return dfs(k,root,map);
    }

    private boolean dfs(int k, TreeNode root, HashSet<Integer>  map) {
        if(root==null){
            return false;
        }
        if(map.contains(k-root.val)){
            return true;
        }
        map.add(root.val);

        return dfs(k,root.left,map)||dfs(k,root.right,map);

    }

    public boolean findTarget2(TreeNode root, int k) {
        if (root == null){
            return false;
        }
        ArrayList<Integer> result = new ArrayList<>();

        dfs2(result,root);

        int l = 0 ;
        int r = result.size()-1;
        while (l<r){
            if (result.get(l)+result.get(r) == k){
                return true;
            }else if (result.get(l)+result.get(r)<k){
                l++;
            }else
                r--;
        }
        return false;
    }

    private void dfs2(ArrayList<Integer> result, TreeNode root) {
        if (root==null){
            return ;
        }
        dfs2(result,root.left);
        result.add(root.val);
        dfs2(result,root.right);
    }

}
