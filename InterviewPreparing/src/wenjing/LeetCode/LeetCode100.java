package wenjing.LeetCode;

/*
 * leetcode 100
same tree
比较两棵二叉树是否相同

递归的思想，递归对于当前层的判断就可以了
想得太复杂了一开始 不用考虑是否有左树或者右树 
因为你会判断这个node 是否存在
把左树和右树全部放到递归中考虑即可

 */
public class LeetCode100 {
	 public boolean isSameTree(TreeNode p, TreeNode q) {
	       if(p==null && q == null){
	           return true;
	       }
	       if(p!=null&&q==null){
	           return false;
	       }
	       if(p==null&&q!=null){
	           return false;
	       }
	     if(p.val != q.val){
	         return false;
	     }
	         return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
	       
	    }
}


