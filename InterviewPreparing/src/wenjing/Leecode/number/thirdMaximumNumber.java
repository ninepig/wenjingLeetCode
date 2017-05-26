package wenjing.Leecode.number;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * Created by yamengwenjing on 2017-04-16.
 */
public class thirdMaximumNumber {
        public int thridMax(int[] num){
            Integer max = null;
            Integer max2 = null;
            Integer max3 = null;
            for(Integer n : num){
                if(n.equals(max)||n.equals(max2)||n.equals(max3)){
                    continue;
                }
                if(max == null || n>max){
                    max3=max2;
                    max2=max;
                    max=n;
                }else if(max2==null||n>max2) {
                    max3=max2;
                    max2 =n;
                }else if(max3 == null||n>max3){
                    max3=n;
                }
            }
            return max3==null? max:max3;

        }

        public int thirdMaxPriorityQueen(int[] nums){
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            Set<Integer> set = new HashSet<>();
            for(int n : nums) {
                if (set.add(n)) {
                    pq.offer(n);
                    if (pq.size() > 3) pq.poll();
                }
            }
            if(pq.size()==2) pq.poll();
            return pq.peek();
        }


}
