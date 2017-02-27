package wenjing.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yamengwenjing on 2016-11-20.
 */
public class LeetCode257 {
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> result = new ArrayList<>();

        if(root == null){
            return result;
        }
        helper(root,"",result);

        return  result;
    }

    private void helper(TreeNode root, String s, ArrayList<String> result) {
        if(root.left==null&&root.right==null){
            result.add(s+root.val);
        }
        if(root.left!=null){
            helper(root.left,s+root.val+"->",result);
        }
        if(root.right!=null){
            helper(root.right,s+root.val+"->",result);
        }
    }
}
