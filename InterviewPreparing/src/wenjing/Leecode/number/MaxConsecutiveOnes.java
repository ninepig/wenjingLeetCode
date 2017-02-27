package wenjing.Leecode.number;

/**
 * Created by yamengwenjing on 2017-02-19.
 */
/*
Given a binary array, find the maximum number of consecutive 1s in this array.

这个题比较简单，核心在于取出连续出现1的最大值，也就是可能有好个连续段，维护一个counter 就可以了
一开始没有考虑到只有一个1的情况，写错了。放在 nums[i]==1的判断条件之中就work了
 */

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }

        int resultCounter = 0;
        int resultMaxCounter =0;
        for(int i = 0;i<nums.length;i++){
           if(nums[i]==1){
               resultCounter++;
               if(resultMaxCounter<resultCounter){
                   resultMaxCounter=resultCounter;
               }
           }else{
               //错误的写法
//               if(resultMaxCounter<resultCounter){
//                   resultMaxCounter=resultCounter;
//               }
               resultCounter=0;
           }
        }

        return resultMaxCounter;
    }

}
