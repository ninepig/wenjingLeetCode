package jiuzhang.permutationTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yangw on 2017/5/26.
 *NOT DUPLICATE , EVERY NUMBER CAN USE ONLY ONCE
 */
public class combinationSumII {
    public List<List<Integer>> combinationSumII(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if(candidates.length==0||candidates==null){
            return result;
        }
        List<Integer> currentList = new ArrayList<>();
        Arrays.sort(candidates);
        helper(result,currentList,candidates,target,0);
        return result;
    }

    private void helper(List<List<Integer>> result, List<Integer> currentList, int[] candidates, int remain,int pos) {
        if(remain<0){
            return;
        }else if (remain==0){
            result.add(new ArrayList<>(currentList));
        }else {
            for(int i = pos ; i< candidates.length;i++){
                //deduplicate
                if(i>pos&&candidates[i-1]==candidates[i]){
                    continue;
                }
                currentList.add(candidates[i]);
                // we cannot use same memebr ,so i +1
                helper(result,currentList,candidates,remain-candidates[i],i+1);
                currentList.remove(currentList.size()-1);
            }
        }
    }
}
