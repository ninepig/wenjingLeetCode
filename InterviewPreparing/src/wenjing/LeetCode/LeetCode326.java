package wenjing.LeetCode;

/*
 * ��һ��Ӧ���� �ݹ����3 ����ȥ��������Ϳ�����ɣ����Ǹ��Ӷȿ϶��ߣ�(��Ȼbeat ��88%��������)������Ŀ��follow up Ҫ���õݹ飬����ѭ��
�벻������

 */
public class LeetCode326 {
	   public boolean isPowerOfThree(int n) {
		   if(n<=0){
			   return false;
		   }
	         while(n%3 == 0){
	        	 
	        	 n /=3;
	        	 
	         }
	         if(n==1){
	        	 return true;
	         }
	         return false;
	    }
	   
	   
	   
	   
	   
	   
}
