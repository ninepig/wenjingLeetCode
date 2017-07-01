package jiuzhang.binaryTree.leetcode;

import wenjing.LeetCode.TreeNode;

/**
 * Created by wenjingyang on 6/30/17.
 * https://leetcode.com/problems/construct-string-from-binary-tree/#/description
 */
public class constructStringFromBinaryTree {

    /*
    自己的思路很接近了。题目也没有仔细看懂， 如果左子树不存在，右存在 则要加（),如果左存在，右不存在，则不要加()
    这个题很巧妙，如果左边存在或者右边存在的情况下 肯定要把左边加入string， 如果右边存在，再加入右边！ 这个题肯定要用遍历的方式 而不是分治法，明显有个中间变量存在

    像这种加括号的。递归前加上左边，然后加上右边即可。多练习
     */
    public String tree2str(TreeNode t) {
        if(t==null){
            return "";
        }
        StringBuffer sb = new StringBuffer();
        helper(sb,t);


        return sb.toString();

    }

    private void helper(StringBuffer sb, TreeNode t) {
        if(t!=null){
            sb.append(t.val);
            if(t.left!=null||t.right!=null){
                sb.append("(");
                helper(sb,t.left);
                sb.append(")");
                if(t.right!=null){
                    sb.append("(");
                    helper(sb,t.right);
                    sb.append(")");
                }

            }

        }

    }

}
