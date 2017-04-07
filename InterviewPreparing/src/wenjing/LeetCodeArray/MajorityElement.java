package wenjing.LeetCodeArray;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by yamengwenjing on 2017-02-28.
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        if(nums == null||nums.length==0){
            return 0;
        }
        //如果要用数组保存某数出现的位置，必须知道数的范围，字母可以用这个方法，数字不太行
//        int[] result = new int[nums.length];
//        int biggest = 0;
//        int majorityPostion = 0
//        //get nums showing times array
//        for(int i= 0 ; i<nums.length;i++){
//            result[nums[i]]++;
//        }
//
//        for(int i = 0 ; i<result.length;i++){
//            if(biggest<result[i]){
//                biggest = result[i];
//                majorityPostion = i;
//            }


        //不能用边跑边测的方法,对于数量较小时 跑不通
        /*
        if(map.get(nums[i])+1>(nums.length/2)){
            return nums[i];
        }
        */
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else {
                map.put(nums[i],1);
            }
        }
        int biggestNumber = 0;
        int biggestKey = 0;
        for(int i = 0 ;i <nums.length;i++){
            if(biggestNumber<map.get(nums[i])){
                biggestNumber = map.get(nums[i]);
                biggestKey = nums[i];
            }
        }


        return biggestKey;
    }
    public int majorityElementIntellij(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

}
