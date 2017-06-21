package jiuzhang.binarysearch;

/**
 * Created by yangw on 2017/6/15.
 * Total Accepted: 111240
 Total Submissions: 301240
 Difficulty: Medium
 Contributor: LeetCode
 A peak element is an element that is greater than its neighbors.

 Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.

 The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

 You may imagine that num[-1] = num[n] = -∞.

 For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.
 */
public class findPeakElement {
    //九章的方法不一定对，九章的那个方法没考虑到更多的边界条件
    // 自己的方法不一定错！ 自己想明白了就行
    //这个模板的核心精髓是在于 找到2个邻近的点
    public int findPeakElement(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return -1;
        }
        if(nums.length==1){
            return 0;
        }
        int start = 0, end = nums.length - 1;

        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            //如果mid，比mid+1小，说明在山峰的左侧
            if (nums[mid] < nums[mid + 1]) {
                start = mid;
                //反之在山峰的右侧
            } else  {
                end = mid;
            }

        }
        //找到山峰最中邻近的2点，作比较
        if (nums[start] < nums[end]) {
            return end;
        } else {
            return start;
        }

    }

}
