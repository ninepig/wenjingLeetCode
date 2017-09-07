package leetcodeFromEasyTm.dp;

/**
 * Created by yangw on 2017/9/4.
 */
public class housePaint {
    public int minCost(int[][] costs){
        if(costs==null||costs.length==0){
            return 0;
        }
        // 0 means red 1means blue 2 means green
        //store the cost of current house's cost , 3 means three colors
        int[] current = new int[3];
        //inital
        current[0] = costs[0][0];
        current[1]=costs[0][1];
        current[2] =costs[0][2];

        //state transfer;
        for (int i= 0 ; i<costs.length;i++){
            int[] pre = current;
            //the value if you choose X color for current house;
            current[0] = Math.min(pre[1],pre[2])+costs[i][0];
            current[1] = Math.min(pre[0],pre[2])+costs[i][1];
            current[2] = Math.min(pre[1],pre[0])+costs[i][2];
        }

        return Math.min(current[0],Math.min(current[1],current[2]));

    }
}
