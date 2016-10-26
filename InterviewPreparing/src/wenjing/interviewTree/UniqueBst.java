package wenjing.interviewTree;
/*
 * http://blog.csdn.net/linhuanmars/article/details/24761459
 * https://leetcode.com/discuss/75282/easy-to-understand-top-down-dp-solution
 * 给定N，从0---n 最多能组成多少个搜索二叉树
 * 典型的动态规划题目，可以利用一个数组存储子问题的答案
 * 根据题意分析，K可以取0---N之间的一点作为根，因为是bst 所以值为0--k-1是K的左子树，N-K是K的右子树，即当K为根节点的时候，K拥有的BST的数量为
 * 他左子树的BST的数量乘以他右子树的bst的数量
 * 
 */
public class UniqueBst {

	public int numTrees(int n){
		int[] result = new int[n+1];
		return getNumTrees(n, result);
		
	}

	private int getNumTrees(int n, int[] result) {
		// TODO Auto-generated method stub
		int treeNumbers = 0;
		if(n<=1){
			
			return 1;
		}
		//如果已经计算过了，则直接返回结果，DP的必杀技，零时数组+递归
		if(result[n-1] > 0) {
			return result[n-1];
		}
		
		for(int i = 2;i<=n;i++){
			treeNumbers += getNumTrees(i-1, result)*getNumTrees(n-1, result);
		}
		result[n-1] = treeNumbers;
		
		return treeNumbers;
	}
	
	//大神方法
	public int numTreesDaShen(int n) {  
	    if(n<=0)  
	        return 0;  
	    int[] res = new int[n+1];  
	    res[0] = 1;  
	    res[1] = 1;  
	    for(int i=2;i<=n;i++)  
	    {  
	        for(int j=0;j<i;j++)  
	        {  
	            res[i] += res[j]*res[i-j-1];  
	        }  
	    }  
	    return res[n];  
	} 
	
	
}
