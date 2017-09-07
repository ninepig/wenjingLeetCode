package leetcodeFromEasyTm.array;

/**
 * Created by yangw on 2017/9/1.
 */
public class MaxConsecutivesOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int longestResult = Integer.MIN_VALUE;
        int currentOnes = 0;

        for(int i = 0 ; i < nums.length; i++){
            if(nums[i]==1){
                currentOnes++;
            }else {
                longestResult = Math.max(longestResult,currentOnes);
                currentOnes=0;
            }
        }

        return Math.max(longestResult,currentOnes);



    }
}
