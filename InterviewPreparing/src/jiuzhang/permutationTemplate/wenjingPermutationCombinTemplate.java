package jiuzhang.permutationTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangw on 2017/5/30.
 */
public class wenjingPermutationCombinTemplate {

    /**
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> template(int[] nums){

        List<List<Integer>> result = new ArrayList<>();
        //judeg edge situation
        List<Integer> currentList = new ArrayList<>();

        // most time is a postion
        int auxHelper = 0;

        helper(result,currentList,auxHelper,nums);

        return result;
    }



    /**
     * 递归解决排列组合的辅助方法
     *
     * @param result
     * @param currentList
     * @param auxHelper
     * @param nums
     */
    private void helper(List<List<Integer>> result, List<Integer> currentList, int auxHelper, int[] nums) {
        //ending postion 一般这种问题的结束条件  何时把这个currentList 加入 result 之中
        //if(//)
        //else
        //循环把nums 中每一个数都考虑到，然后把这一层的结果 加入currentList之中，再递归的进去N+1的情况，
        //如果有去重，不能重复出现的问题要在这里考虑，然后是不是要移动nums的postion 要在递归之中体现
        //最后要把当前层的结果remove掉，方便for循环下一次的work

    }

}
