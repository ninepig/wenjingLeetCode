package leetcodeFromEasyTm.queue;

import java.util.LinkedList;

/**
 * Created by yangw on 2017/8/31.
 */
public class MovingAverageFromDataStream {


    LinkedList<Integer> queue ;
    int sum ;
    int size;

    /** Initialize your data structure here. */
    public MovingAverage(int size) {
       this.queue = new LinkedList<>();
       this.sum = 0;
       this.size=size;
    }

    public double next(int val) {
        if(queue.size()<size){
            queue.offer(val);
            sum+=val;
            return sum/queue.size();
        }else {
            int polling = queue.poll();
            sum -= polling;
            queue.offer(val);
            sum +=val;
            return sum/size;
        }


    }

    /**
     * Your MovingAverage object will be instantiated and called as such:
     * MovingAverage obj = new MovingAverage(size);
     * double param_1 = obj.next(val);
     */
}


