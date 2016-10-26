package wenjing.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode165 {
	
	//想的太简单了，没有考虑如果version number 没有小数点的情况
//    public int compareVersion(String version1, String version2) {
//        
//		if (version1 == null || version2 == null) {
//			return 0;
//		}
//		// split two string by .
//		String[] versionList = version1.split(".");
//		String[] versionList2 = version2.split(".");
//
//		int versionListFirstPart = Integer.parseInt(versionList[0]);
//		int versionListFirstPart2 = Integer.parseInt(versionList2[0]);
//
//		int versionListSecondPart = Integer.parseInt(versionList[1]);
//		int versionListSecondPart2 = Integer.parseInt(versionList2[1]);
//
//		if (versionListFirstPart > versionListFirstPart2) {
//			return 1;
//		} else if (versionListFirstPart < versionListFirstPart2) {
//			return -1;
//		} else {
//
//			if (versionListSecondPart > versionListSecondPart2) {
//
//				return 1;
//			} else if (versionListSecondPart < versionListSecondPart2) {
//				return -1;
//			} else {
//
//				return 0;
//			}
//
//		}
//    	
    	
    	
    	
    
//  public static int compareVersion(String version1, String version2) {
//  
//		if (version1 == null || version2 == null) {
//			return 0;
//		}
//
//		int version1firstPart, version2FirstPart, version1SecondPart, version2SecondPart;
//
//		if (version1.contains(".")) {
//			
//			String[] splitResult = version1.split("[.]");
//			version1firstPart = Integer.parseInt(splitResult[0]);
//			version1SecondPart = Integer.parseInt(splitResult[1]);
//
//		} else {
//
//			version1firstPart = Integer.parseInt(version1);
//			version1SecondPart = 0;
//		}
//
//		if (version2.contains(".")) {
//			String[] splitResult = version2.split("[.]");
//			version2FirstPart = Integer.parseInt(splitResult[0]);
//			version2SecondPart = Integer.parseInt(splitResult[1]);
//
//		} else {
//
//			version2FirstPart = Integer.parseInt(version2);
//			version2SecondPart = 0;
//		}
//
//		if (version1firstPart > version2FirstPart) {
//			return 1;
//		} else if (version1firstPart < version2FirstPart) {
//			return -1;
//		} else {
//			if (version1SecondPart > version2SecondPart) {
//				return 1;
//			} else if (version1SecondPart < version2SecondPart) {
//				return -1;
//			} else {
//				return 0;
//			}
//
//		}
//
//	}
  
//  	public static void main(String[] args){
//  		
//  		int result = compareVersion("1.0","1.1");
//  		System.out.println(result+"");
//  	}

	//csdn 方法
	 static int compareVersion1(String version1, String version2) {  
         
	        List<Integer> v1 = new ArrayList<Integer>();  
	        List<Integer> v2 = new ArrayList<Integer>();          
	  
	        for (String s : version1.split("\\.")) {  
	            int n = 0;  
	            for (Character c : s.toCharArray())   
	                n = n * 10 + c - '0';  
	            v1.add(n);  
	        }  
	        for (String s : version2.split("\\.")) {  
	            int n = 0;  
	            for (Character c : s.toCharArray())   
	                n = n * 10 + c - '0';  
	            v2.add(n);  
	        }  
	          
	        while(v1.size() != v2.size()) {  
	            if(v1.size() < v2.size()) v1.add(0);  
	            else v2.add(0);  
	        }  
	          
	        for (int i = 0; i < Math.min(v1.size(), v2.size()); i++) {  
	            if(v1.get(i) < v2.get(i)) return -1;  
	            else if(v1.get(i) > v2.get(i)) return 1;  
	        }  
	  
	        return 0;  
	          
	    }  
	 
	 
	 
	 //leetcode方法 不使用split 
	 public int compareVersion(String version1, String version2) {
		    int p1=0,p2=0;
		    while(p1<version1.length() || p2<version2.length()){
		        int num1=0,num2=0;
		        while(p1<version1.length() && version1.charAt(p1)!='.') num1 = num1*10 + (version1.charAt(p1++) - '0'); // get number in version1..
		        while(p2<version2.length() && version2.charAt(p2)!='.') num2 = num2*10 + (version2.charAt(p2++) - '0'); // get number in version2.
		        if(num1 != num2) return num1>num2 ? 1:-1;
		        p1++;
		        p2++;
		    }
		    return 0;
	 }
}

























