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
