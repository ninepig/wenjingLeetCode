package jiuzhang.binaryTree.leetcode;

import wenjing.LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wenjingyang on 7/3/17.
 */
public class binaryTreePath {
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> resultList = new ArrayList<>();
        if(root==null){
            return resultList;
        }
        helper(root,"",resultList);
        return  resultList;
    }

    private void helper(TreeNode root, String s,ArrayList<String> resultList) {
        if(root.left==null&&root.right==null){
            resultList.add(s+root.val);
        }
        if(root.left!=null){
            helper(root.left,s+root.val+"->",resultList);
        }
        if(root.right!=null){
            helper(root.right,s+root.val+"->",resultList);
        }
    }

}
