package jiuzhang.Dp;

/**
 * Created by yangw on 2017/8/15.
 * Given n items with size Ai, an integer m denotes the size of a backpack. How full you can fill this backpack?

 Notice

 You can not divide any item into small pieces.

 Have you met this question in a real interview? Yes
 Example
 If we have 4 items with size [2, 3, 5, 7], the backpack size is 11, we can select [2, 3, 5], so that the max size we can fill this backpack is 10. If the backpack size is 12. we can select [2, 3, 7] so that we can fulfill the backpack.

 You function should return the max size we can fill in the given backpack.
 */
public class backpack {
    public int backpack(int[] size,int backpackSize){
        if(size==null||size.length==0){
            return 0;
        }
        if(backpackSize<=0){
            return 0;
        }

        //state
        int length = size.length;
        Boolean[][] fullFillState =  new Boolean[length+1][backpackSize+1];

        //init
        for(int i = 0 ; i <= length; i++){
            fullFillState[i][0] = true;
        }

        //state transfer

        for (int i = 1; i <= length; i++) {
            for (int j = 0; j <= backpackSize; j++) {
                fullFillState[i][j] = fullFillState[i - 1][j];
                //size[i-1] means the size of  i th back pack.
                if (j >= size[i-1] && fullFillState[i-1][j - size[i-1]]) {
                    fullFillState[i][j] = true;
                }
            } // for j
        } // for i

        for(int i = backpackSize ; i>=0;i++){
            if(fullFillState[length][i]){
                return i;
            }
        }

        return 0;
    }
}
