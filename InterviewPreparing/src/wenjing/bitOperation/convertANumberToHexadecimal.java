package wenjing.bitOperation;

/**
 * Created by yamengwenjing on 2017-03-06.
 */
public class convertANumberToHexadecimal {
    public String toHex(int num) {
            if(num==0){
                return "0";
            }
            char[] hexTable = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
            StringBuffer sb = new StringBuffer();
            while(num!=0){
                sb.append(hexTable[(num&15)]);
                num = num>>>4;
            }
            return sb.reverse().toString();
    }
}
