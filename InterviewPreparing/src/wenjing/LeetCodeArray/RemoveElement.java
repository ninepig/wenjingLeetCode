package wenjing.LeetCodeArray;

/**
 * Created by yamengwenjing on 2016-11-15.
 理念是快慢指针的理念，自己得想法不对。就用这种就好了。，把不是val的值放在开头就可以了。对与这个count作为一个指针
 之前用的快慢指针的终结条件必须是I<J 要不然不移动指针
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int countNumber = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=val){
               nums[countNumber]=nums[i];
                countNumber++;
            }
        }
    return countNumber;
    }
}
