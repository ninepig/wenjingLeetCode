package wenjing.LeetCode;

import java.util.ArrayList;
import java.util.List;

/*
 * 这道题不难，百度了pascal三角形的规则以后
 * 帕斯卡三角形，是一个三角形矩阵，其顶端是 1,视为(row0).第1行(row1)(1&1)两个1,这两个1是由他们上头左右两数之和 (不在三角形内的数视为0).
 * 依此类推产生第2行(row2):0+1=1;1+1=2;1+0=1.第3行(row3):0+1=1;1+2=3; 2+1=3;1+0=1. 循此法可以产生以下诸行。
 * 画一个矩阵，接下来就是数组的基本操作了，看了大神的blog，操作了一遍。维护一个pre的list，一个cur的list 第一个最后一个是1 分别加入。
 * 除了第一个最后一个的元素的个数是上一行元素-1 找到这个规则就可以了（做题一定要冷静下来 ，找他们的规则）
 * 
 * 
 */
public class LeetCode118 {
	 public List<List<Integer>> generate(int numRows) {
		   List<List<Integer>> resultList = new ArrayList<>();
	         if(numRows<=0){
				 return resultList;
			 }

	         List<Integer> pre = new ArrayList<>();
		 //first line of tri
		 pre.add(1);
		 resultList.add(pre);
		 
		 for(int i = 2; i<=numRows;i++){
			 
			 List<Integer> cur = new ArrayList<>();
			 cur.add(1);
			 for(int j = 0 ; j<pre.size()-1;j++){
				 cur.add(pre.get(j)+pre.get(j+1));
			 }
			 cur.add(1);
			 resultList.add(cur);
			 pre = cur;
			 
		 }
		 
		 
		return resultList; 
		 
		 
	    }
	
	
	
}
