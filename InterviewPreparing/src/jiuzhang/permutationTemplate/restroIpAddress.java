package jiuzhang.permutationTemplate;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangw on 2017/5/31.
 */
public class restroIpAddress {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        if(s == null || s.length() == 0 || s.length() > 12) {
            return res;
        }
        helper(s, res, new StringBuilder(), 0, 0);
        return res;
    }

    private void helper(String s, List<String> res, StringBuilder sb, int pos, int count) {
        //结束条件 和字符串长度一样，有了3个‘.’
        if(pos == s.length() && count == 3) {
            res.add(sb.toString());
            return;
        }
        if(count > 3) {
            return;
        }
        for(int i = pos; i < s.length(); i++) {
            //对于递归，当前N而言 他有可能是从第一个到第I个作为地一组ip，
            String t = s.substring(pos, i+1);
            //不可能的情况就直接结束循环。任何一个循环内 只要是这样出现 就非法了，直接结束
            if(t.length() > 3 || t.length() > 1 && t.charAt(0) == '0' || Integer.valueOf(t) > 255) {
                break;
            }
            int len = sb.length();
            //加入当前stringbuffer
            sb.append(t);
            //如果不是最后一位
            if(i+1 != s.length()) {
                sb.append(".");
                helper(s, res, sb, i+1, count+1);
            } else {
                helper(s, res, sb, i+1, count);
            }
            sb.setLength(len);
        }
    }
}
