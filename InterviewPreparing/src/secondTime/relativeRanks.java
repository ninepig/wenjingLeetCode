package secondTime;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by yamengwenjing on 2017-04-26.
 */
public class relativeRanks {
    public String[] findRelativeRanks(int[] nums) {
        if(nums==null||nums.length==0){
            return new String[0];
        }
        HashMap<Integer,Integer> scoreIndexMap = new HashMap<>();
        String[] result = new String[nums.length];
        for(int i = 0;i<nums.length;i++){
            scoreIndexMap.put(nums[i],i);
        }
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            int orginalIndex = scoreIndexMap.get(nums[i]);
            int rank = nums.length-i;
            if(rank==1){
                result[orginalIndex]="Gold Medal";
            }else if(rank==2){
                result[orginalIndex] ="Silver Medal";
            }else if(rank==3){
                result[orginalIndex]="Bronze Medal";
            }else {
                result[orginalIndex] = rank+"";
            }
        }
        return  result;

    }
}
