package wenjing.LeetCodeString;

/**
 * Created by yamengwenjing on 2017-04-12.
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
            if(strs==null||strs.length==0){
                return "";
            }
            Boolean ifSame = true;
            int index = 0;
            StringBuffer result = new StringBuffer();

            while (ifSame){

                for(int i = 0 ; i <strs.length;i++){
                    //如果str的长度小于index的话 就直接结束循环！
                    if(strs[i].length()<=index||strs[i].charAt(index)!=strs[0].charAt(index)){
                        ifSame = false;
                        break;
                    }
                }
                if(ifSame){
                    result.append(strs[0].charAt(index));
                    index++;
                }

            }

            return result.toString();


    }

}
