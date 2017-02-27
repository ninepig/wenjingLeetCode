package wenjing.tree;

import wenjing.LeetCode.TreeNode;

import java.util.LinkedList;

/**
 * Created by yamengwenjing on 2016-11-23.
 */
/*
最大深度不要和最小深度搞反了，他的结束条件就是只要这个node为空他就返回0 即可，然后递归的去找下一层。直到都为空node即可
 */
public class MaxTreeDepth {

    public int maxDepthRec(TreeNode root){
        // rec
        if(root == null){
            return 0;
        }
        return Math.max(maxDepthRec(root.left)+1,maxDepthRec(root.right)+1);
    }

    public int maxDepthIter(TreeNode root){
        if(root==null){
            return 0;
        }
        LinkedList<TreeNode> treeNodeList = new LinkedList<>();
        int levelNumber = 0;
        int currentLevelNode = 1;
        int nextLevelNode = 0;
        treeNodeList.offer(root);
        while(!treeNodeList.isEmpty()){
            TreeNode thisNode = treeNodeList.poll();
            currentLevelNode--;
            if(thisNode.left==null){
                treeNodeList.offer(thisNode.right);
                nextLevelNode++;
            }
            if(thisNode.right == null){
                treeNodeList.offer(thisNode.left);
                nextLevelNode++;
            }
            if(currentLevelNode==0){
                levelNumber++;
                currentLevelNode = nextLevelNode;
                nextLevelNode = 0;
            }
        }
        return levelNumber;
    }

}
