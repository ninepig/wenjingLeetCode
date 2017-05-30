package jiuzhang.permutationTemplate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangw on 2017/5/28.
 * 最早的思路还是错了，没有彻底理解combination，用数组就不是combination了，必须不用数组，要用数组的话，用完一个数必须删掉一个数才可以
 * 所以用数的方法去传，因为数会++，所以不会出现重复的情况，对于递归到N+1的情况 他只能是 start+1作为起始数
 */
public class combinations {
    /*
    wrong version , 用数组的话 就变成了permutation了！因为在for循环中的递归 传入的是nums， postion+1 这样会出现[2,2][3,2][3,3][4,2],[4,3]的情况
     第二个值的选取会从nums[postion+1]开始 不能用数组！
     */
    public List<List<Integer>> combineWrong(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if(n<=0||k<=0){
            return result;
        }
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = i+1;
        }
        List<Integer> currentList = new ArrayList<>();
        helper2(result,currentList,nums,0,k);

        return result;
    }

    private void helper2(List<List<Integer>> result, List<Integer> currentList, int[] nums, int postion, int k) {
        if(currentList.size()==k){
            result.add(new ArrayList<>(currentList));
        }else {
            for(int i = postion ;i < nums.length ; i++){
                currentList.add(nums[i]);
                // 这里出错了！ 因为combination，所以用完了要更改这个数组，而不是直接拿这个数组传过去
                //helper2(result,currentList,nums,postion+1,k);
                //right version ,对于2而言，他要取的数是3开始的，所以 要用i+1作为postion 改变的参数传入递归之中
                helper2(result,currentList,nums,i+1,k);
                currentList.remove(currentList.size()-1);
            }
        }
    }
        public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if(n<=0||k<=0){
            return result;
        }

        List<Integer> currentList = new ArrayList<>();
        helper(result,currentList,1,n,k);

        return result;
    }

    private void helper(List<List<Integer>> result, List<Integer> currentList, int start, int end, int k) {
        //结束条件 是 size 为K 时
        if(currentList.size()==k){
            result.add(new ArrayList<>(currentList));
        }else {
            for(int i = start ;i <= end ; i++){
                currentList.add(i);
                //n---n+1 的影响 是组合 一个i只能用一次，所以start必须增加，而且不能用数组，如果用数组的话 一般情况下是postion+1,是无法满足的，必须用成i+1
                helper(result,currentList,i+1,end,k);
                currentList.remove(currentList.size()-1);
            }
        }
    }


}
