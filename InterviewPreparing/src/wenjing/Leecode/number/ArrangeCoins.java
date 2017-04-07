package wenjing.Leecode.number;

/**
 * Created by yamengwenjing on 2016-11-15.
 * You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.

 Given n, find the total number of full staircase rows that can be formed.

 n is a non-negative integer and fits within the range of a 32-bit signed integer.

 这个题就是把生活中的问题转换成数学问题
  k（k+1）<2n<(k+1)(k+2)
 *   k(k+1) <= 2*n < (k+1)*(k+2)
 *   Math.sqrt(2*n-0.75)-1.5 < k <= Math.sqrt(2*n+0.25)-0.5
 *
 *  sum = (x + 1) * x / 2
 *   so for this problem, if we know the the sum, then we can know the x = (-1 + sqrt(8 * n + 1)) / 2
 *   (1 + X) * X = 2n
 4X * X + 4 * X = 8n
 (2X + 1)(2X + 1) - 1 = 8n
 X = (Math.sqrt(8 * n + 1) - 1)/ 2
 *
 */
public class ArrangeCoins {

    public int arrangeCoins(int n) {
        return (int)((-1 + Math.sqrt(1 + 8 * (long)n)) / 2);
    }

    public int arrangeCoins2(int n) {
//        if (n <= 2) {
//            return 1;
//        }
//
//
//        int span = 1;
//        int remain = n;
//        int currentValue = 0;
//        int i = 1;
//        for (i = 0; i <= n; i++) {
//            currentValue= currentValue + span;
//            if (remain >= currentValue) {
//                span++;
//                remain = remain - currentValue;
//            }
//
//        }
//        return i;
        //上面这种情况 可能会越界！所以要用long

        if(n<=0) return 0;
        long sum=0;
        int i=1;
        for(; sum<=n; i++){
            sum += i;
        }
        return i-2;
    }
}