package leetcodeFromEasyTm.array;

/**
 * Created by yangw on 2017/9/2.
 */
public class moveZeros {
    public void moveZeroes(int[] nums) {
        if(nums==null||nums.length==0){
            return;
        }
        int noZeroIndex = 0 ;
        for(int i = 0 ; i < nums.length;i++){
            if(nums[i]!=0){
                nums[noZeroIndex] = nums[i];
                noZeroIndex++;
            }
        }
        for(int i = noZeroIndex; i< nums.length;i++){
            nums[i] = 0 ;
        }

    }

}
