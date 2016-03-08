package wenjing.LeetCode;

public class LeetCode66 {

	  public int[] plusOne(int[] digits) {
	     if(digits==null||digits.length<1){
	    	 return digits;
	     }
		 int moveNumber = 1;
		 
		 for(int i = digits.length-1;i>=0;i--){
			 //这里错了，重复赋值了
			// digits[i] = (digits[i]+moveNumber)%10;
			 
			 int digitsNumber = (digits[i]+moveNumber)%10;
			 moveNumber = (digits[i]+moveNumber)/10;
			 digits[i] = digitsNumber;
			 if(moveNumber==0){
				 return digits;
			 }
		 }
		 
		 int[] res = new int[digits.length+1];
		 res[0] = 1;
		 for(int i = 1;i<digits.length+1;i++){
			 res[i] = 0;
		 }
		 
	     return res;
		  
	    }
	
}
