package wenjing.LeetCode;

import java.util.ArrayList;
import java.util.List;

/*
 * leetcode 228 ��Ҫ������
һ��ʼ����һ����ʱ��������������� num��I+1����˵��û���жϣ�������������ᱨ���鳬������⣬���������Ŀ����������Ҫ������������ȵ�ʱ�� I+1�������ã���Ը��i������ĵ�һ����ʼ���͵�0�����Ƚϣ���ܰ�ȫ��
�����Ŀ�Լ�һ��ʼ��û����Ŀ���������������̫���ˡ������ȫ�ǲ�̫��
��˼��ת��Ϊ�����˼��ſ��ԡ�һ��Ҫ������ȫ ����ϸ��

 */
public class LeetCode228 {
	 public List<String> summaryRanges(int[] nums) {
	        
		
		 List<String> resultList  = new ArrayList<>();
		 
		 if(nums==null || nums.length==0){
			 return resultList;
 		 }
		
		 String tempString;
		 boolean newStart = true;
		 
		 int beginNumber = nums[0];
		 int endNumber ;
		 for(int i=1; i<nums.length;i++){
			 
	
			 if(nums[i]-nums[i-1]==1){
				 newStart = false;
				 endNumber = nums[i];
			 }else{
				 newStart = true;
				 if(nums[i-1] == beginNumber){
					 resultList.add(Integer.toString(beginNumber));
				 }else{
					 resultList.add(Integer.toString(beginNumber)+"->"+Integer.toString(nums[i-1]));
				 }
				 beginNumber = nums[i];
			 }
			 
		 }
		 //ֱ������û�г���newstart�������������
		 if(!newStart){
			 resultList.add(Integer.toString(beginNumber)+"->"+Integer.toString(nums[nums.length-1]));
		 }else{
			 //���newStart��true������ֻ��һ�����������
			 resultList.add(Integer.toString(beginNumber));
		 }
		 
		 return resultList;
		 
	 }
}
