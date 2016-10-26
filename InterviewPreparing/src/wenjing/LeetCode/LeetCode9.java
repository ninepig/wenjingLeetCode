package wenjing.LeetCode;

/*
 * Leetcode 9 是否回文数
一开始都没能理解 no extra space的概念
直接看了答案 没有细想（这种只要掌握了一次就肯定知道的题目，没想出来 就直接看答案了 ）
大神的解法
一次比较第一位和最后一位 如果不相同则false 
巧妙的地方就是维护了一个div（除数），初始化他的时候 他是以回文数除以回文数位数*10，比如1234321 div为1000000
所以第一位就是 回文数/div 最后一位则是 回文数%10.
循环的时候，只要用回文数%div/10 就可以得到 去掉头尾的回文数了 这时候将div= div/100 就可以继续循环了
非常巧妙
第二个解法 是我一开始比较认可的
就是把回文数倒过来乘起来相加，如果等于回文数，则说明相同。

 */
public class LeetCode9 {

	  public boolean isPalindrome(int x) {

		  if(x<0){
			  return false;
		  }
		  int div = 1 ;
		  // div 必须小于等于 不是小于，因为有可能是1开头的情况
		 while(div<=(x/10)){
			 div*=10;
		 }
		 
		 while(x>0){
			 
			 if(x/div != x%10){
				 return false;
			 }
			 x= (x%div)/10;
			 div = div/100;
			 
			 
			 
		 }
		 
		 
		  return true;
		  
	    }
	
	  //faster way 这个就是第7题的解法，把数字倒过来了，但是因为这个回文数不用考虑越界和正负的关系，所以更简单了
	  public boolean isPalindrome2(int x) {

		  
		  int result = 0 , thisNumber = x;
		  while(thisNumber>0){
			  
			  result *= 10;
			  result += thisNumber%10;
			  thisNumber /= 10;
			  
		  }
	  
		  return result == x;
	  }
	
}
