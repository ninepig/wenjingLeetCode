package wenjing.LeetCode;

/*
 * LeetCode 172 �׳˵�0�ж��ٸ�
�����һ��ʼͷ���ˡ������˽׳˵ĸ���
Ҫ��0 ֻҪ�ӽ׳���ȡ��һ��2*5����ϾͿ�����
���ǽ׳�����2�ı����϶���5�࣬����ֻҪȡ��5�ı������Լ�5��ƽ���ı��������ˡ� ���ѡ� ����һ��ʼ�Բ���

 */
public class LeetCode172 {
	   public int trailingZeroes(int n) {
	     
		   if(n<=0){
			   return 0;
		   }
		   int count = 0 ;
		   
		   while(n>0){
			   //1---2----5-------26-----626.....
			   //�����5�����ĸ��� �Լ���25 125 625�����ĸ���
			   count += n/5; 
			   n = n/5;
			   
		   }
		   
		   return count;
		   
		   
	    }
}
