package jiuzhang.permutationTemplate.practise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yangw on 2017/6/10.
 */
public class subsetII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            if(nums==null||nums.length==0){
                return result;
            }
            List<Integer> currentList = new ArrayList<>();
            Arrays.sort(nums);
            helper(result,currentList,nums,0);
            return result;
    }

    private void helper(List<List<Integer>> result, List<Integer> currentList, int[] nums, int postion) {
        result.add(new ArrayList<>(currentList));
        for(int i = postion;i<nums.length;i++){
            if(i>postion&&nums[i-1]==nums[i]){
                continue;
            }
            currentList.add(nums[i]);
            helper(result,currentList,nums,i+1);
            currentList.remove(currentList.size()-1);
        }
    }
}
