package wenjing.interview.cc150.arrayandstrings;

import java.util.HashSet;

/*
 * 1.1
 * implement an algorithm to determine if a string has all unique charcters what if you cannot use additional data structures?
 * 
 * 
 * 
 * 
 */
public class DetermineUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String testCase;
	
	}
	
	/*
	 * useful method 
	 * char array = string.toCharArray();
	 *time o(n)
	 *space o(n)
	 *
	 */
	boolean haveUniqueChaUsingDataStructure(String inputString){
			
		boolean ifOrNot = false;
		
		
		HashSet<Character> testHashset = new HashSet<Character>();
		
		for(int i = 0 ;i<inputString.length();i++){
			
			char thisChar = inputString.toCharArray()[i];
			if(!testHashset.add(thisChar))
				return false;
		}
		return ifOrNot;
	}
	
	
	/*
	 * time o(n)
	 * space o(1)
	 */
	boolean haveUniqueCharUsingArray(String inputString){
		if(inputString.length()>256){
			return false;
		}
		
		boolean[] arrayResult = new boolean[256];
		
		for(int i = 0;i<inputString.length();i++){
			int val = inputString.charAt(0);
			if(arrayResult[val]){
				return false;
			}
			arrayResult[val] = true;
		}
		
		return true;
	}
	
	/*
	 * 很挫这个方法
	 */
//	boolean haveUniqueCharUsingBit(String inputString){
//		if(inputString.length()>256){
//			return false;
//		}
//		
//		int checkSum = 0;
//		for(int i =0;i<inputString.length();i++){
//				
//		}
//		return true;
//	}
	
/*
 * 还可以用一个每个字符和另一个比较的方法。time 0（n^2）	
 */
	
	
	
	
	
	

}
