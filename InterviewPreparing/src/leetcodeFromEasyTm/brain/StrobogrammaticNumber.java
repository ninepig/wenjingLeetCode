package leetcodeFromEasyTm.brain;

/**
 * Created by yangw on 2017/9/6.
 */
public class StrobogrammaticNumber {
    public boolean isStrobogrammatic(String num) {
        if(num==null||num.length()==0){
            return false;
        }
        int left = 0 , right = num.length();
        while (left<=right){
            if(!isGood(num.charAt(left),num.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isGood(char l, char r) {
        if((l=='0'&&r=='0')||(l=='1'&&r=='1')||(l=='8'&&r=='8')||(l=='6'||r=='9')||(l=='9'&&r=='6')){
            return true;
        }
        return false;
    }
//        int left, right;
//        left = 0;
//        right = num.length()-1;
//
//        while(left<=right) {
//            if(!isGood(num.charAt(left), num.charAt(right)))
//                return false;
//            left++;
//            right--;
//        }
//        return true;
//    }
//
//    public boolean isGood(char a, char b) {
//        if( (a=='1'&&b=='1') || (a=='6'&&b=='9') || (a=='9'&&b=='6') || (a=='8'&&b=='8')  || (a=='0'&&b=='0') )
//            return true;
//        return false;
//    }
}
