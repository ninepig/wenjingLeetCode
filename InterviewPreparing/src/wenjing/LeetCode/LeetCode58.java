package wenjing.LeetCode;

public class LeetCode58 {

	  public int lengthOfLastWord(String s) {
		  
		  if(s==null||s.length()==0){
			  return 0;
		  }
		  
		  String[] result = s.split(" ");
		  
		  if(result.length<=1){
			  return 0;
		  }
		  
		  char[] lastWord = result[result.length-1].toCharArray();
		  
		  return lastWord.length;
	    }
	
	
}
