package jiuzhang.permutationTemplate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yangw on 2017/5/25.
 */
public class permutationII {

    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        if(nums.length==0||nums==null){
            return result;
        }
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        List<Integer> currentList = new ArrayList<>();
        permuteHelper(result,used,currentList,nums);


        return result;
    }
    /*
    用一个辅助数组来帮助完成，如果这个数已经使用过了，则直接continue ，或者这个有1 1 1 这种情况，我们只考虑前一个1已经被使用过了的情况下，
    才把第二个1加入permutation之中，也就是第一次循环走到第三个1的时候，直接continue，因为第二个1还没有被使用过
     */
    private void permuteHelper(List<List<Integer>> result, boolean[] used, List<Integer> currentList, int[] nums) {
        if(currentList.size()==nums.length){
            result.add(new ArrayList<>(currentList));
        }else {
            for (int i = 0 ; i<nums.length;i++){
                if(used[i]){
                    continue;
                }
                if(i>0&&nums[i]==nums[i-1]&&(!used[i-1])){
                    continue;
                }
                used[i] = true;
                currentList.add(nums[i]);
                permuteHelper(result,used,currentList,nums);
                used[i]=false;
                currentList.remove(currentList.size()-1);
            }

        }


    }

}
