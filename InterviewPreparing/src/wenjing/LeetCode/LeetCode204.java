package wenjing.LeetCode;

// �Լ��ķ����ᳬʱ ��Ӧ������ȷ�ģ�DP���뷨�����е㸴��
/*
 * LeetCode 204
������
�Լ����뷨������DP�ķ��� ά��һ�����飬����������prime�ģ���ǰ����[n] = ����[N-1]+1 ��֮ ����[N]= ����[N-1]
Ӧ����û�������м��С����
�������++�������顾N-1����ֵҲ������ һ��Ҫ��+1
����ж�������Ƿ�Ϊprime ��Ҫ���ǣ��Լ����뷨̫����

���˱��˵ķ��� ������¶�������ɸ��
�����ǲ��ܱ�С���������������� �� ��һ��boolean ����, ��2��ʼ, ���䱶��С��N�Ķ�ɾ�� �������������leetcode��ʾ�ķ��� 
https://program-think.blogspot.com/2011/12/prime-algorithm-1.html

�������� ֻҪ�޳�2--n�Ŀ��� ֮�����������ı��� �Ϳ�����

Ϊʲô��N�Ŀ�������Ҳû����� ��ǿ�м�ס�Ϳ����ˡ���ŵĸ������i��������� n ���С��I��ƽ������û��Ҫ���ˣ���Ϊ�Ѿ����������Χ����Ϊ����ֻ��Ҫǰ�����������ı�����������������ı������ܴ���N�� Ҫ��Ȼû����

 */
public class LeetCode204 {
//	public static int countPrimes(int n) {
//		if(n<=1){
//			return 0;
//		}
//		
//		
//		int[] number = new int[n+1];
//		
//		number[1] = 0;
//		number[2] = 1;
//		for(int i = 3 ;i<=n;i++){
//			if(isPrime(i)){
//				number[i] = number[i-1]+1;
//			}else{
//				number[i] = number[i-1];
//			}
//		}
//		
//		return number[n-1];
//		
//    }
//
//	private static boolean isPrime(int n) {
//		// TODO Auto-generated method stub
////		if(n==2||n==5||n==7||n==3){
////			return true;
////		}
////		if(n%3 == 0 || n%2==0 || n %5 == 0 || n % 7 == 0 ){
////			return false;
////		}
//		
//		for(int i = 2; i<n/2+1;i++){
//			if(n%i == 0){
//				return false;
//			}
//		}
//		
//		return true;
//	}

	public static void main(String args[]){
		int n = 20;
		System.out.print(countPrimes(499979));
	}
	
	
	
	//��������ɸ��
	//ע�� inner loop��i��ʼ, ��iС�Ļ�����ǰ�ͱ�check��
	public static int countPrimes(int n) {  
	  
	     boolean[] a = new boolean[n];  
	     for(int i=2; i*i<n; i++) {  
	        if(!a[i]) {  
	            for(int j=i; i*j<n; j++) {  
	                a[i*j] = true;  
	            }  
	        }  
	     }  
	     int c=0;  
	       
	     for(int i=2; i<n; i++) {  
	         if(a[i] == false) ++c;  
	     }  
	     return c;  
	    }  
	

}
