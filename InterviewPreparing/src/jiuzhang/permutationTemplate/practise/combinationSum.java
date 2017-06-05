package jiuzhang.permutationTemplate.practise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yangw on 2017/6/5.
 * Given a set of candidate numbers (C) (without duplicates) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

 The same repeated number may be chosen from C unlimited number of times.

 Note:
 All numbers (including target) will be positive integers.
 The solution set must not contain duplicate combinations.
 For example, given candidate set [2, 3, 6, 7] and target 7,
 A solution set is:
 [
 [7],
 [2, 2, 3]
 ]
 */
public class combinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if(candidates==null||candidates.length==0){
            return result;
        }
        List<Integer> currentList = new ArrayList<>();
        //need be sort
        Arrays.sort(candidates);
        combinationSumHelper(candidates,currentList,target,0,result);
        return result;
    }

    private void combinationSumHelper(int[] candidates, List<Integer> currentList, int target, int postion,List<List<Integer>> result) {
        if(target==0){
            result.add(new ArrayList<>(currentList));
        }else if(target<0){
            return;
        }else {
            for(int i = postion;i<candidates.length;i++){
                currentList.add(candidates[i]);
                // again! using i!! not 0
//                combinationSumHelper(candidates,currentList,target-candidates[i],0,result);
                combinationSumHelper(candidates,currentList,target-candidates[i],i,result);
                currentList.remove(currentList.size()-1);
            }
        }

    }
}
