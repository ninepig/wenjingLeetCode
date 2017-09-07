package leetcodeFromEasyTm.array;

/**
 * Created by yangw on 2017/9/6.
 */
public class removeElment {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0 || nums == null){
            return 0;
        }
        int result = 0 ;
        int j=0;
        for(int i = 0 ; i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }

}
