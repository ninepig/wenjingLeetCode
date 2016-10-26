package wenjing.LeetCode;

import java.util.ArrayList;
import java.util.List;

/*
 * ����ⲻ�ѣ��ٶ���pascal�����εĹ����Ժ�
 * ��˹�������Σ���һ�������ξ����䶥���� 1,��Ϊ(row0).��1��(row1)(1&1)����1,������1����������ͷ��������֮�� (�����������ڵ�����Ϊ0).
 * �������Ʋ�����2��(row2):0+1=1;1+1=2;1+0=1.��3��(row3):0+1=1;1+2=3; 2+1=3;1+0=1. ѭ�˷����Բ����������С�
 * ��һ�����󣬽�������������Ļ��������ˣ����˴����blog��������һ�顣ά��һ��pre��list��һ��cur��list ��һ�����һ����1 �ֱ���롣
 * ���˵�һ�����һ����Ԫ�صĸ�������һ��Ԫ��-1 �ҵ��������Ϳ����ˣ�����һ��Ҫ�侲���� �������ǵĹ���
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
