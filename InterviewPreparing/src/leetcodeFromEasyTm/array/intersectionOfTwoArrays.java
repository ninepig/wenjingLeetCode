package leetcodeFromEasyTm.array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by yangw on 2017/9/5.
 */
public class intersectionOfTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1==null|| nums1.length==0||nums2.length==0||nums2==null){
            return new int[0];
        }

        ArrayList<Integer> result = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        //two pointer
        int i = 0;
        int j = 0;

        while (i<nums1.length && j<nums2.length){
            if (nums1[i]==nums2[j]){
                result.add(nums1[i]);
                i++;
                j++;
            }else if (nums1[i]<nums2[j]){
                i++;
            }else {
                j++;
            }
        }
        int[] resultInt = new int[result.size()];
        for (int k = 0 ; k< result.size();k++){
            resultInt[k] = result.get(k);
        }
        return resultInt;
    }
}
