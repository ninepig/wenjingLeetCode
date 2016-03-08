package wenjing.LeetCode;

/*
 * leetCode 28 �ַ���ƥ��
������ñ�������ʱ�临�Ӷ���O��mn�� mn�ֱ����ַ����ĳ��ȣ����Ҫ������ Ӧ����o��m+n������KMP�㷨 �Ƚϸ��ӵ�һ���㷨��Ҫѧϰһ��
�������ʵ���Լ���˼·�ͱ����㷨��˼·���
�Լ����뷨�����ҵ��ڵ���һλ�ַ���ԭ�ַ�������ͬ��Ȼ��Ƚ�ʣ�µģ������Լ��ӱ�̽Ƕ�ʵ���ϳ������⡣
������˵˵brute force���㷨������ԭ���ĳ�����n��ƥ�䴮�ĳ�����m��˼·�ܼ򵥣����Ƕ�ԭ����ÿһ������Ϊm���ִ����ж��Ƿ��ƥ�䴮һ�¡��ܹ���n-m+1���Ӵ��������㷨ʱ�临�Ӷ�ΪO((n-m+1)*m)=O(n*m)
�����˼·

 */
public class LeetCode28 {
//	  public int strStr(String a, String b) {
//	      if(a == null || b == null||a.length()==0||a.length()<b.length()){
//	    	  return -1;
//	      }
//	      if(b.length() == 0 ){
//	    	  return 0;
//	      }
//	      
//		  int position = -1;  
//		  
//		  for(int i = 0; i <= a.length()-1;i++){
//			  
//			  if(a.charAt(i) == b.charAt(0)){
//				  
//
//				  int remainLength = b.length()-1;
//				  while(remainLength>0){
//					  
//					  if(a.charAt(++i)!=b.charAt(remainLength)){
//						  return -1;
//					  }
//					  
//					  remainLength--;
//				  }
//				  
//				  return i;
//				  
//			  }
//	  		  
//		  }
//	  
//		  return position;
//	    }
	//��������� �걬�ҵİ��� 
	//������һ���жϵ�false�������� �ǲ�����ģ���Ϊ���滹���ַ���������������
	public int strStr(String haystack, String needle) {  
		if(haystack == null || needle == null|| needle.length()==0){
			return 0;
		}
		if(haystack.length()<needle.length()){
			return -1;
		}
		for(int i = 0; i<= haystack.length()-needle.length();i++){
			boolean ifEqual = true;
			for(int j = 0 ; j < needle.length();j++){
				if(haystack.charAt(i+j)!=needle.charAt(j)){
					ifEqual = false;
					break;
				}
//				if(!ifEqual){
//					return -1;
//				}
			}
			
			if(ifEqual){
				return i;
			}
		}
		
		return -1;
	}
	
	
}
