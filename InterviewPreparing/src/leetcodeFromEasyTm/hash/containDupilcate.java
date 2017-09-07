package leetcodeFromEasyTm.hash;

import java.util.HashSet;

/**
 * Created by yangw on 2017/9/4.
 */
public class containDupilcate {
    public boolean containsDuplicate(int[] nums) {
        if(nums==null||nums.length==0){
            return false;
        }
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num: nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
