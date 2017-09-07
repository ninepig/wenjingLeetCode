package leetcodeFromEasyTm.binaryTree;

import wenjing.LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangw on 2017/9/7.
 */
public class binaryTreePath {
    public List<String> binaryTreePathsUsingString(TreeNode root) {
        List<String> result =new ArrayList<String>();
        if(root == null ){
            return result;
        }
        dfs(root,"",result);
        return result;
    }
    public void dfs(TreeNode root, String s , List<String> res){

        if(root.left==null&&root.right==null){

            res.add(s+root.val);
        }

        if(root.left!=null){

            dfs(root.left,s+root.val+"->",res);
        }
        if(root.right!=null){

            dfs(root.right,s+root.val+"->",res);
        }
    }

    public List<String> binaryTreePathsUsingStringBuilder(TreeNode root) {
        List<String> rst = new ArrayList<String>();
        if(root == null) return rst;
        StringBuilder sb = new StringBuilder();
        helper(rst, sb, root);
        return rst;
    }

    public void helper(List<String> rst, StringBuilder sb, TreeNode root){
        if(root == null) return;
        int tmp = sb.length();
        if(root.left == null && root.right == null){
            sb.append(root.val);
            rst.add(sb.toString());
            sb.delete(tmp , sb.length());
            return;
        }
        sb.append(root.val + "->");
        helper(rst, sb, root.left);
        helper(rst, sb, root.right);
        sb.delete(tmp , sb.length());
        return;

    }

}
