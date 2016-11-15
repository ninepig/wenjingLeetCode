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
	

	
	 
	 
	    public boolean isPowerOfTwo(int n) {
	     
	    	if(n<=0){
	    		return false;
	    	}
	    	while(n%2 == 0){
	    		n=n/2;
	    	}
	    	if(n==1){
	    		return true;
	    	}
	    	return false;
	    	
	    }	 
	 
	 
	 
	 /*
	  * Method 3: Bit operation

	If n is the power of two:
	
	n = 2 ^ 0 = 1 = 0b0000...00000001, and (n - 1) = 0 = 0b0000...0000.
	n = 2 ^ 1 = 2 = 0b0000...00000010, and (n - 1) = 1 = 0b0000...0001.
	n = 2 ^ 2 = 4 = 0b0000...00000100, and (n - 1) = 3 = 0b0000...0011.
	n = 2 ^ 3 = 8 = 0b0000...00001000, and (n - 1) = 7 = 0b0000...0111.
	we have n & (n-1) == 0b0000...0000 == 0
	
	Otherwise, n & (n-1) != 0.
	
	For example, n =14 = 0b0000...1110, and (n - 1) = 13 = 0b0000...1101.
	  */
	 

	 

	public static void main(String[] args){
		
		int n = 7 ;
		
		System.out.println(isPowerOfTwo(n));
		
	}
	
	
}
