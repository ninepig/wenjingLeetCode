package leetcodeFromEasyTm.binaryTree;

import wenjing.LeetCode.TreeNode;

/**
 * Created by yangw on 2017/9/1.
 */
public class ContractStringFromBinaryTree {
    public String tree2str(TreeNode t) {
        StringBuffer result = new StringBuffer();

        dfs(result,t);

        return result.toString();
    }

    private void dfs(StringBuffer result, TreeNode t) {
        if(t == null){
            return;
        }
        result.append(t.val);
        if(t.left!=null||t.right!=null){
            result.append('(');
            dfs(result,t.left);
            result.append(')');
            if (t.right!=null){
                result.append('(');
                dfs(result,t.right);
                result.append(')');
            }
        }
    }
}
