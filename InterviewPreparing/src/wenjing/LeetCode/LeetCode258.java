package wenjing.LeetCode;
/*
 * leetcode 258
��ѵ
����һ��Ҫ�����⿴���� �����ף�Ū�����ڿ�ʼд���룡
�����Լ���ܶ��testcase�����ԣ��װ壩
��ʱ����ö�ٷ�Ҳ�ǿ��Ե�
http://www.cnblogs.com/grandyang/p/4741028.html
2�ַ���
1����������ֱ��������ķ���
2��ö�ٹ��� �ҹ����ҳ����ġ�����Ȼ�Ƚϡ������ۣ�

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
