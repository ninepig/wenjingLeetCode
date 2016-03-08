package wenjing.LeetCode;
/*
 * leetCode 70 爬楼梯1
这道题一看到题目 第一反应就是动态规划，但是自己没怎么联系过动态规划，所以只知外表，不懂精髓。
然后用枚举法 发现是fibnacchi数列，可以解决了
但是看了别人大神的解释，才明白了物理含义（我觉得很重要）
对于到第N层，你所需要做的是在第N-1层走1步或者N-2层走2步，
这样你就可以写出状态分解方程了 ，dp的核心就是写出状态分解方程，然后利用数组或者其他的方法就可以维护了。

 */
public class LeetCode70 {
	   public int climbStairs(int n) {
	     
		   if(n== 0 ){
			   return 0;
		   }
		   int[] result = new int[n+1];
		   if(n<=2){
			   result[n] = n;
			   return result[n];
		   }
		   result[1] = 1;
		   result[2] = 2;
		   
		   for(int i = 3; i<=n ; i++){
			 
			   result[i] = result[i-1]+result[i-2];
		   }
		  
		   return result[n];
	    }
}
