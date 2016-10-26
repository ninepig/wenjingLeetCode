package wenjing.LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LeetCode219 {
	//��������Լ�����������������hashmap���м��е�С����û��ͨ�����������ͨ����
	
	   public boolean containsNearbyDuplicate(int[] nums, int k) {
	
		   
		   HashMap<Integer, Integer> mHashMap = new HashMap<>();
		   
		   int duplicateIndex = 0;
		   
		   for (int i = 0 ; i<nums.length;i++){
			   
			   if(!mHashMap.containsKey(nums[i])){
				   mHashMap.put(nums[i], i);
			   } else{
				   
				   duplicateIndex = i;  
				   if((duplicateIndex - mHashMap.get(nums[i]))<=k){
				   return true;
				   }else{//����Ҫ��else����Ϊ���������K�ķ�Χ���൱��Ӧ��Ҫ����hashmap�������value��index���������´��жϵĻ���
					   mHashMap.put(nums[i], i);
				   }
				   
			   }
			   
		   }
		   
		   /* ���ѭ���ƺ������
		    *   for(int i=0; i<nums.length; i++) {  
            if(map.containsKey(nums[i])) {  
                int j = map.get(nums[i]);  
                if(i-j<=k) return true;  
            } else {  
                map.put(nums[i], i);  
            }  
        }  
		    */
		   
		return false;   
				   
		   
	    }
	   
	   public static boolean contansNearbyDuplicate(int[] nums,int k)  
	   {  
	       /* 
	        * ʹ��HashSet��ԭ���ǣ���ʵ����Set�ӿڣ�����������ظ���ֵ 
	        * ��Set�����ж����ǲ����ض�˳������ 
	        * ���ԣ���ʹ��ǰ�����ж��Ƿ���� 
	        */  
	       Set<Integer> hs=new HashSet<Integer>();  
	       if (nums.length==0||nums==null)  
	       {  
	           return false;  
	       }  
	       int start=0,end=0;  
	       for (int i = 0; i < nums.length; i++)  
	       {  
	           //���HashSet�в�������Ԫ�أ���ӽ�HashSet  
	           //��������ָ������ƶ�һλ  
	           if (!hs.contains(nums[i]))  
	           {  
	               hs.add(nums[i]);  
	               end++;  
	           }  
	           //�����K����Χ�ڴ�����ͬ��Ԫ�أ�ֱ�ӷ���true  
	           else  
	           {  
	               return true;  
	           }  
	           //�����K����Χ�⻹��������ͬԪ�أ���ǰK��Ԫ��remove,����ָ�������󻬶�  
	           if (end-start>k)  
	           {  
	               hs.remove(nums[start]);  
	               start++;  
	           }  
	       }  
	       return false;  
	   }  
}
	