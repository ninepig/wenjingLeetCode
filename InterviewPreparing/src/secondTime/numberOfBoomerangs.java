package secondTime;

import java.util.HashMap;

/**
 * Created by yamengwenjing on 2017-05-02.
 */
public class numberOfBoomerangs {

    public int numberOfBoomerangs(int[][] points) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int result = 0;
        //这不是一个矩阵问题，只是一个N*2的矩阵样子的数组
        for(int i = 0;i<points.length;i++){
            for(int j = 0 ; j<points.length;j++){

                if(i==j){
                    continue;
                }
                int distance = getDistance(points[i],points[j]);
                hm.put(distance,hm.getOrDefault(distance,0)+1);

            }
            for(int val : hm.values()){
                result+= val*(val-1);
            }
            //很关键 要把图清空
            hm.clear();
        }
        return result;


    }

    private int getDistance(int[] i, int[] i1) {
        int dx = i[0]-i1[0];
        int dy = i[1]-i1[1];
        return dx*dx + dy*dy;

    }


}
