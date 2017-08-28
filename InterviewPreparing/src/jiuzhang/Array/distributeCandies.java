package jiuzhang.Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by yangw on 2017/8/22.
 */
public class distributeCandies {
    public int distributeCandies(int[] candies) {
         if(candies==null||candies.length==0){
             return 0;
         }

        HashSet candieKinds = new HashSet();

        for (int i = 0 ; i< candies.length;i++){
            candieKinds.add(candies[i]);
        }

        if (candieKinds.size()>candies.length/2){
            return candies.length/2;
        }else {
            return candieKinds.size();
        }

    }
}
