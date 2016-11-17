package wenjing.LeetCodeArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yamengwenjing on 2016-11-16.
 */
public class pascalTriangleII {

    public List<Integer> getRow(int rowIndex) {

        ArrayList<Integer> pre = new ArrayList<>();
        ArrayList<Integer> cur = new ArrayList<>();

        if(rowIndex<0){
            return cur;
        }
        pre.add(1);
        if(rowIndex == 0){
            return pre;
        }
        for(int i = 1;i<=rowIndex;i++){
            cur = new ArrayList<>();
            cur.add(1);
            //这里要注意，必须是减去1 因为前后都是1，所以长度要多-1
            for(int j = 0;j< pre.size()-1;j++) {
                cur.add(pre.get(j) + pre.get(j + 1));
            }
            cur.add(1);
            pre = cur;
        }


        return cur;

    }
}
