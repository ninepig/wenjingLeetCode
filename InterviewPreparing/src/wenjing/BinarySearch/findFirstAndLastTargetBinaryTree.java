package wenjing.BinarySearch;

/**
 * Created by yamengwenjing on 2016-11-22.
 */
public class findFirstAndLastTargetBinaryTree {

    public int binarySearchFirstPostionOfTarget(int[] nums, int target){
        if(nums==null||nums.length==0){
            return -1;
        }
        int beginPos = 0 ;
        int endPos = nums.length-1;
        //确保2个点相邻就结束循环
        //start+1 <end 相邻就要退出循环，start = 1, end = 2
        //while的思想是先将范围不断缩小，最后只剩start和end两个备选值

        while(beginPos+1<endPos){
            int middlePos =  beginPos+(endPos-beginPos)/2;
            if(nums[middlePos] == target){
                //要注意了，如果中间点等于target的话  就把endpos 设为中间点，因为我们要找的是第一个
                endPos = middlePos;
            }else if(nums[middlePos]<target){
                beginPos = middlePos;
            }else{
                endPos = middlePos;
            }
        }
        if(nums[beginPos] == target){
            return beginPos;
        }
        if(nums[endPos] == target){
            return endPos;
        }
        return -1;
    }
    // 思路是一样的 通过while循环 不断逼近，留下最后2个数字，然后和target比较
    public int binarySearchLastPostionOfTarget(int[] nums,int target){
        if(nums == null ||nums.length ==0){
            return -1;
        }
        int beginPos = 0;
        int endPos = nums.length-1;
        while(beginPos+1<endPos) {
            int middlePos = beginPos + (endPos - beginPos) / 2;
            if (nums[middlePos] == target) {
                //要注意了，如果中间点等于target的话  就把begin 设为中间点，因为我们要找的是最后一个
                beginPos = middlePos;
            } else if (nums[middlePos] < target) {
                beginPos = middlePos;
            } else {
                endPos = middlePos;
            }
        }
        if(nums[endPos]==target) {
            return endPos;
        }
        if(nums[beginPos]==target) {
            return beginPos;
        }
        return -1;

    }

}
