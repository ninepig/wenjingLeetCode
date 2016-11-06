package wenjing.LeetCode;
/*
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -
 *http://www.cnblogs.com/youxin/p/3295649.html
 */
public class Leetcode371 {
	  public int getSum(int a, int b) {
	        
		  
		    int ans;
		     while(b!=0)
		     {
		         //直到没有进位
		    	 //先算出ans为两数异或，不考虑进位的加法结果
		        ans=a^b;
		        // a b相与，再左移一位，计算进位
		        b=(a&b)<<1;
		        a=ans;
		        //进位为0时结束
		     }
		     return a;
		}
	    
}
