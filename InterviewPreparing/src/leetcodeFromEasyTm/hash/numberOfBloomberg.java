package leetcodeFromEasyTm.hash;

import java.util.HashMap;

/**
 * Created by yangw on 2017/9/4.
 */
public class numberOfBloomberg {
    public int numberOfBoomerangs(int[][] points) {

        if(points==null||points.length==0){
            return 0;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int result = 0;
        for (int i = 0 ; i < points.length ; i++){
            for (int j = 0 ; j< points.length ; j++){
                if(i == j){
                    continue;
                }
                int distance = getDistance(points[i],points[j]);
                map.put(distance,map.getOrDefault(distance,0)+1);

                for(int value:map.values()){
                    //permutation of being value x  for two node!
                    result += (value)*(value-1);
                }
            }
            map.clear();
        }

        return result;
    }

    private int getDistance(int[] point, int[] point1) {
        int x = point[0];
        int x2 =point1[0];
        int y = point[1];
        int y2 = point1[1];

        return (y2-y)*(y2-y)+(x2-x)*(x2-x);

    }
}
