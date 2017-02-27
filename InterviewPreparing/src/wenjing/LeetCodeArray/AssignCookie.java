package wenjing.LeetCodeArray;

import java.util.Arrays;

/**
 * Created by yamengwenjing on 2017-02-23.
 */
public class AssignCookie {
    /*
    这个就是一种贪心算法。。看了答案才知道。还需要多学习。不过是自己做出来的
     */
    public int findContentChildren(int[] g, int[] s) {
        if(g==null||s==null){
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int output = 0;
        for(int i = 0,j=0;i<g.length;){

            if(j<s.length) {
                if (g[i] <= s[j]) {
                    output++;
                    i++;
                    j++;
                } else {
                    j++;
                }
            }else{
                break;
            }

        }
        return output;

    }

}
