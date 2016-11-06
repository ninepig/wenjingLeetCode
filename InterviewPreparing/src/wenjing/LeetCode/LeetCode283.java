package wenjing.LeetCode;
/*
 * leetcode 283

移动所有的0 到最后 ，其他的按照顺序不变
不能有额外的数组空间，即复制一个数组，要求o(n)吧

一开始想用一个额外的队列，但是想想 这样要额外的空间，肯定不行。
看了答案有了思路
扫描一次数组，把非0的按照顺序放到数组前端，然后保存一个pos的位置
然后pos之后的所有数都为0

 */
public class LeetCode283 {
    public void moveZeroes(int[] nums) {
        if(nums==null){
            return;
        }
        int pos = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[pos] = nums[i];
                pos++;
            }
        }
        for(int i = pos;i<nums.length;i++){
            nums[pos] = 0;
            pos++;
        }
    }
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void moveZeroes(int[] nums) {
        if(nums==null){
            return;
        }
        int pos = 0;
        int zeroNum = 0;
        for(int i = 0 ; i <= nums.length-1;i++){
        	if(nums[i] != 0){
        		nums[pos] = nums[i];
        		pos++;
        	}else{
        		zeroNum++;
        	}
        }
        for(int j = pos+1;j<=nums.length-1;j++){
        	nums[j] = 0;
        }
        
    }
    
    
}
