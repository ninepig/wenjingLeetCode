//package wenjing.LeetCode;
//
///*
// *
//leetcode 231 �Ƿ���2����
//�ҵ�һ��Ӧ�ǰ�����ת���ɶ�����
//1
//10
//100
//1000
//ֻҪ�ǵ�һλΪ1 �����ı��붼����0 ���ܷ���Ҫ��ͨ���˸��Ӷ��е��
//
//���ǿ�����һ�� �Ƿ���3���� ���Ҿ���������
//ֻҪ�ݹ����2 ����ȡ�������� �Ϳ�����������Ŀ ����ʱ�临�Ӷ�Ҳ���
//
//����һ��Ҫ��λ����������ʡʱ��
//
//
// */
//public class LeetCode231 {
//	 public static boolean isPowerOfTwo(int n) {
//	     if(n<=0){
//	    	 return false;
//	     }
//		 String binaryResult = Integer.toBinaryString(n);
//
//		 if(binaryResult.charAt(0)!='1'){
//			 return false;
//		 }
//
//		 for(int i = 1;i<binaryResult.length();i++){
//
//			if(binaryResult.charAt(i) != '0'){
//				return false;
//			}
//		 }
//
//		 return true;
//
//
//	    }
//
//
//
//
//
//	    public boolean isPowerOfTwo(int n) {
//
//	    	if(n<=0){
//	    		return false;
//	    	}
//	    	while(n%2 == 0){
//	    		n=n/2;
//	    	}
//	    	if(n==1){
//	    		return true;
//	    	}
//	    	return false;
//
//	    }
//
//
//
//	 /*
//	  * Method 3: Bit operation
//
//	If n is the power of two:
//
//	n = 2 ^ 0 = 1 = 0b0000...00000001, and (n - 1) = 0 = 0b0000...0000.
//	n = 2 ^ 1 = 2 = 0b0000...00000010, and (n - 1) = 1 = 0b0000...0001.
//	n = 2 ^ 2 = 4 = 0b0000...00000100, and (n - 1) = 3 = 0b0000...0011.
//	n = 2 ^ 3 = 8 = 0b0000...00001000, and (n - 1) = 7 = 0b0000...0111.
//	we have n & (n-1) == 0b0000...0000 == 0
//
//	Otherwise, n & (n-1) != 0.
//
//	For example, n =14 = 0b0000...1110, and (n - 1) = 13 = 0b0000...1101.
//	  */
//
//
//
//
//	public static void main(String[] args){
//
//		int n = 7 ;
//
//		System.out.println(isPowerOfTwo(n));
//
//	}
//
//
//}
