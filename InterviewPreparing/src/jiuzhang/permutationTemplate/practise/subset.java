package jiuzhang.permutationTemplate.practise;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangw on 2017/6/10.
 * Given a set of distinct integers, nums, return all possible subsets.

 Note: The solution set must not contain duplicate subsets.

 For example,
 If nums = [1,2,3], a solution is:

 [
 [3],
 [1],
 [2],
 [1,2,3],
 [1,3],
 [2,3],
 [1,2],
 []
 ]
 */
public class subset{
        public List<List<Integer>> subsets(int[] nums) {
                List<List<Integer>> result = new ArrayList<>();
                if(nums.length==0||nums==null) {
                    return result;
                }
                List<Integer> currentList = new ArrayList<>();

                helper(result,currentList,nums,0);


            return result;
        }

        private void helper(List<List<Integer>> result, List<Integer> currentList, int[] nums, int postion) {
                result.add(new ArrayList<>(currentList));
                for(int i = postion;i<nums.length;i++) {
                    currentList.add(nums[i]);
                    helper(result,currentList,nums,i+1);
                    currentList.remove(currentList.size()-1);
                }
        }


}
