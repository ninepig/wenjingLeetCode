package wenjing.LeetCode;

/**
 * Created by yamengwenjing on 2016-11-23.
 */
public class LeetCode153 {
    public int findMin(int[] num) {
//        if(num==null||num.length==0){
//            return -1;
//        }
//        int begin = 0;
//        int right = num.length-1;
//
//        int target = num[right];
//        while(begin+1<right){
//            int middle = begin+(right-begin)/2;
//            if(num[middle]<num[right]){
//                right=middle;
//            }else{
//                begin = middle;
//            }
//        }
//        return Math.min(num[begin],num[right]);
        if (num == null || num.length == 0) return Integer.MIN_VALUE;

        int lb = 0, ub = num.length - 1;
        // case1: num[0] < num[num.length - 1]
        // if (num[lb] < num[ub]) return num[lb];

        // case2: num[0] > num[num.length - 1] or num[0] < num[num.length - 1]
        //画出图就知道了，那最右侧的作比较不会吃亏，也就是可以不断逼近最小数;
        while (lb + 1 < ub) {
            int mid = lb + (ub - lb) / 2;
            if (num[mid] < num[ub]) {
                ub = mid;
            } else {
                lb = mid;
            }
        }

        return Math.min(num[lb], num[ub]);

    }
}
