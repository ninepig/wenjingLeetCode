package jiuzhang.permutationTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangw on 2017/8/16.
 */
public class combination4 {
    //这个方法应该是正确的。但是leetcode上面超时了！
    public int combinationSum4(int[] nums, int target) {
        if(nums==null||nums.length==0){
            return 0;
        }
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        combinationHelper(result,current,nums,0,target);

        return result.size() ;
    }

    private void combinationHelper(List<List<Integer>> result, List<Integer> current, int[] nums, int start, int remain) {
        if(remain<0){
            return;
        }
        else if (remain==0){
            result.add(new ArrayList<>(current));
            return;
        }else {
            for (int i = start ; i<nums.length;i++){
                current.add(nums[i]);
                //因为可能出现[1,1,2][2,1,1] 这样的情况，所以有点像permutation，所以每次都需要从0开始
                combinationHelper(result,current,nums,0,remain-nums[i]);
                current.remove(current.size()-1);
            }

        }

    }
    //一样超时
    public int combinationSum4NotExceed(int[] nums, int target) {
        if (target == 0) {
            return 1;
        }
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target >= nums[i]) {
                res += combinationSum4NotExceed(nums, target - nums[i]);
            }
        }
        return res;
    }
}
