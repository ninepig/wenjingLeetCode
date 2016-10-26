package wenjing.LeetCode;

// 自己的方法会超时 但应该是正确的，DP的想法好像有点复杂
/*
 * LeetCode 204
算质数
自己的想法是利用DP的方法 维护一个数组，如果这个数是prime的，则当前数组[n] = 数组[N-1]+1 反之 数组[N]= 数组[N-1]
应该是没错，但是中间的小错误
如果用了++，则数组【N-1】的值也会增加 一定要用+1
如何判断这个数是否为prime 需要考虑，自己的想法太简单了

看了别人的方法 大概如下厄拉多塞筛法
素数是不能被小于它的整数整除的 。 建一个boolean 数组, 从2开始, 把其倍数小于N的都删掉 ，这个方法就是leetcode提示的方法 
https://program-think.blogspot.com/2011/12/prime-algorithm-1.html

计算素数 只要剔除2--n的开根 之间所有素数的被数 就可以了

为什么是N的开根，我也没想出来 ，强行记住就可以了。大概的概念就是i如果是素数 n 如果小于I的平方，就没必要算了，因为已经出了这个范围，因为我们只需要前面所有素数的倍数，但是这个素数的倍数不能大于N啊 要不然没意义

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
	
	
	
	//厄拉多塞筛法
	//注意 inner loop从i开始, 比i小的会在以前就被check过
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
