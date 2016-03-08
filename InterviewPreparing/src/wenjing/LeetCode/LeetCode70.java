package wenjing.LeetCode;
/*
 * leetCode 70 ��¥��1
�����һ������Ŀ ��һ��Ӧ���Ƕ�̬�滮�������Լ�û��ô��ϵ����̬�滮������ֻ֪����������衣
Ȼ����ö�ٷ� ������fibnacchi���У����Խ����
���ǿ��˱��˴���Ľ��ͣ��������������壨�Ҿ��ú���Ҫ��
���ڵ���N�㣬������Ҫ�������ڵ�N-1����1������N-2����2����
������Ϳ���д��״̬�ֽⷽ���� ��dp�ĺ��ľ���д��״̬�ֽⷽ�̣�Ȼ������������������ķ����Ϳ���ά���ˡ�

 */
public class LeetCode70 {
	   public int climbStairs(int n) {
	     
		   if(n== 0 ){
			   return 0;
		   }
		   int[] result = new int[n+1];
		   if(n<=2){
			   result[n] = n;
			   return result[n];
		   }
		   result[1] = 1;
		   result[2] = 2;
		   
		   for(int i = 3; i<=n ; i++){
			 
			   result[i] = result[i-1]+result[i-2];
		   }
		  
		   return result[n];
	    }
}
