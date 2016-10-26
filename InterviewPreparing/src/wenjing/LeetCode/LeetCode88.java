package wenjing.LeetCode;
/*
 * 从后往前扫的方法，值得学习！
 */
public class LeetCode88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	if(nums1 == null ||nums2 == null){
    		return ;
    	}
    	
    	int indexOne = m-1;
    	int indexTwo = n-1;
    	int indexMerge = m+n-1;
    	
    	while(indexOne>=0&&indexTwo>=0){
    		
    		if(nums1[indexOne]>=nums2[indexTwo]){
    			
    			nums1[indexMerge] = nums1[indexOne];
    			indexMerge--;
    			indexOne--;
    		}else{
    			
    			nums1[indexMerge] = nums2[indexTwo];
    			indexMerge--;
    			indexTwo--;
    			
    		}
    	
    	}
    	while(indexTwo>=0){
    		nums1[indexMerge] = nums2[indexTwo];
    		indexMerge--;
			indexTwo--;
    	}
    	
    	
    	
    	
    }
}
