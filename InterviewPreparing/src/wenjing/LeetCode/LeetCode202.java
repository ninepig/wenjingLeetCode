package wenjing.LeetCode;

import java.util.ArrayList;

/*
 * leetcode202 happy number
������õ��Ժ��˼·��
����֮ǰ���ֵ��κ�Ҫ��һ��������λ�� һ����Ҫ���� %10 ����ȡ��λ�� ��10 ����λ
������� num + = num%10 �� ƽ��
�����Լ�����ʱ���Ǻ����棬��֪����ô�˳�����
���˴��Ժ� ��2�� һ���� n<10 && n!=1 �������������û����Ϊʲô��n<9 ,�����Լ������Ժ���2--9ȷʵ������
��һ�ֱȽϺõķ�������DP���ѳ��ֹ��Ľ���ŵ�һ���������棬�����ڶ��γ�����ԭ������������ ��˵�����ǲ���ѭ���ˣ����ԾͿ϶���������happy number��
 

 */
public class LeetCode202 {

//	  public boolean isHappy(int n) {
//		  
//		  if(n<=0){
//			  return false;
//		  }
//		  ArrayList<Integer> resultList = new ArrayList<>();
//		  while(n!=1){
//			  if(resultList.contains(n)){
//				  return false;
//			  }
//			  resultList.add(n);
//			  n = getSum(n);
//			  		  
//		  }
//		  
//		  return true;
//		  
//	  }
//
//	private int getSum(int n) {
//		// TODO Auto-generated method stub
//		int result = 0;
//		while(n>0){
//			int lastDigit = n%10;
//			n = n/10;
//			result = result +lastDigit * lastDigit;
//		}
//		return result;
//	}
	
	public boolean isHappy(int n) {
        
		if(n<=0){
			return false;
		}
	
		ArrayList<Integer> resultList = new  ArrayList<>();
		int result = n;
		while(result !=1){
			
			if(resultList.contains(result)){
				return false;
			}
			resultList.add(result);
			result = getSquareSum(result);
		}
		return true;
	
		
    }
/*
 * count the digit summury
 */
	private int getSquareSum(int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		int digit =0;
		while(n>0){
			digit = n%10;
			n=n/10;
			sum = digit*digit+sum;
		}
		
		return sum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
