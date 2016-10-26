package wenjing.LeetCode;

/*
 * LeetCode 翻转integer
如上一题(leetcode9)的解法2，翻转题目就是基本的数字操作，其实只要是%10  乘10这样的操作 但是要注意2个地方 1是integer会不会越界，第二就是正负号的处理

数字基本操作的解法，要算乘数 必须先*10 再加上数取10位数的余，因为初始化为0，第一次做乘法 还是0

 */
public class LeetCode7 {
	 public int reverse(int x) {
	     
		 if(x == Integer.MIN_VALUE){
			 return 0;
		 }
		 int number = Math.abs(x);
		 int result = 0;
		 while(number>0){
			 
			 // 这行代码很巧妙，因为我们要避免  result*10 + number%10 大于Interger.mAXVAULE ,但是要避免超过上届，所以移到了右边 真的非常厉害的方法
			 if(result > (Integer.MAX_VALUE -number%10)/10){
				 return 0;
			 }
			 //先乘以10 ，再加上余数，这才是逻辑。这种数字题一定要写上几次草稿
			 result *= 10;
			 result += number%10;

			 number/=10;
 
		 }
		 
		 
		 return x>0 ?result:-result;
		 
	    }
	
	
}
