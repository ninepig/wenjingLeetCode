package wenjing.LeetCode;

/*
 * 第一反应就是 递归除以3 加上去余操作，就可以完成，但是复杂度肯定高，(居然beat 了88%。。迷醉)而且题目的follow up 要求不用递归，不用循环
想不出来。

 */
public class LeetCode326 {
	   public boolean isPowerOfThree(int n) {
		   if(n<=0){
			   return false;
		   }
	         while(n%3 == 0){
	        	 
	        	 n /=3;
	        	 
	         }
	         if(n==1){
	        	 return true;
	         }
	         return false;
	    }
	   
	   
	   
	   
	   
	   
}
