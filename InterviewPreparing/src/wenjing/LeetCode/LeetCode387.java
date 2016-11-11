package wenjing.LeetCode;
/*
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 */
public class LeetCode387 {
	/*
	 * 这道题要找的是first char's index， 所有有问题，不能用顺序的array的来比较，这样顺序就变了，一开始的思路有问题
	 */
	 public static int firstUniqChar(String s) {
//		 int targetIndex = 0;
//	       int[] resultArray = new int[26];
//	       for(int i =0 ; i< s.length();i++){
//	    	   resultArray[s.charAt(i)-'a']++;
//	       }
//	       for(;targetIndex<s.length();targetIndex++){
//	    	   if(resultArray[targetIndex]==1){
//	    		   return targetIndex;
//	    	   }
//	       }
//	       return -1;

	 //用暴力法，第一个比较剩下的，有重复的跳出，没有重复的就是你了,解法还是有问题，考虑得不够细致
		 //正确的暴力方法
//		 char [] charr = s.toCharArray();
//			for(int i=0;i<charr.length;i++){
//				if(s.indexOf(s.charAt(i), i+1) == -1 ){
//				if(s.indexOf(s.charAt(i)) == i){
//					return i;
//				}
//				}
//			}
//			return -1;
		 //这个是基于我第一种方法的， 维护了一个额外的index数组，找出谁最先被排出来的，找到那个最小的 返回即可
		    int array_num[] = new int[26];
	        int array_index[] = new int[26];
	        char char_array[] = s.toCharArray();
	        int length = char_array.length;
	        for (int i = 0; i < length; i++) {
	            char c = char_array[i];
	            array_num[c-'a']++;
	            array_index[c-'a'] = i;
	        }
	        int min_index = -1;
	        for (int j = 0; j < array_num.length; j++) {
	            if (array_num[j] == 1) {
	                if (min_index != -1) {
	                    if (min_index > array_index[j]) {
	                        min_index = array_index[j];
	                    }
	                } else {
	                    min_index = array_index[j];
	                }
	            }
	        }
	        return min_index;
		 
		 
		 }
	 
	 public static void main(String[] args){
		String testString = "loveleetcode";
		System.out.println(firstUniqChar(testString));
	 }
}
