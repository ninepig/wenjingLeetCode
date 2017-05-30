package jiuzhang.permutationTemplate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yangw on 2017/5/26.
 */
/*
任何求和的题目(特别是递归)，都要想到用 target-xx 来做 这样可以一层一层走下去，简单省事
 */
public class combinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
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
        //结束条件 对于求和 可以用tagert -xx 作为remain 来做结束条件 remain = 0 ，remain<0直接return
    if(remain<0){
        return;
    }else if (remain==0){
        result.add(new ArrayList<>(currentList));
    }else {
        for(int i = pos ; i< candidates.length;i++){
            //这道题是unique member 所以不需要考虑去重的问题
             currentList.add(candidates[i]);
            // 我们可以重复使用同一个数，所以用i
            //n---n+1的情况 2个 trick 1是 用remain ，第二是对于数组 position的变化，因为我们可以重复取当前数组的值，所以 i就是i
             helper(result,currentList,candidates,remain-candidates[i],i);
             currentList.remove(currentList.size()-1);
        }
    }
    }
}
