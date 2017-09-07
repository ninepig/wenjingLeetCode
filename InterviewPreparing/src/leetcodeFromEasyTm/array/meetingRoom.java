package leetcodeFromEasyTm.array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by yangw on 2017/9/2.
 */
public class meetingRoom {
    public boolean canAttendMeetings(Interval[] intervals){
        if (intervals == null||intervals.length==0){
            return true;
        }
        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start-o2.start;
            }
        });

        for (int i = 0 ; i< intervals.length-1 ; i++) {
            if (intervals[i].end>intervals[i+1].start) {
                return false;
            }
        }
        return  true;
    }

    private class Interval {
        int start;
        int end;
    }
}
