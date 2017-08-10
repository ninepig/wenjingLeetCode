package jiuzhang.Dp;

import java.util.List;

/**
 * Created by yangw on 2017/8/10.
 * http://blog.csdn.net/linhuanmars/article/details/22358863
 */
public class wordBreaker {
    public boolean wordBreak(String s, List<String> dict) {
        if(s==null||s.length()==0){
            return true;
        }
        boolean[] res = new boolean[s.length()+1];
        res[0] = true;
        for(int i = 0 ; i<s.length();i++){
            StringBuffer str = new StringBuffer(s.substring(0,i+1));
            for(int j = 0;j<=i;j++){
                if(res[j]&&dict.contains(str.toString())){
                    res[i+1] = true;
                    break;
                }
                str.deleteCharAt(0);
            }
        }
        return  res[s.length()];
    }

    public boolean wordBreak2(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] f = new boolean[n + 1];
        f[0] = true;
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= i && !f[i]; j++)
                f[i] = wordDict.contains(s.substring(j - 1, i)) && f[j - 1];
        return f[n];
    }
}