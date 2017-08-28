package jiuzhang.Array;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by yangw on 2017/8/27.
 */
public class MiniumumIndexSumOfTwoLists {

    public String[] findRestaurant(String[] list1, String[] list2) {

        HashMap<String,Integer> map = new HashMap<String, Integer>();
        ArrayList<String> result = new ArrayList<>();
        int leastIndexSum = Integer.MAX_VALUE;

        for(int i = 0 ; i<list1.length;i++){
            map.put(list1[i],i);
        }

        for (int i = 0; i < list2.length;i++){
            if(map.containsKey(list2[i])){
                //count index sum
                int indexSum = map.get(list2[i]) + i;


                if(indexSum == leastIndexSum){
                    result.add(list2[i]);
                }
                // if indexSum equal min one, put it in result
                if(indexSum<leastIndexSum){
                    leastIndexSum = indexSum;
                    result.clear();
                    result.add(list2[i]);

                }
            }
        }
        String[] res = new String[result.size()];
        for(int i = 0 ;i<result.size();i++){
            res[i] = result.get(i);
        }

        return res;
    }
}
