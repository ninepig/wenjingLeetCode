package wenjing.LeetCodeArray;

import java.util.*;

/**
 * Created by yamengwenjing on 2017-04-17.
 */
public class findPairs {
    public int findPairs(int[] nums, int k) {
//        if (nums == null || nums.length == 0 || k < 0)   return 0;
//
//        Map<Integer, Integer> map = new HashMap<>();
//        int count = 0;
//        for (int i : nums) {
//            map.put(i, map.getOrDefault(i, 0) + 1);
//        }
//
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (k == 0) {
//                //count how many elements in the array that appear more than twice.
//                if (entry.getValue() >= 2) {
//                    count++;
//                }
//            } else {
//                if (map.containsKey(entry.getKey() + k)) {
//                    count++;
//                }
//            }
//        }
//
//        return count;
        int result = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }

        //新的语法 学到了 map里面有个enrtyset
        //这个方法真的太牛逼了 ， 如果K是0 那我们找重复出现过的数字个数即可，如果K不等于0，我们找到key和key+K 相等的key的数量，因为index只有一个
        //所以不用担心去重
        for (Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(k==0){
                if(entry.getValue()>=2){
                    result++;
                }
            }else {
                if(hm.containsKey(entry.getKey()+k)){
                    result++;
                }
            }
        }

        return result;
    }
    //2个hashset， 一个保存出现的数字 一个保存index（用string来保存）也是不错的方法
    public int findPairs2(int[] nums, int k) {
        Arrays.sort(nums);
        Set<Integer> seenNum = new HashSet<>();
        Set<String> seenPair = new HashSet<>();
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            int prev = nums[i] - k;
            if (seenNum.contains(prev) && !seenPair.contains(prev + "," + nums[i])) {
                result++;
                seenPair.add(prev + "," + nums[i]);
            }
            seenNum.add(nums[i]);
        }
        return result;
    }
}
