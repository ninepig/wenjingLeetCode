package wenjing.tree;

import wenjing.LeetCode.TreeNode;

import java.util.LinkedList;

/**
 * Created by yamengwenjing on 2016-11-23.
 */

public class minTreeDepth {
    public int minDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left==null){
            return minDepth(root.right)+1;
        }
        if(root.right==null){
            return minDepth(root.left)+1;
        }
        return Math.min(minDepth(root.left),minDepth(root.right))+1;
    }

    public  int minDepthInt(TreeNode root){
        if(root==null){
            return  0;
        }
        LinkedList treeNodeList = new LinkedList();
        int currentLevelNode = 1;
        int nextLevelNode = 0;
        int level=1;
        treeNodeList.offer(root);
        while(!treeNodeList.isEmpty()){
            TreeNode thisNode = (TreeNode) treeNodeList.poll();
            if(thisNode.left ==null & thisNode.right==null){
                return level;
            }
            currentLevelNode--;
            if(thisNode.left != null){
                treeNodeList.offer(thisNode.left);
                nextLevelNode++;
            }
            if (thisNode.right!=null){
                treeNodeList.offer(thisNode.right);
                nextLevelNode++;
            }
            if(currentLevelNode == 0){
                level++;
                currentLevelNode = nextLevelNode;
                nextLevelNode=0;
            }
        }
        //这个return 0 应该是达不到的。
        return 0;
    }


}
