package jiuzhang.brainTest;

import java.util.HashMap;

/**
 * Created by yangw on 2017/8/27.
 */
public class longestHarmoniousSubsequence {

    public int findLHS(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }

        HashMap<Integer,Integer> maps = new HashMap<>();

        for (int num : nums){
            maps.put(num,maps.getOrDefault(num,0)+1);
        }
        int result = 0;
        for (int key: maps.keySet()){
            if (maps.containsKey(key+1)){
                Math.max(result,maps.get(key)+maps.get(key+1));
            }
        }

        return result;

    }

    public int findLHSA(int[] nums){
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
