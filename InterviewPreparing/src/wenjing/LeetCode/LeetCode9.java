package wenjing.LeetCode;

/*
 * Leetcode 9 �Ƿ������
һ��ʼ��û����� no extra space�ĸ���
ֱ�ӿ��˴� û��ϸ�루����ֻҪ������һ�ξͿ϶�֪������Ŀ��û����� ��ֱ�ӿ����� ��
����Ľⷨ
һ�αȽϵ�һλ�����һλ �������ͬ��false 
����ĵط�����ά����һ��div������������ʼ������ʱ�� �����Ի��������Ի�����λ��*10������1234321 divΪ1000000
���Ե�һλ���� ������/div ���һλ���� ������%10.
ѭ����ʱ��ֻҪ�û�����%div/10 �Ϳ��Եõ� ȥ��ͷβ�Ļ������� ��ʱ��div= div/100 �Ϳ��Լ���ѭ����
�ǳ�����
�ڶ����ⷨ ����һ��ʼ�Ƚ��Ͽɵ�
���ǰѻ�������������������ӣ�������ڻ���������˵����ͬ��

 */
public class LeetCode9 {

	  public boolean isPalindrome(int x) {

		  if(x<0){
			  return false;
		  }
		  int div = 1 ;
		  // div ����С�ڵ��� ����С�ڣ���Ϊ�п�����1��ͷ�����
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
	
	  //faster way ������ǵ�7��Ľⷨ�������ֵ������ˣ�������Ϊ������������ÿ���Խ��������Ĺ�ϵ�����Ը�����
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
