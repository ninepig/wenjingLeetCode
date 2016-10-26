package wenjing.LeetCode;

public class LeetCode168 {
//	  public String convertToTitle(int n) {
//	 
//		  StringBuffer result = new StringBuffer();
//		  int reminder = 0;
//		  while(n>0){
//			  
//			  reminder = (n-1)%26;
//			  result.insert(0, (char)(reminder+'A'));
//			  
//			  n = (n-reminder)/26;
//			  
//		  }
//		  
//		  return result.toString();
//		  
//	    }

	  public String convertToTitle(int n) {
	        StringBuilder str = new StringBuilder();
	        int remainder = 0;
	        while(n > 0){
	            remainder = (n-1) % 26;
	            str.insert(0, (char)(remainder + 'A'));
	            //这里只要减1--25都可以
	            n = (n - remainder) / 26;
	        }
	        return str.toString();
	    }
}
