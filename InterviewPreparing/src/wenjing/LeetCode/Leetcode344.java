package wenjing.LeetCode;
/*
 * Given s = "hello", return "olleh".
 * 这个题很简单。但是效率很低
 * 但是学到了用异或交换字符！太牛逼了
 * 
 * 
 * 
 * 交换a，b两值的方法：
                    a = a^b;
                    b = a^b;
                    a = a^b;
后来想想，真是太神奇了！其实，我们首先知道，对于任意的x满足：
                               x^x == 0;
                               x^0 == x;
那么上面的式子事实上是利用了如上的规则，首先用a保存了a^b的 值，再用b = a ^ b = (a^b)^b=a^b^b=a^(b^b)=a^0=a，这样就成功的实现了b = a；
接着又用a = a^b = (a^b)^b（第一个b还是原来的b，而第二个b已经是a的值，因为前面已经实现了交换）= (a^b)^a = a^a^b = 0^b = b，这样就实现了a = b；
于是，就成功的实现了a，b两个值的交换
 */
public class Leetcode344 {
	 public String reverseString(String s) {
	        
//		 if(s==null){
//			 return null;
//		 }
//		 
//		 //trick 的地方，如果字符串为空，则要返回空
//		 if(s==""){
//			 return "";
//		 }
		//用这种形式更好
		 if(s==null||s==""){
			 return s;
		 }
		 
		 StringBuffer resultString = new StringBuffer();
		 int StringLength = s.length();
		 
		 for(int i=StringLength-1;i>=0;i--){
			 resultString.append(s.charAt(i));
		 }
		 
		 return resultString.toString();
		 
	    }
	 //上面一种太费时间了，用两个pointer更好，因为只要前后换就可以了, 前后互换
	 public String reverseString(String s) {
	        
//		 if(s==null){
//			 return null;
//		 }
//		 
//		 //trick 的地方，如果字符串为空，则要返回空
//		 if(s==""){
//			 return "";
//		 }
		//用这种形式更好
		 if(s==null||s==""){
			 return s;
		 }
		 char[] charList = s.toCharArray();
		 int listLength = charList.length;
		
		 for(int i = 0; i<=(listLength-1)/2;i++){
			 char temp = charList[i];
			 charList[i] = charList[listLength-i-1];
			 charList[listLength-i-1]=temp;
		 }
		 
		 
		 return charList.toString();
		 
	    }
	 
	
}
