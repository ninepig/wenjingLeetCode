package leetcodeFromEasyTm.StringOps;

/**
 * Created by yangw on 2017/9/5.
 */
public class studentAttendenceRecord {
    public boolean checkRecord(String s) {
        if (s.indexOf('A') == s.lastIndexOf('A')&&(!s.contains("LLL"))){
            return  true;
        }
        return  false;
    }
}
