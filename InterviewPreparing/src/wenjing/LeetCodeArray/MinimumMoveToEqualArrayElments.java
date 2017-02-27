package wenjing.LeetCodeArray;

import java.util.Arrays;

/**
 * Created by yamengwenjing on 2017-02-25.
 */

/*
Given a non-empty integer array of size n, find the minimum number of moves required to make all array elements equal, where a move is incrementing n - 1 elements by 1.
 */


public class MinimumMoveToEqualArrayElments {
        /*
        暴力法，每次检查最大最小的值，直到最大最小值相同，不同，则把除了最大的全部+1，
        这个方法实际上就是交给程序去做，直到全部做出来为止
         */
        public int minMoveBruteFroce(int[] nums){
            int min =0, max=nums.length-1 ,count = 0;
            while(true){
                for(int i=0;i<nums.length;i++){
                    if(nums[max]<nums[i]){
                        max = i;
                    }
                    if(nums[min]>nums[i]){
                        min = i;
                    }
                }
                if(nums[max]==nums[min]){
                    break;
                }
                for(int i = 0; i< nums.length;i++){
                    if(i!=max){
                        nums[i]++;
                    }
                }
                count++;
            }
            return count;
        }
        /*
        每次增加的值是最大值到最小值的diff， 这样可以加快完成的速度
         */
        public int minMoveBruteFroceII(int[] nums){
            int min = 0 , max = nums.length-1, count=0;
            while (true){
                for(int i = 0;i<nums.length;i++){
                    if(nums[max]<nums[i]){
                        max=i;
                    }
                    if(nums[min]>nums[i]){
                        min=i;
                    }
                }
                int diff = nums[max]-nums[min];
                if(diff==0){
                    break;
                }
                count+=diff;
                for(int i = 0 ; i< nums.length;i++){
                    if(i!=max){
                        nums[i]+=diff;
                    }
                }
            }
            return  count;
        }

        /*
        用sort的方法，把数组sort 以后 a[0] 是最小的 a[n-1]是最大的，他们的差别是diff = a[n-1] - a[0] , 把所有的数除了a[n-1] 加上diff ，这样 a[0] = a[n-1] 是最小的
        然后a[n-2]是最大的，然后加上diff， 这样a[0] a[n-1]a [n-2] 大小一样，最大的就是 a[n-3] 以此类推。
         */
        public int minMoveSortingArray(int[] nums){
            Arrays.sort(nums);
            int count = 0;
            for(int i = nums.length-1;i>0;i--){
                count+= nums[i]-nums[0];
            }
            return count;
        }
        /*
        dp 的方法 ,只考虑当前点到下一个点的diff， 变成下一个点要进行几步，如3，10,13 第一步只考虑3,10 两点，第一步diff是7，所以最少要走7步，对于第二点他是10，不变，但对于低三个点，
        要加上7的距离，以此类推，一步一步进行下去就可以了，因为是sort过的 其实和上面那个方法差不多。
         */
        public int minMovesdp(int[] nums) {
            Arrays.sort(nums);
            int moves = 0;
            for (int i = 1; i < nums.length; i++) {
                int diff = (moves + nums[i]) - nums[i - 1];
                nums[i] += moves;
                moves += diff;
            }
            return moves;
        }

        /*
        用数学方法，把所有的数加1到最大的数相当于把单个最大的数减1，这样操作就少了，一次只需要操作一个数。循环找出最小的数，然后moves相当于每个数到最小数所需要的步骤
         */
        public int minMovesMath(int[] nums) {
            int moves = 0, min = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length; i++) {
                moves += nums[i];
                min = Math.min(min, nums[i]);
            }
            return moves - min * nums.length;
        }
}
