package jiuzhang.Array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by yangw on 2017/8/30.
 */

/*
leetcode lock 252
Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), determine if a person could attend all meetings.

For example, Given [[0, 30],[5, 10],[15, 20]], return false.
 */
public class MeetingRoom {
    public boolean canAttendMeetings(Interval[] intervals){
        if(intervals!=null||intervals.length==0){
            return true;
        }
        //先进行排序，按照开始时间进行排序
        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start-o2.start;
            }
        });
        //如果有一个的开始时间小于前一个的结束时间，则说明不可能满足条件
        for(int i = 0 ; i < intervals.length;i++){
            if(intervals[i].end>intervals[i+1].start){
                return false;
            }
        }
        return true;
    }


    private class Interval {
        int start;
        int end;
    }
}
