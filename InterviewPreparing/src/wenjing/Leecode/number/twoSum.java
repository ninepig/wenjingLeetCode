package wenjing.Leecode.number;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by yamengwenjing on 2017-04-09.
 */
public class twoSum {

    public int[] twoSum(int[] nums, int target) {
        if(nums==null||nums.length==0){
            return null;
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        int first=0,second=0;
        int[] result = new int[2];
        for(int i = 0; i<nums.length;i++){
            if(hm.containsKey(target-nums[i])){
                result[0] = i;
                result[1] = hm.get(target-nums[i]);
                break;
            }
           hm.put(nums[i],i);
        }
        return result;
    }

    // 这道题不能用这个方法，因为要维护一个原来的index。很麻烦。搞错了！ sorted 的用比较好
    public int[] twoSum2(int[] nums, int target) {
        if(nums==null||nums.length==0){
            return null;
        }
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length-1;
        int[] result = new int[2];

        while(l<r){
               if((nums[l]+nums[r])==target){
                    result[0] = l;
                   result[1] =r;
                   return result;
               }else if((nums[l]+nums[r])<target){
                   l++;
               }else {
                   r--;
               }
        }
        return result;
    }

}
