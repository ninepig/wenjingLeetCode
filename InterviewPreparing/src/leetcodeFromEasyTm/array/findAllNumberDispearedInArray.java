package leetcodeFromEasyTm.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangw on 2017/9/1.
 */
public class findAllNumberDispearedInArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0 ; i<nums.length; i++){
            //the index value
            int val =  Math.abs(nums[i])-1;
            if(nums[val]>0){
                nums[val] = -nums[val];
            }
        }
        for (int i = 0;i<nums.length;i++){
            if(nums[i]>0){
                result.add(i+1);
            }
        }
        return result;
    }
}
