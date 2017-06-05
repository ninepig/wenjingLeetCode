package jiuzhang.permutationTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangw on 2017/5/25.
 * 九章模板 搜索算法，
 * 任何递归问题都有一个结束条件，这个题目里面的结束条件就是 currentList size 和 num的size是一样的情况下，把他加到result list里面
 * 剩下的就是循环里面，如果有这个数，则不加入到list 里，没有则加入.
 * 同样是递归树，这次需要把全部的数都加入到list里面的形式
 */
public class permutation {
    public List<List<Integer>> permute(int[] nums) {
        if(nums == null|| nums.length==0){
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();

        permuteHelper(result,tempList,nums);

        return result;

    }

    private void permuteHelper(List<List<Integer>> result, List<Integer> tempList, int[] nums) {
        if(tempList.size()==nums.length){
            result.add(new ArrayList<>(tempList));
        }else {
            for(int i = 0 ;i<nums.length;i++){
                //考虑当前i 怎么样才能加入 currentlist，如果存在就不可以了，也就是只能用一次，因为全排列
                if(tempList.contains(nums[i])){
                    continue;
                }
                tempList.add(nums[i]);
                permuteHelper(result,tempList,nums);
                tempList.remove(tempList.size()-1);
            }

        }


    }
}
