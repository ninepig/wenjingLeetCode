package leetcodeFromEasyTm.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by yangw on 2017/9/3.
 */
public class assignCookies {
    /*
    读题不仔细，s可以bigger  than g!
     */
//    public int findContentChildren(int[] g, int[] s) {
//        if (g==null||g.length==0||s.length==0||s==null){
//            return 0;
//        }
//        HashMap<Integer,Integer> cookieMap = new HashMap<>();
//        int result = 0 ;
//
//        for (int size: s){
//            cookieMap.put(size,cookieMap.getOrDefault(size,0)+1);
//        }
//
//        for (int gre : g){
//            if(cookieMap.containsKey(gre)){
//                if (cookieMap.get(gre)>0){
//                    result++;
//                    cookieMap.put(gre,cookieMap.get(gre)-1);
//                }
//            }
//        }
//        return result;
//    }
    public int findContentChildren(int[] g, int[] s) {

        if (g==null||g.length==0||s.length==0||s==null){
            return 0;
        }
        int i = 0;
        int result = 0;
        Arrays.sort(s);
        Arrays.sort(g);

        for (int j = 0 ; i<g.length &&j<s.length;j++){
            if(g[i]<=s[j]){
             i++;
             result++;
            }
        }

        return result;
    }
}
