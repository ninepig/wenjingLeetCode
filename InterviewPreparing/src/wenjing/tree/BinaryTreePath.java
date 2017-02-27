package wenjing.tree;

import wenjing.LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yamengwenjing on 2016-11-20.
 */
public class BinaryTreePath {

    public List<String> binaryTreePaths(TreeNode root) {
        // list to store result
        ArrayList<String> result = new ArrayList<>();

        if(root == null){
            return result;
        }
        //helper function to get result
        helper(root,"",result);

        return  result;
    }

    private void helper(TreeNode root, String s, ArrayList<String> result) {
     if(root.left==null&&root.right==null){
         result.add(s+root.val);
     }
     if(root.left!=null){
         // if it has left subtree, recursive  call the function
         helper(root.left,s+root.val+"->",result);
     }
    if(root.right!=null){
        helper(root.right,s+root.val+"->",result);
    }
    }

}
