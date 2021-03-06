package wenjing.LeetCodeArray;

/**
 * Created by yamengwenjing on 2017-04-10.
 */
public class mergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int mergeIndex = m+n-1;
        int nums1Index = m-1;
        int nums2Index = n-1;

        while(nums1Index>=0&&nums2Index>=0){
            if(nums1[nums1Index]>=nums2[nums2Index]){
                nums1[mergeIndex] = nums1[nums1Index];
                nums1Index--;
                mergeIndex--;
            }else {
                nums1[mergeIndex] = nums2[nums2Index];
                mergeIndex--;
                nums2Index--;
            }
        }
        while (nums2Index>=0){
            nums1[mergeIndex] = nums2[nums2Index];
            mergeIndex--;
            nums2Index--;

        }


    }

}
