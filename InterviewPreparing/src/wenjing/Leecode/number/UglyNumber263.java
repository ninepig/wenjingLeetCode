package wenjing.Leecode.number;
/*
 * Write a program to check whether a given number is an ugly number.

Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.

Note that 1 is typically treated as an ugly number.
 */
public class UglyNumber263 {

	// prime factors only include 2,3 ,5 so it mean thu number can be divide by 2 or 3 or 5.but can not be divide by other number.
	 public boolean isUgly(int num) {
	     if(num<0){
	    	 return false;
	     }
		 
	     while(num%2 == 0){
	    	 num = num/2;
	     }
	     while(num%3 == 0){
	    	 num = num/3;
	     }
	     while(num%5 == 0){
	    	 num = num/5;
	     }
	  //other prime factors like 7 , 11, can not get 1;   
	     return num == 1;
	     
	    }
	
}
