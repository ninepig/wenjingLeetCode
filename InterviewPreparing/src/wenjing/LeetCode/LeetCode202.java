package wenjing.LeetCode;

import java.util.ArrayList;

/*
 * leetcode202 happy number
这个题拿到以后的思路：
类似之前出现的任何要算一个数任意位数 一样，要利用 %10 来获取个位数 除10 来退位
结果就是 num + = num%10 的 平方
但是自己做的时候不是很认真，不知道怎么退出条件
看了答案以后 有2种 一种是 n<10 && n!=1 的情况，但是我没明白为什么是n<9 ,但是自己尝试以后发现2--9确实不可以
另一种比较好的方法是用DP，把出现过的结果放到一个数组里面，如果你第二次出现在原来的数组里面 就说明你是不断循环了，所以就肯定不可能是happy number了
 

 */
public class LeetCode202 {

//	  public boolean isHappy(int n) {
//		  
//		  if(n<=0){
//			  return false;
//		  }
//		  ArrayList<Integer> resultList = new ArrayList<>();
//		  while(n!=1){
//			  if(resultList.contains(n)){
//				  return false;
//			  }
//			  resultList.add(n);
//			  n = getSum(n);
//			  		  
//		  }
//		  
//		  return true;
//		  
//	  }
//
//	private int getSum(int n) {
//		// TODO Auto-generated method stub
//		int result = 0;
//		while(n>0){
//			int lastDigit = n%10;
//			n = n/10;
//			result = result +lastDigit * lastDigit;
//		}
//		return result;
//	}
	
	public boolean isHappy(int n) {
        
		if(n<=0){
			return false;
		}
	
		ArrayList<Integer> resultList = new  ArrayList<>();
		int result = n;
		while(result !=1){
			
			if(resultList.contains(result)){
				return false;
			}
			resultList.add(result);
			result = getSquareSum(result);
		}
		return true;
	
		
    }
/*
 * count the digit summury
 */
	private int getSquareSum(int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		int digit =0;
		while(n>0){
			digit = n%10;
			n=n/10;
			sum = digit*digit+sum;
		}
		
		return sum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
