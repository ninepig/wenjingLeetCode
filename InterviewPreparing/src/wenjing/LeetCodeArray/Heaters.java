package wenjing.LeetCodeArray;

import java.util.Arrays;

/**
 * Created by yamengwenjing on 2017-04-12.
 */
public class Heaters {

    public int findRadius(int[] houses, int[] heaters) {

        Arrays.sort(heaters);
        Arrays.sort(houses);

        int i = 0 ;
        int radius = 0;

        for(int house: houses){
            //find ith heater which is closest to thisHouse
            //house - heater[i]<heater[i+1]-house
            while (i<heaters.length-1&&(heaters[i]+heaters[i+1]<=2*house)){
                i++;
            }
            radius = Math.max(radius, Math.abs(heaters[i] - house));
        }
        return radius;

    }

}
