package wenjing.LeetCode;
/*
 * leetcode 38 facebook  ��Ҫ������ ��������
count and say
http://www.cnblogs.com/higerzhang/p/4050290.html
���Լ������ˣ���Ŀ���������������˱��˵Ľ��Ͳ�����
�����������Ժ�;��ò�����ô����

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
		            	//�������� ��֮ǰ��count �� sign_char��ӵ��ַ�����
		                newString += Integer.toString(count) + sign_char;
		                count = 1;
		                sign_char = result.charAt(j);
		            }

		        }
		        
		        //������һ��
		        newString += Integer.toString(count) + sign_char;
		        result = newString;
		        newString = "";
		    }
		    return result;
		}
	   
	   
	
	
}
