package jiuzhang.binarysearch;

/**
 * Created by yangw on 2017/6/14.
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

 You may assume no duplicates in the array.

 Here are few examples.
 [1,3,5,6], 5 → 2
 [1,3,5,6], 2 → 1
 [1,3,5,6], 7 → 4
 [1,3,5,6], 0 → 0
 */
/*
sorted, and no dupilciates
find first number int the nums which bigger equal than target
没想明白就开始做的典范，1 ，3 ，5，6  如果是5的话 要插在第3个。所以是return mid就可以了。 因为只要大于等于target，就返回原来的位置就行了
 */
public class searchInsertPostion {

    public int searchInsert(int[] nums, int target) {
            if(nums==null||nums.length==0){
                return -1;
            }
            if(nums[0] == target){
                return 0;
            }
            int start = 0;
            int end = nums.length-1;
            int mid;
            while (start+1<end){
                mid = start+(end-start)/2;
                if(nums[mid]==target){
                    return mid;
                }else if(nums[mid]>target){
                    end = mid;
                }else {
                    start=mid;
                }
            }
            if(nums[start]>=target){
                return start;
            }else if(nums[end]>=target){
                return end;
            }else {
                return end+1;
            }
    }

}
