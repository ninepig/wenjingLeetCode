package wenjing.LeetCode;

/*
 * 这个题是基本的二进制数操作，不难，但是需要考验二进制 基本的知识
详见java编程笔记本
这道题的思路如下（看了答案）
对于任何int（java32位）
让它和1（00000000000001）去&，它的结果是目标int位最低位的值（0 or1） ，取一个result 值，将结果相加，然后让N向右移动一位 ，result 向左移动一位。知道32位过去以后，就能完成翻转。（这个方法没理解）
前面相同。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。取到最低位以后，将其左移（31-i）位，直接翻转，然后同样用一个result保存结果 ，让result和翻转以后的值相与就可以了

 */
public class LeetCode190 {
	 public int reverseBits(int n) {
	     
		 int result = 0 ;
		 
		 for(int i = 0; i<32 ; i ++){
			 
			 int temp = n&1;
			 
			 temp = temp<<(31 - i);
			 
			 result |= temp;
			 
			 n= n>>>1;
			 
			 
		 } 
		 return result;
	    }
	 
//	 public int reverseBits(int n) {
//	     int result = 0;
//	     for(int i = 0 ; i<32 ;i ++){
//	    	 result += n&1;
//	    	 n=n>>>1;
//	    	 if(i<31){
//	    		 result =result <<1;
//	    	 }
//	    	 
//	     }
//		 return result;
//		
//	    }
}
