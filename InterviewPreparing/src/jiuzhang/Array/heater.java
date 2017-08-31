package jiuzhang.Array;

import java.util.Arrays;

/**
 * Created by yangw on 2017/8/29.
 */
public class heater {
    public int findRadius(int[] houses, int[] heaters) {

        Arrays.sort(houses);
        Arrays.sort(heaters);
        int i =0;
        int j =0;
        int r = 0;
        while (i<houses.length) {

            while (j<heaters.length-1&& Math.abs(houses[i]-heaters[j+1])<=Math.abs(houses[i]-heaters[j])){
                j++;
            }
            r = Math.max(r,Math.abs(houses[i]-heaters[j]));
            i++;
        }

        return r;

    }
}
