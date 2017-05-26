package secondTime;

/**
 * Created by yamengwenjing on 2017-04-26.
 */
public class movezeros {
    public void moveZeroes(int[] nums) {
            if(nums==null||nums.length==0){
                return;
            }
            int notZeroIndex=0;
            for(int i = 0;i<nums.length;i++){
                if(nums[i]!=0){
                    nums[notZeroIndex]=nums[i];
                    notZeroIndex++;
                }
            }
            for(;notZeroIndex<nums.length;notZeroIndex++){
                nums[notZeroIndex]=0;
            }

    }

}
