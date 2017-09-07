package leetcodeFromEasyTm.hash;

import java.util.HashSet;

/**
 * Created by yangw on 2017/9/2.
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> first = new HashSet();
        HashSet<Integer> intersection = new HashSet();

        for (int num: nums1){
            if(!first.contains(num)){
                first.add(num);
            }
        }
        for (int num: nums2){
            if(first.contains(num)){
                if (!intersection.contains(num)){
                    intersection.add(num);
                }
            }
        }

        int[] res = new int[intersection.size()];
        int i = 0;
        for (int number : intersection){
          res[i++] = number;
      }

        return res;
    }
}
