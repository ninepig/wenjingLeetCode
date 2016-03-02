package wenjing.LeetCode;

import java.util.HashSet;

/*
 * 217
 * Given an array of integers, find if the array contains any duplicates. 
 * Your function should return true if any value appears at least twice in the array,
 *  and it should return false if every element is distinct.
 */

/*
 * ����˼·��
 * ����� ����ȥ�أ��Ƚϼ� ����Ϊ���ÿ��ǵ���ֵ �����ǵ���ֵ�Ŀ����û���hashmap
 * ��һ��Ӧ������hashset 
 * �ڶ���Ӧ���Ƕ���������Ȼ�󿴿�ǰ���Ƿ����
 */
public class Leetcode217 {

	public boolean containDuplicate(int nums[]){
		
		
		if(nums.length<1){
			return false;
		}
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0; i< nums.length;i++){
			if(!set.add(nums[i])){
				return true;
			}
		}
		return false;
		
	}
	
	
}
