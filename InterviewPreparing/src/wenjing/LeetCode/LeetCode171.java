package wenjing.LeetCode;

/*
 * easy
 * Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
 */


/*2016/2/29 9:18
 * 解题思路：
 * 第n位代表的是26的（N-1）次方乘以第N位的值 ，把每一位的和相加即可。A代表1--Z代表26
 * 所以用字母相减作为系数，eg：C-A +1 = 3
 *
 *感受：
 *数字题，一定要把题意理解，打好草稿，就可以一击即中
 */
public class LeetCode171 {

//	public int  titleToNumber(String s){
//		
//		char[] intputTitleArray = s.toCharArray();
//		int number = 0;
//		for(char thisChar:intputTitleArray){
//			//因为第一位的系数我们要考虑到逻辑里，第一位的系数是0+char所代表的系数,得到系数就可以计算下一位的值了。bingo
//			number = number*26 +(thisChar-'A'+1); 
//		}
//		
//		return number;
//		
//	}
//	
	
	
	public int titleToNumber(String s) {
        
		int result = 0;
		char[] charArray = s.toCharArray();
		int thisCharValue;
		
		
		for(int i = 0 ; i < charArray.length ; i++){
			thisCharValue = charArray[i]-'A'+1;
			result = result*26+thisCharValue;
		}
		
		return result;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
