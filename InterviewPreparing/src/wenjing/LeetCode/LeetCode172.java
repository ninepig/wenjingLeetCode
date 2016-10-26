package wenjing.LeetCode;

/*
 * LeetCode 172 阶乘的0有多少个
这道题一开始头晕了。忘记了阶乘的概念
要得0 只要从阶乘里取出一个2*5的组合就可以了
但是阶乘里面2的倍数肯定比5多，所以只要取出5的倍数，以及5的平方的倍数就行了。 不难。 就是一开始脑残了

 */
public class LeetCode172 {
	   public int trailingZeroes(int n) {
	     
		   if(n<=0){
			   return 0;
		   }
		   int count = 0 ;
		   
		   while(n>0){
			   //1---2----5-------26-----626.....
			   //算出被5整除的个数 以及被25 125 625整除的个数
			   count += n/5; 
			   n = n/5;
			   
		   }
		   
		   return count;
		   
		   
	    }
}
