package jiuzhang.Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by yangw on 2017/8/30.
 */
/*
贪心算法，leetcode lock 253
 */
public class meetingRoomII{
    public int minMeetingRooms(Interval[] intervals) {

        if(intervals==null||intervals.length==0){
            return 0;
        }
        //先是排序，按照会议开始时间最早的排
        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start-o2.start;
            }
        });
        //根据最早开始的会议的结束时间，做贪心算法，如果下一个开始的会议的开始时间比之前的结束时间早，我们就可以用一个会议室
        // 如果不可以，我们则要多一个会议室，
        //利用priorityQueue 进行计算。 如果符合一个会议室，就只保存最后一个会议的ending time，需要更多的会议室 就多一个
        PriorityQueue<Integer> endingTime = new PriorityQueue<>();
        endingTime.offer(intervals[0].end);

        for(int i = 1; i< intervals.length;i++){
            if (intervals[i].start>=endingTime.peek()){
                endingTime.poll();
            }
            endingTime.offer(intervals[i].end);
        }

        return endingTime.size();

    }

    private class Interval {
        int start;
        int end;
    }
}
