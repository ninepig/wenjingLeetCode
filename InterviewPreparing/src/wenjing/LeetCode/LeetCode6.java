package wenjing.LeetCode;

import java.util.Arrays;

/*
 * http://blog.csdn.net/ljiabin/article/details/40477429
leetcode 6 �κ���Ŀһ��Ҫ���Կ������ҿ����ɣ��ҵ����ɾͺ����ˣ������ַ��������Զ�ƴ�ӵ�ԭ��
�������ִ����ַ�����index ���ҹ��ɣ�Ȼ����������������Ϳ�����
�����ֻҪ�ƶ��кţ������ڶ�Ӧ�е��ַ������char�Ϳ�����

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
