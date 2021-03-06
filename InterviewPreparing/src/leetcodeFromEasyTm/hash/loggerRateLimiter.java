package leetcodeFromEasyTm.hash;

import java.util.HashMap;

/**
 * Created by yangw on 2017/8/31.
 */
public class loggerRateLimiter {
    /** Initialize your data structure here. */
    public loggerRateLimiter() {

    }

    HashMap<String,Integer> map = new HashMap<>();
    //follow up,consider concurrent
//    ConcurrentHashMap<String,Integer> map = new HashMap<>();

    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
     If this method returns false, the message will not be printed.
     The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(!map.containsKey(message)){
            map.put(message,timestamp);
            return true;
        }else {
            if ((timestamp - map.get(message)) > 10) {
                map.put(message, timestamp);
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * Your Logger object will be instantiated and called as such:
     * Logger obj = new Logger();
     * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
     */


}
