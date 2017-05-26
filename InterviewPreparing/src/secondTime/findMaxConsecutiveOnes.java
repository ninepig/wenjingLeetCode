package secondTime;

/**
 * Created by yamengwenjing on 2017-04-24.
 */
public class findMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int maxNumber = 0,consNumber = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=0){
                consNumber++;
                if(consNumber>maxNumber){
                    maxNumber=consNumber;
                 }
            }else {
               consNumber=0;
            }
        }
        return  maxNumber;
    }
}
