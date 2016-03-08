package wenjing.LeetCode;
/*
 * LeetCode 198 抢劫
这个题目 我一开始的反应是数组排序，但是想想，要维护一个index的变量，会很复杂。
看了tag，其实这种题目就应该用DP,  因为是序列求和，可以分解为子问题。 做题太少，没有经验。
状态方程也很好写 ，维护一个前几个房子的总金额的数组
N= 0 result = 0
N = 1  result = num[0]
N = 2 result = max（num[0],numer[1]）
N >= 2 result = max(result[i-2]+number[i],result[i-1])
是否抢劫这一家 取决于，这家和前前家的财产之和有没有 前一家的大就可以了

 */
public class LeetCode198 {
	  public int rob(int[] nums) {
			int length = nums.length;
	       	if(nums==null|| length<1){
		      		return 0;
		      	}
	      	int[] resultArray = new int[length];
	      	if(length == 1){
	      		return nums[0];
	      	}
	      	if(length == 2){
	      		return Math.max(nums[0], nums[1]);
	      	}
	      	resultArray[0] = nums[0];
	      	resultArray[1] = Math.max(nums[0], nums[1]);
	      	//注意数组上届啊！！
	        for(int i = 2 ;i<nums.length;i++){
	        	resultArray[i] = Math.max(resultArray[i-2]+nums[i],resultArray[i-1] );
	        }
	        return resultArray[length-1];
	    }
}
