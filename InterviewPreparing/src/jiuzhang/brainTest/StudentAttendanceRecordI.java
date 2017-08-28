package jiuzhang.brainTest;

/**
 * Created by yangw on 2017/8/28.
 */
public class StudentAttendanceRecordI {
    public boolean checkRecord(String s) {

        if(s.indexOf('A')==s.lastIndexOf('A')&&!s.contains("LLL")){
            return true;
        }
        return false;
    }
}
