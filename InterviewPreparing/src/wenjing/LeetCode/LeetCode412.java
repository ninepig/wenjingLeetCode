package wenjing.LeetCode;

import java.util.ArrayList;
import java.util.List;

/*
 * Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output ��Fizz�� instead of the number and for the multiples of five output ��Buzz��. 
For numbers which are multiples of both three and five output ��FizzBuzz��.
 */
/*
 * solution:
 * ��1��ʼȡ�࣬�Ƚ���15��ȡ�࣬Ȼ����3 ���� 5�� �����������
 */
public class LeetCode412 {
	  public List<String> fizzBuzz(int n) {
	    
		  ArrayList<String> result = new ArrayList<String>();
		  for(int i = 1; i<=n ; i++){
			  if(i%15==0){
				  result.add("FizzBuzz");
//				  continue;
			  }else if(i%3==0){
				  result.add("Fizz");
//				  continue;
			  }else if(i%5==0){
				  result.add("Buzz");
//				  continue;
			  }else{
				  result.add(i+"");
//				  continue;
			  }
		  
		  }
		  
		  return result;
	    }
}
