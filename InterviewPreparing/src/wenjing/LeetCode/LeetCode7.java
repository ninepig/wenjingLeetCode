package wenjing.LeetCode;

/*
 * LeetCode ��תinteger
����һ��(leetcode9)�Ľⷨ2����ת��Ŀ���ǻ��������ֲ�������ʵֻҪ��%10  ��10�����Ĳ��� ����Ҫע��2���ط� 1��integer�᲻��Խ�磬�ڶ����������ŵĴ���

���ֻ��������Ľⷨ��Ҫ����� ������*10 �ټ�����ȡ10λ�����࣬��Ϊ��ʼ��Ϊ0����һ�����˷� ����0

 */
public class LeetCode7 {
	 public int reverse(int x) {
	     
		 if(x == Integer.MIN_VALUE){
			 return 0;
		 }
		 int number = Math.abs(x);
		 int result = 0;
		 while(number>0){
			 
			 // ���д���������Ϊ����Ҫ����  result*10 + number%10 ����Interger.mAXVAULE ,����Ҫ���ⳬ���Ͻ죬�����Ƶ����ұ� ��ķǳ������ķ���
			 if(result > (Integer.MAX_VALUE -number%10)/10){
				 return 0;
			 }
			 //�ȳ���10 ���ټ���������������߼�������������һ��Ҫд�ϼ��βݸ�
			 result *= 10;
			 result += number%10;

			 number/=10;
 
		 }
		 
		 
		 return x>0 ?result:-result;
		 
	    }
	
	
}
