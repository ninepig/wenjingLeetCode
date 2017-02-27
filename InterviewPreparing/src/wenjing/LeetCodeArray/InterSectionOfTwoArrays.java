package wenjing.LeetCodeArray;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by yamengwenjing on 2017-02-26.
 */

/*
用hashset的方法来做！nums2 中可能出现repeat的数字，所以要考虑，先要把num2重复的排除一次
 */
public class InterSectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set =  new HashSet<>();
        ArrayList<Integer> resultArray = new ArrayList<>();

        for(int i = 0 ; i< nums1.length;i++){

            if(set.contains(nums1[i])){
                continue;
            }else {
                set.add(nums1[i]);
            }
        }

        for(int i = 0; i<nums2.length;i++){
          if(set.contains(nums2[i])){
              if(!resultArray.contains(nums2[i])){
                  resultArray.add(nums2[i]);
              }else {
                  continue;
              }
          }
        }

        int[] result = new int[resultArray.size()];

        for(int i = 0 ; i<result.length;i++){
            result[i] = resultArray.get(i);
        }

        return  result;

    }

}
