package leetcodeFromEasyTm.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangw on 2017/9/6.
 */
public class pascalTriangle {
    public List<List<Integer>> generate(int numRows) {

            if (numRows==0){
                return new ArrayList<>();
            }
            List<List<Integer>> result = new ArrayList<>();

            List<Integer> pre = new ArrayList<>();
            pre.add(1);
            result.add(pre);

            for(int i = 2; i<=numRows;i++){
                List<Integer> cur = new ArrayList<>();
                cur.add(1);
                for (int j = 0;j<pre.size()-1;j++){
                    cur.add(pre.get(j)+pre.get(j+1));
                }
                cur.add(1);
                result.add(cur);
                pre = cur;
            }

        return result;

    }
}
