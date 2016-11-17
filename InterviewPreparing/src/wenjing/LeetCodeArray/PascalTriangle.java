package wenjing.LeetCodeArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yamengwenjing on 2016-11-16.
 * 大神的方法，自己没想明白。对于每个新的数组，只要前后各加1，然后中间部分由上一个数组提供就好啦
 */
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resultList = new ArrayList<>();
        if(numRows<=0){
            return resultList;
        }

        List<Integer> pre = new ArrayList<>();
        //first line of tri
        pre.add(1);
        resultList.add(pre);

        for(int i = 2; i<=numRows;i++){

            List<Integer> cur = new ArrayList<>();
            //new list head is one
            cur.add(1);
            for(int j = 0 ; j<pre.size()-1;j++){
                cur.add(pre.get(j)+pre.get(j+1));
            }
            //new list tail is one
            cur.add(1);
            resultList.add(cur);
            pre = cur;

        }


        return resultList;


    }
}
