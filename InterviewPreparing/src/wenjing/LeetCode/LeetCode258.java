package wenjing.LeetCode;
/*
 * leetcode 258
教训
做题一定要把题意看明白 看明白！弄明白在开始写代码！
尽量自己想很多的testcase来测试（白板）
有时候尝试枚举法也是可以的
http://www.cnblogs.com/grandyang/p/4741028.html
2种方法
1种是脑子里直接想出来的方法
2是枚举过后 找规律找出来的。（虽然比较。。蛋疼）

 */
public class LeetCode258 {
	  public int addDigits(int num) {
	        
	        if(num<10){
	            return num;
	        }
	        int result = 0;
	        while(num>=10){
	            result = 0;
	            while(num>0){
	                result = num%10 + result;
	                num = num/10;
	            }
	            num = result;
	        }       
	 
	        return result;
	    }
	  
	  public int addDigits2(int num) {
		    
		    if(num == 0)
		    {
		        return num;
		    }
		        
		        return (num-1)%9+1;
		    }
	  
}
