package wenjing.LeetCode;

/*
 * 
leetcode 231 �Ƿ���2����
�ҵ�һ��Ӧ�ǰ�����ת���ɶ�����
1
10
100
1000 
ֻҪ�ǵ�һλΪ1 �����ı��붼����0 ���ܷ���Ҫ��ͨ���˸��Ӷ��е��

���ǿ�����һ�� �Ƿ���3���� ���Ҿ���������
ֻҪ�ݹ����2 ����ȡ�������� �Ϳ�����������Ŀ ����ʱ�临�Ӷ�Ҳ���

����һ��Ҫ��λ����������ʡʱ��


 */
public class LeetCode231 {
	 public static boolean isPowerOfTwo(int n) {
	     if(n<=0){
	    	 return false;
	     }
		 String binaryResult = Integer.toBinaryString(n);
		 
		 if(binaryResult.charAt(0)!='1'){
			 return false;
		 }
		 
		 for(int i = 1;i<binaryResult.length();i++){
			 
			if(binaryResult.charAt(i) != '0'){
				return false;
			}
		 }
	   
		 return true;
	    
		 
	    }
	

	
	 
	 

	public static void main(String[] args){
		
		int n = 7 ;
		
		System.out.println(isPowerOfTwo(n));
		
	}
	
	
}
