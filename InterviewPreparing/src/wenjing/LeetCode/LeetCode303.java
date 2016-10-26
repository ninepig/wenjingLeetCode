package wenjing.LeetCode;

/*
 * LeetCode 303 range Sum query
一开始觉得暴力法就行了。。但是看到别人的答案。。才知道自己有多天真。
维护一个sum数组把结果保存下来，然后 i j 就相当于sumrage  sum［j］ － sum［i － 1］ 的就是答案了 如果i = 0 sum［j］

 */
public class LeetCode303 {
	int[] sums;
	
    public NumArray(int[] nums) {
    	//我修改了这里  让直接retrun，就通过了，如果新建数组，不通过。奇怪。。
        if(nums == null || nums.length==0 ){
        
           return;
        }
    	int length = nums.length;
    	sums = new int[length];
    	sums[0] = nums[0];
    	for(int i = 1; i<length;i++){
    		sums[i] = sums[i-1]+nums[i];
    	}
        
    }

    
    public int sumRange(int i, int j) {
        
    	return i==0 ? sums[j] : sums[j]-sums[i-1]; 
    	
    	
    }
	
	
}
