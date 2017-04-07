package wenjing.tree;

import wenjing.LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yamengwenjing on 2016-11-20.
 */
public class BinaryTreePath {

//    public List<String> binaryTreePaths(TreeNode root) {
//        // list to store result
//        ArrayList<String> result = new ArrayList<>();
//
//        if(root == null){
//            return result;
//        }
//        //helper function to get result
//        helper(root,"",result);
//
//        return  result;
//    }
//
//    private void helper(TreeNode root, String s, ArrayList<String> result) {
//     if(root.left==null&&root.right==null){
//         result.add(s+root.val);
//     }
//     if(root.left!=null){
//         // if it has left subtree, recursive  call the function
//         helper(root.left,s+root.val+"->",result);
//     }
//    if(root.right!=null){
//        helper(root.right,s+root.val+"->",result);
//    }
//    }

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
        /*
        错误在这里！
         */
//        if(root.right==null&&root.left!=null){
//            helper(root.left,s+root.val+"->",resultList);
//        }
//        if(root.left==null&&root.right!=null){
//            helper(root.right,s+root.val+"->"，resultList);
//        }
        if(root.left!=null){
            helper(root.left,s+root.val+"->",resultList);
        }
        if(root.right!=null){
            helper(root.right,s+root.val+"->",resultList);
        }
    }


}
