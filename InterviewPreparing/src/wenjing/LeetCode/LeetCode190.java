package wenjing.LeetCode;

/*
 * ������ǻ����Ķ����������������ѣ�������Ҫ��������� ������֪ʶ
���java��̱ʼǱ�
������˼·���£����˴𰸣�
�����κ�int��java32λ��
������1��00000000000001��ȥ&�����Ľ����Ŀ��intλ���λ��ֵ��0 or1�� ��ȡһ��result ֵ���������ӣ�Ȼ����N�����ƶ�һλ ��result �����ƶ�һλ��֪��32λ��ȥ�Ժ󣬾�����ɷ�ת�����������û��⣩
ǰ����ͬ����������������������������������������������������������������ȡ�����λ�Ժ󣬽������ƣ�31-i��λ��ֱ�ӷ�ת��Ȼ��ͬ����һ��result������ ����result�ͷ�ת�Ժ��ֵ����Ϳ�����

 */
public class LeetCode190 {
	 public int reverseBits(int n) {
	     
		 int result = 0 ;
		 
		 for(int i = 0; i<32 ; i ++){
			 
			 int temp = n&1;
			 
			 temp = temp<<(31 - i);
			 
			 result |= temp;
			 
			 n= n>>>1;
			 
			 
		 } 
		 return result;
	    }
	 
//	 public int reverseBits(int n) {
//	     int result = 0;
//	     for(int i = 0 ; i<32 ;i ++){
//	    	 result += n&1;
//	    	 n=n>>>1;
//	    	 if(i<31){
//	    		 result =result <<1;
//	    	 }
//	    	 
//	     }
//		 return result;
//		
//	    }
}
