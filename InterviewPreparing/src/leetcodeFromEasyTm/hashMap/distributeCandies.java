package leetcodeFromEasyTm.hashMap;

import java.util.HashMap;

/**
 * Created by yangw on 2017/8/31.
 */
public class distributeCandies {
    public int distributeCandies(int[] candies) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int candy :candies){
//            if(map.containsKey(candy)){
                map.put(candy,map.getOrDefault(candy,1)+1);
//            }
        }

        if(map.size()>candies.length/2){
            return candies.length/2;
        }else {
            return map.size();
        }



    }

}
