//package wenjing.LeetCode;
//
///*
// * Given a string which consists of lowercase or uppercase letters,
// * find the length of the longest palindromes that can be built with those letters.
//This is case sensitive, for example "Aa" is not considered a palindrome here.
// */
//public class Leetcode409 {
//
//	 public int longestPalindrome(String s) {
//		   if (s == null || s.length() == 0) return 0;
//		    if (s.length() == 1) return 1;
//
//		    int result = 0;
//		   //we use 128 because char c could be A----z so it is like 40--100..
//		    int[] counter = new int[128];
//
//		    // if counter[c] has show we set counter[c] = 1 ,
//		    // show second time, we will assume it as a member of palindrome.
//		    for (char c : s.toCharArray()) {
//		        if(counter[c] == 0) {
//		            counter[c] = 1;
//		        } else {
//		            counter[c] = 0;
//		            result += 2;
//		        }
//		    }
//
//		    return Math.min(result + 1, s.length());
//		}
//
//	 /*
//	  *  a simpler way
//	  */
//	 public int longestPalindrome(String s) {
//	        int[] count = new int[Math.abs('A' - 'z')+1];
//	        int ans = 0;
//	        	//basic same with previous one, but this time we use n/2 to get if it shows twice.
//	        for(int i = 0; i< s.length(); i++) count[s.charAt(i) - 'A']++;
//	        for(int n: count) ans += n/2;
//	        return Math.min(ans*2+1, s.length());
//	    }
//
//
//	public static void main(String[] args){
//
//		System.out.println('z'-'A');
//	}
//}
