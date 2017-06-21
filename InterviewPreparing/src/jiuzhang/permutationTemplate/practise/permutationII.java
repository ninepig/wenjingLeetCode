package jiuzhang.permutationTemplate.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yangw on 2017/6/9.
 * Given a collection of numbers that might contain duplicates, return all possible unique permutations.

 For example,
 [1,1,2] have the following unique permutations:
 [
 [1,1,2],
 [1,2,1],
 [2,1,1]
 ]
 */
public class permutationII {
    public List<List<Integer>> permutationII(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if(nums.length==0||nums == null){
            return result;
        }
        List<Integer> currentlist = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] helper = new boolean[nums.length];
        permutationIIhelper(result,currentlist,nums,helper);
        return result;

    }

    private void permutationIIhelper(List<List<Integer>> result, List<Integer> currentlist, int[] nums, boolean[] helper) {
        if(currentlist.size()==nums.length){
            result.add(new ArrayList<>(currentlist));
        }else {
            for(int i = 0 ; i < nums.length;i++){
                if(helper[i]){
                    continue;
                }
                if(i>0&&nums[i-1]==nums[i]&&(!helper[i-1])){
                    continue;
                }
                helper[i]=true;
                currentlist.add(nums[i]);
                permutationIIhelper(result,currentlist,nums,helper);
                currentlist.remove(currentlist.size()-1);
                helper[i]=false;
            }
        }
    }
}
