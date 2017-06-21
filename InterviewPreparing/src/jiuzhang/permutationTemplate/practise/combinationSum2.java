package jiuzhang.permutationTemplate.practise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yangw on 2017/6/5.
 * Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

 Each number in C may only be used once in the combination.

 Note:
 All numbers (including target) will be positive integers.
 The solution set must not contain duplicate combinations.
 For example, given candidate set [10, 1, 2, 7, 6, 1, 5] and target 8,
 A solution set is:
 [
 [1, 7],
 [1, 2, 5],
 [2, 6],
 [1, 1, 6]
 ]
 */
public class combinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<List<Integer>> result = new ArrayList<>();
            if(candidates==null||candidates.length==0){
                return result;
            }
            List<Integer> currentlist = new ArrayList<>();
            Arrays.sort(candidates);
            combinationSum2helper(result,currentlist,candidates,target,0);

            return  result;

    }

    private void combinationSum2helper(List<List<Integer>> result, List<Integer> currentList, int[] candidates, int target, int postion) {
        if(target<0){
            return;
        }else if (target==0){
            result.add(new ArrayList<>(currentList));
        }else {
            for(int i = postion;i<candidates.length;i++){
                if(i>postion&&candidates[i]==candidates[i-1]){
                    continue;
                }
                currentList.add(candidates[i]);
                combinationSum2helper(result,currentList,candidates,target-candidates[i],i+1);
                currentList.remove(currentList.size()-1);
                }
        }
    }
}
