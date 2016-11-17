package wenjing.LeetCodeArray;

/**
 * Created by yamengwenjing on 2016-11-16.
 */
public class removeDupElmentFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int newLength = 1;
        //最好不要用 num[i] == num[i+1] 这种形式的code，这样会让循环的长度比较麻烦，利用一个临时变量就可以解决问题，大体的思路还是没有错的。
        //做题要多考虑几种边界条件，把问题都想清楚点
        int duplicateNumber = nums[0];

        for(int i = 1 ;i<nums.length;i++){
            if(nums[i]!=duplicateNumber){
                nums[newLength]=nums[i];
                newLength++;
                duplicateNumber = nums[i];
            }

        }
        return newLength;
    }
}
