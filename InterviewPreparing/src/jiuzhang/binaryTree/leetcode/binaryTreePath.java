package jiuzhang.binaryTree.leetcode;

import wenjing.LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wenjingyang on 7/3/17.
 */
public class binaryTreePath {
    public List<String> binaryTreePaths(TreeNode root) {
      if(root == null){
          return new ArrayList<>();
      }
      List<String> result = new ArrayList<>();
      helper(result,"",root);

      return result;

    }

    private void helper(List<String> result, String s, TreeNode root) {
        if(root == null){
            return;
        }
        if(root.left == null&& root.right==null){
            s = s+root.val;
            result.add(s);
        }
        if(root.left!=null){
            helper(result,s+root.val+"->",root.left);
        }
        if(root.right!=null){
            helper(result,s+root.val+"->",root.right);
        }
    }

}
