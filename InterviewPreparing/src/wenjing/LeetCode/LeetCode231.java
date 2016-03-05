package wenjing.LeetCode;

/*
 * 
leetcode 231 是否是2的幂
我第一反应是把数字转化成二进制
1
10
100
1000 
只要是第一位为1 其他的必须都等于0 才能符合要求，通过了复杂度有点高

但是看到下一题 是否是3的幂 ，我就想起来了
只要递归除以2 加上取余数操作 就可以完成这道题目 但是时间复杂度也会高

所以一定要用位操作，才最省时间


 */
public class LeetCode231 {
	 public static boolean isPowerOfTwo(int n) {
	     if(n<=0){
	    	 return false;
	     }
		 String binaryResult = Integer.toBinaryString(n);
		 
		 if(binaryResult.charAt(0)!='1'){
			 return false;
		 }
		 
		 for(int i = 1;i<binaryResult.length();i++){
			 
			if(binaryResult.charAt(i) != '0'){
				return false;
			}
		 }
	   
		 return true;
	    
		 
	    }
	

	
	 
	 

	public static void main(String[] args){
		
		int n = 7 ;
		
		System.out.println(isPowerOfTwo(n));
		
	}
	
	
}
