package wenjing.matrix;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yamengwenjing on 2017-03-05.
 */
public class numberOfboomrangs {

    public int numberOfBoomerangs(int[][] points) {
        int res = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<points.length; i++) {
            for(int j=0; j<points.length; j++) {
                if(i == j)
                    continue;

                int d = getDistance(points[i], points[j]);
                map.put(d, map.getOrDefault(d, 0) + 1);
            }

            for(int val : map.values()) {
                res += val * (val-1);
            }
            map.clear();
        }

        return res;
    }

    private int getDistance(int[] a, int[] b) {
        int dx = a[0] - b[0];
        int dy = a[1] - b[1];

        return dx*dx + dy*dy;
    }

//    public static int numberOfBoomerangs(int[][] points) {
//        int pointAx = 0, pointBx=0 , pointAy = 0,pointBy=0,pointCx=0,pointCy=0;
//        int result = 0;
//
//
//        for(int i = 0 ; i<points.length;i++){
//            pointAx = points[i][0];
//            pointAy = points[i][1];
//            for(int j = 0;j<points.length-2;j++){
//                if(i==j){
//                    continue;
//                }
//                pointBx = points[j][0];
//                pointBy = points[j][1];
//                pointCx = points[j+1][0];
//                pointCy = points[j+1][1];
//                if(judgeDistance(pointAx,pointAy,pointBx,pointBy,pointCx,pointCy)){
//                result++;
//                }
//            }
//        }
//        return result;
//    }
//
//    private static boolean judgeDistance(int pointAx, int pointAy, int pointBx, int pointBy, int pointCx, int pointCy) {
//            double distanceAB=0,distanceAC=0;
//            distanceAB = Math.pow((pointAx-pointBx),2) + Math.pow((pointAy-pointBy),2);
//            distanceAC = Math.pow((pointAx-pointCx),2) +Math.pow((pointAy-pointCy),2);
//            return  distanceAB==distanceAC;
//    }


}
