package wenjing.LeetCodeArray;

import java.util.HashMap;

/**
 * Created by yamengwenjing on 2017-04-10.
 */
public class containsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
            if(nums==null||nums.length==0){
                return false;
            }

        HashMap<Integer,Integer> postionHM = new HashMap<>();

        for(int i = 0 ;i<nums.length;i++){
            if(postionHM.containsValue(nums[i])){

                if(Math.abs(postionHM.get(nums[i])-i)<=k){
                    return true;
                }else {
                    //if the distance bigger than k,replace the old one.
                    postionHM.put(nums[i],i);
                }

            }else {
                postionHM.put(nums[i],i);
            }
        }

        return false;

    }


}
