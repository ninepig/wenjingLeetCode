package wenjing.LeetCode;
/*
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -
 *http://www.cnblogs.com/youxin/p/3295649.html
 */
public class Leetcode371 {
	  public int getSum(int a, int b) {
	        
		  
		    int ans;
		     while(b!=0)
		     {
		         //ֱ��û�н�λ
		    	 //�����ansΪ������򣬲����ǽ�λ�ļӷ����
		        ans=a^b;
		        // a b���룬������һλ�������λ
		        b=(a&b)<<1;
		        a=ans;
		        //��λΪ0ʱ����
		     }
		     return a;
		}
	    
}
