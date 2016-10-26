package wenjing.LeetCode;

import java.util.Arrays;



public class LeetCode278 {
	 boolean isBadVersion(int version){
		 return false;
	 }
	 
	 //¶þ·Ö·¨
	public int firstBadVersion(int n) {
	       
		if(n<=0)
		{
			return 0;
		}
		
		
		int firstNumber =help(1,n);
			
		return firstNumber;
    }

	private int help(int beginNumber, int endNumber) {
		// TODO Auto-generated method stub
		
		if(beginNumber>=endNumber){
			return beginNumber;
		}
		int mid  =beginNumber + (endNumber-beginNumber)/2;
		if(isBadVersion(mid)){
			endNumber = mid;
		}else{
			beginNumber = mid+1;
		}
		
		return help(beginNumber,endNumber);
		
		
	}
	
	
	public int firstBadVersionNoRecur(int version){
		
		int begin =1, end = version;
		while(begin<end){
//			int mid = (begin+end)/2;
			int mid = begin+(end-begin)/2;
			if(isBadVersion(mid)){
				end = mid ;
			}else{
				begin = mid +1;
			}
		
		}
		
		return begin;
		
		
		
	
	
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	   
	   
}
