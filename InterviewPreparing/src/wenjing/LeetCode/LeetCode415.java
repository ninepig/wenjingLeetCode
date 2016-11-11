package wenjing.LeetCode;
/*
 *Given two non-negative numbers num1 and num2 represented as string, return the sum of num1 and num2.

Note:

The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */
public class LeetCode415 {
	 public static String addStrings(String num1, String num2) {
	        /*
	         * we need a carry bit, each char of string add together, and put the result in a stringbuffer
	         */
		 if(num1==null&&num2==null){
			 return null;
		 }
		 if(num1==null){
			 return num2;
		 }
		 if(num2==null){
			 return num1;
		 }
		 
		 StringBuffer resultString   = new StringBuffer();
		 int carryBit = 0;
		 int digit = 0;
		 int num1Index = num1.length()-1;
		 int num2Index = num2.length()-1;
		
		 while(num1Index>=0&&num2Index>=0){
			 
			digit = (num1.charAt(num1Index)-'0'+num2.charAt(num2Index)-'0'+carryBit)%10;
			carryBit = (num1.charAt(num1Index)-'0'+num2.charAt(num2Index)-'0'+carryBit)/10;
			resultString.append(digit);
			num1Index--;
			num2Index--;
			
		}
		 
		 while(num1Index>=0){
			 digit = (num1.charAt(num1Index)-'0'+carryBit)%10;
			carryBit = (num1.charAt(num1Index)-'0'+carryBit)/10;
			resultString.append(digit);
			num1Index--;
		 }
		 while(num2Index>=0){
			 digit = (num2.charAt(num2Index)-'0'+carryBit)%10;
			carryBit = (num2.charAt(num2Index)-'0'+carryBit)/10;
			resultString.append(digit);
			num2Index--;
		 }
		 
		 if(carryBit>0){
			 resultString.append(carryBit);
		 }
		 
		 return resultString.reverse().toString();
	    }
	 
	 public static void main(String[] args){
		 
		 System.out.println(addStrings("139","24"));
		 
		 
	 }
}
