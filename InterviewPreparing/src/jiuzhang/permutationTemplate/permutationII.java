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
    才把第二个1加入permutation之中，

    Use an extra boolean array " boolean[] used" to indicate whether the value is added to list.

Sort the array "int[] nums" to make sure we can skip the same value.

when a number has the same value with its previous, we can use this number only if his previous is used
     */
    private void permuteHelper(List<List<Integer>> result, boolean[] used, List<Integer> currentList, int[] nums) {
        if(currentList.size()==nums.length){
            result.add(new ArrayList<>(currentList));
        }else {
            for (int i = 0 ; i<nums.length;i++){
                //限定你当前要加入list的条件 和 i的关系，如果你i used过了 肯定不行，如果你前一位没有used，同时你和前一位一样，才可以加入list
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
