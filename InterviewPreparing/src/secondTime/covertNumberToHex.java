package secondTime;

/**
 * Created by yamengwenjing on 2017-05-03.
 */
public class covertNumberToHex {


    public String toHex(int num) {
        if(num==0){
            return "0";
        }
        char[] map = new char[]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        StringBuffer sb = new StringBuffer();
        while (num!=0){
            sb.append(map[num&15]);
            num = num>>>4;
        }
        return sb.reverse().toString();
    }

}
