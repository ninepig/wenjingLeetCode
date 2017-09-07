package leetcodeFromEasyTm.hash;

import java.util.HashMap;

/**
 * Created by yangw on 2017/9/5.
 */
public class longestHarmouiousSequence {
    public int findLHS(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        HashMap<Integer,Integer> maps = new HashMap<>();

        for(int num:nums){
            maps.put(num,maps.getOrDefault(num,0)+1);
        }
        int result = 0;
        for(int key : maps.keySet()){
            if(maps.containsKey(key+1)){
                result = Math.max(result,maps.get(key)+maps.get(key+1));
            }
        }
        return result;

    }
}
