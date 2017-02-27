package wenjing.BinarySearch;

/**
 * Created by yamengwenjing on 2016-11-23.
 * 人生第一道hard 题目. 用的大神方法
 * http://blog.csdn.net/linhuanmars/article/details/20525681
 * 一看就懂，但是模板使用的是9章的
 */
public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        if(nums==null|| nums.length==0){
            return -1;
        }
        int begin = 0;
        int end = nums.length-1;


        while(begin+1<end) {
            int middle = begin + (end - begin) / 2;

            //分两种情况， 如果millde 大于end ，那就说明我们在m-e 是排序的
            if (nums[middle] < nums[end]) {
                    //看target 在哪一段之中
                if (target >= nums[middle] && target <= nums[end]) {
                    begin = middle;
                } else {
                    end = middle;
                }
            }//如果m小于end，则说明 b-m 是排序的
            else {
                if (target <= nums[middle] && target >= nums[begin]) {
                    end = middle;
                } else {
                    begin = middle;
                }
            }


        }
        if(nums[begin]==target){
            return begin;
        }
        if(nums[end]==target){
            return  end;
        }

        return -1;

    }

}
