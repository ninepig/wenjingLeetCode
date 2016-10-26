package wenjing.LeetCode;

/*
 * roman to interger 比较简单
 * 
 * 熟悉规则 
 *I V X l C D M
 *只有 I X C 可以作为左边的减数
 *不能跨位数相减 即I 右边只有 vb X右边只有 lc C右边只有DM
 *左边相减，右边相加 
 */
public class LeetCode13Roman {

	 public int romanToInt(String s) {
	     if(s==null||s.length()<=0){
	    	 return 0;
	     }
		 
		 int result = 0;
	     
		 for(int i = 0; i<s.length();i++){
			 
			 switch(s.charAt(i)){
			 case 'I':
				 // I 不是最后一位 且I的下一位是 v 或者 x
				 if(i<s.length()-1 && (s.charAt(i+1)=='V'||s.charAt(i+1)=='X')){
					 result = result - 1;
				 }else{
					 result = result + 1;
				 }
				 break;
			 case 'V':
				 result += 5;
				 break;
			 case 'X':
				 if(i<s.length()-1 && (s.charAt(i+1)=='L'||s.charAt(i+1)=='C')){
					 result = result -10;
				 }else{
					 result = result+ 10;
				 }
				 break;
			 case 'L':
				 result += 50;
				 break;
			 case 'C':
				 if(i<s.length()-1 && (s.charAt(i+1)=='D'||s.charAt(i+1)=='M')){
					 result = result - 100;
				 }else{
					 result = result +100;
				 }
				 break;
			 case 'D':
				 result +=500;
				 break;
			 case 'M':
				 result +=1000;
				 break;
				 //非法数
			 default :
				 return 0;
			 }
			
		 }

	      return result;
	 }
	
	
}
