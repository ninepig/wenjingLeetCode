package wenjing.LeetCode;
/*
 * leetcode 38 facebook  需要再做做 才能明白
count and say
http://www.cnblogs.com/higerzhang/p/4050290.html
我自己理解错了，题目根本看不懂。看了别人的解释才明白
看明白题意以后就觉得不是那么难了

 */
public class LeetCode38 {

//	   public String countAndSay(int n) {
//	   
//		   String result = "1";
//		   String tempString = "";
//		   int numberShowCount;
//		   char comparingChar;
//		   if(n == 1){
//			   return result;
//		   }
//		  
//		   for(int i = 1;i<n;i++){
//			   numberShowCount = 1;
//			   comparingChar = result.charAt(0);
//			   for(int j = 1; j<result.length();j++){
//				  if(comparingChar == result.charAt(j)){
//					  numberShowCount++;
//				  }else{
//					  tempString += Integer.toString(comparingChar) + comparingChar;
//					  numberShowCount = 1;
//					  comparingChar = result.charAt(j);
//				  }
//				  
//			   }
//			   tempString +=Integer.toBinaryString(numberShowCount)+comparingChar;
//			   result = tempString;
//			   tempString = "";
//		   }
//	
//		   return result;
//		   
//	   }
	   
	   public static String countAndSay(int n) {
		    if (n <= 0)
		        return null;
		    if (n == 1)
		        return "1";
		    String result = "1", newString = "";
		    for (int i = 1; i < n; i++) {
		        int count = 1;
		        char sign_char = result.charAt(0);
		        for (int j = 1; j < result.length(); j++) {
		            if (result.charAt(j) == sign_char)
		                count++;
		            else {
		            	//如果不相等 把之前的count 和 sign_char添加到字符串中
		                newString += Integer.toString(count) + sign_char;
		                count = 1;
		                sign_char = result.charAt(j);
		            }

		        }
		        
		        //至少又一次
		        newString += Integer.toString(count) + sign_char;
		        result = newString;
		        newString = "";
		    }
		    return result;
		}
	   
	   
	
	
}
