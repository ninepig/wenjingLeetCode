package wenjing.LeetCode;

import java.util.Arrays;

/*
 * http://blog.csdn.net/ljiabin/article/details/40477429
leetcode 6 任何题目一定要试试看，找找看规律，找到规律就好做了，利用字符串可以自动拼接的原理
利用数字代表字符串的index 来找规律，然后按照这个规律来做就可以了
这道题只要移动行号，不断在对应行的字符串添加char就可以了

 */

public class LeetCode6 {


	public String convert(String s, int numRows) {
		
		 if(numRows<2){
			 return s;
		 }
		 String result = null; 
		 String[] stringMatrixs = new String[numRows];
		 Arrays.fill(stringMatrixs, "");
		 char[] charArray = s.toCharArray();
		 int rowNumber = 0;
		 int delta = 1;
		 
		 for(int i = 0; i<charArray.length;i++){
			 stringMatrixs[rowNumber] += charArray[i];
			 rowNumber += delta;
			 if(rowNumber>=numRows){
				 rowNumber = rowNumber -2 ;
				 delta = -1;
			 }
			 if(rowNumber<0){
				 rowNumber = 1 ;
				 delta = 1;
			 }
			 
		 }
		 
		 for(int i = 0 ; i<numRows;i++){
			result += stringMatrixs[i]; 
		 }
		 
		 return result;
		 
	    }
	
}
