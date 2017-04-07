package wenjing.LeetCodeArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by yamengwenjing on 2017-03-01.
 */
public class IntersectionOfTwoArrayII {

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> resultList =new ArrayList<>();
        int nums1Length = nums1.length;
        int nums2Length =nums2.length;
        int l=0,j=0;
        while (true){
            if(l>=nums1Length||j>=nums2Length){
                break;
            }
            if(nums1[l]==nums2[j]){
                resultList.add(nums1[l]);
                l++;
                j++;
            }else if (nums1[l]>nums2[j]){
                j++;
            }else {
                l++;
            }
        }
        int[] result = new int[resultList.size()];
        for(int i = 0;i< result.length;i++){
            result[i] = resultList.get(i);
        }
        return  result;
    }

}
