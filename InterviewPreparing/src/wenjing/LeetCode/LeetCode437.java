package wenjing.LeetCode;

import java.util.HashMap;

/*
 * You are given a binary tree in which each node contains an integer value.

Find the number of paths that sum to a given value.

The path does not need to start or end at the root or a leaf, but it must go downwards (traveling only from parent nodes to child nodes).

The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000.

binarytree

这个题真不会，大神的解法，太牛逼了，用的hashmap（类似two sum），key 是 sumary的值，value 是出现的次数
所有递归树的结束条件都是root ==null return xxx

 */
public class LeetCode437 {
		//这个方法有点看不懂
	  public int pathSum(TreeNode root, int sum) {
	        HashMap<Integer, Integer> preSum = new HashMap();
	        preSum.put(0,1);
	        return helper(root, 0, sum, preSum);
	    }
	    
	    public int helper(TreeNode root, int sum, int target, HashMap<Integer, Integer> preSum) {
	        if (root == null) {
	            return 0;
	        }
	        
	        sum += root.val;
	        int res = preSum.getOrDefault(sum - target, 0);

	        preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
	        
	        res += helper(root.left, sum, target, preSum) + helper(root.right, sum, target, preSum);
	        //因为对于当前节点 有左路径，右路，所以要减去当前节点
	        preSum.put(sum, preSum.get(sum) - 1);

	        return res;
	    }
	    
	    //这个递归我还看得懂点。。，不断递归调用左树，右树。，sum减去当前节点的值。
	    public int pathSum(TreeNode root, int sum) {
	        if(root == null)
	            return 0;
	        return findPath(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
	    }
	    
	    public int findPath(TreeNode root, int sum){
	        int res = 0;
	        if(root == null)
	            return res;
	        if(sum == root.val)
	            res++;
	        res += findPath(root.left, sum - root.val);
	        res += findPath(root.right, sum - root.val);
	        return res;
	    }
}
