package leetcodeFromEasyTm.binaryTree;

import jiuzhang.binaryTree.leetcodeP2.MaxDepth;
import wenjing.LeetCode.TreeNode;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by yangw on 2017/9/5.
 */
public class findSecondMinimumValue {
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null){
            return -1;
        }
        TreeSet<Integer> set = new TreeSet<>();
        dfs(root,set);
        Iterator<Integer> it = set.iterator();
        int count = 0;
        while (it.hasNext()){
            count++;
            int result = it.next();
            if(count==2){
                return result;
            }
        }
        return -1;

}

    private void dfs(TreeNode root, TreeSet<Integer> set) {
        if (root == null) {
            return;
        }
        set.add(root.val);
        dfs(root.left, set);
        dfs(root.right, set);
    }
//    public int findSecondMinimumValue(TreeNode root)
//    {
//        int rootVal = root.val;
//        int secondSmall =Integer.MAX_VALUE;
//        boolean diffFound = false;
//        Queue<TreeNode> Q= new LinkedList<TreeNode>();
//        Q.add(root);
//
//        while(!Q.isEmpty())
//        {
//            TreeNode curr=Q.poll();
//            if(curr.val!=rootVal && curr.val < secondSmall)
//            {
//                secondSmall=curr.val;
//                diffFound=true;
//            }
//            if(curr.left!=null)
//            {
//                Q.add(curr.left);
//                Q.add(curr.right);
//            }
//        }
//
//        return (secondSmall == Integer.MAX_VALUE && !diffFound) ? -1 : secondSmall;
//    }
}
