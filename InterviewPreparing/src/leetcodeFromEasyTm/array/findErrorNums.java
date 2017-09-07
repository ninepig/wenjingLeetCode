package leetcodeFromEasyTm.array;

/**
 * Created by yangw on 2017/9/5.
 */
public class findErrorNums {
    public int[] findErrorNums(int[] nums) {
        int[] numsShowing = new int[nums.length+1];
        int repeatNumber = 0;
        int missNumber = 0;
        for(int i = 0 ; i <nums.length;i++){
            numsShowing[nums[i]]++;
        }
        for(int i = 1 ; i< numsShowing.length;i++ ){
            if(numsShowing[i]==2){
                repeatNumber = i;
            }if(numsShowing[i]==0){
                missNumber = i;
            }
        }

        return new int[]{repeatNumber,missNumber};
    }
}
