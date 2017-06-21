package jiuzhang.permutationTemplate.practise;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangw on 2017/6/5.
 * Given a collection of distinct numbers, return all possible permutations.

 For example,
 [1,2,3] have the following permutations:
 [
 [1,2,3],
 [1,3,2],
 [2,1,3],
 [2,3,1],
 [3,1,2],
 [3,2,1]
 ]
 */
public class permutation1 {
    public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            if(nums==null||nums.length==0){
                return result;
            }
            List<Integer> currentResult = new ArrayList<>();
            permuteHelper(result,currentResult,nums);
            return  result;

    }

    private void permuteHelper(List<List<Integer>> result, List<Integer> currentList, int[] nums) {
        if(currentList.size()==nums.length){
            result.add(new ArrayList<>(currentList));
        }else {
            for (int i = 0 ; i<nums.length;i++){
                if(currentList.contains(nums[i])){
                    continue;
                }
                currentList.add(nums[i]);
                permuteHelper(result,currentList,nums);
                currentList.remove(currentList.size()-1);
            }
        }


    }

}
