package wenjing.LeetCodeArray;

import java.util.HashSet;

/**
 * Created by yamengwenjing on 2017-03-01.
 */
public class ContainsDuplicate{
        public boolean containsDuplicate(int[] nums) {

            if(nums.length<1){
                return false;
            }
            HashSet<Integer> set = new HashSet<>();
            for(int i = 0; i< nums.length;i++){
                if(!set.add(nums[i])){
                    return true;
                }
            }
            return false;

        }
}
