package leetcodeFromEasyTm.bit;

/**
 * Created by yangw on 2017/9/5.
 */
public class Base7 {

    public String convertToBase7(int num) {

        if (num==0){
            return "0";
        }
        Boolean ifPos = false;
        if (num>=0){
            ifPos = true;
        }

        StringBuffer sb = new StringBuffer();

        int temp = Math.abs(num);

        while (temp>0){
            int remider = temp%7;
            sb.insert(0,remider);
            temp = temp/7;
        }
        if (!ifPos){
            sb.insert(0,'-');
        }

        return sb.toString();
    }

}
