package wenjing.LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LeetCode219 {
	//这个又是自己做的慢方法，用了hashmap，中间有点小错误没有通过，想了想就通过了
	
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
				   }else{//必须要加else，因为如果他超过K的范围，相当于应该要重置hashmap里面这个value的index，让他有下次判断的机会
					   mHashMap.put(nums[i], i);
				   }
				   
			   }
			   
		   }
		   
		   /* 这个循环似乎更简洁
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
	        * 使用HashSet的原因是，它实现了Set接口，不允许存在重复的值 
	        * 但Set集合中对象是不按特定顺序排序 
	        * 所以，在使用前得先判断是否存在 
	        */  
	       Set<Integer> hs=new HashSet<Integer>();  
	       if (nums.length==0||nums==null)  
	       {  
	           return false;  
	       }  
	       int start=0,end=0;  
	       for (int i = 0; i < nums.length; i++)  
	       {  
	           //如果HashSet中不包含该元素，添加进HashSet  
	           //并将结束指针向后移动一位  
	           if (!hs.contains(nums[i]))  
	           {  
	               hs.add(nums[i]);  
	               end++;  
	           }  
	           //如果在K步范围内存在相同的元素，直接返回true  
	           else  
	           {  
	               return true;  
	           }  
	           //如果在K步范围外还不存在相同元素，则将前K个元素remove,两个指针继续向后滑动  
	           if (end-start>k)  
	           {  
	               hs.remove(nums[start]);  
	               start++;  
	           }  
	       }  
	       return false;  
	   }  
}
	