package wenjing.LeetCodeString;

/**
 * Created by yamengwenjing on 2017-04-05.
 */
public class CountAndSay {

    public String countAndSay(int n) {
        if(n<=0){
            return "";
        }
        String curStr = "1";

        for(int i=2;i<n;i++){
            int count = 1;
            StringBuffer sb = new StringBuffer();
            for(int j =1;j<curStr.length();j++){
                if(curStr.charAt(j)==curStr.charAt(j-1)){
                    count++;
                }else {
                    sb.append(count);
                    sb.append(curStr.charAt(j-1));
                    count=1;
                }
            }
            // trick place. dont forget to add last digit and count
            sb.append(count);
            sb.append(curStr.charAt(curStr.length()-1));
            curStr = sb.toString();
        }
        return  curStr;
    }
    public String countAndSay2(int n){
        if(n<=0){
            return "";
        }
        String curStr = "1";
        for(int i = 2;i<n;i++){
            int count = 1;
            StringBuffer sb = new StringBuffer();
            for(int j = 1; j<curStr.length();j++){
                if(curStr.charAt(j)==curStr.charAt(j-1)){
                    count++;
                }else {
                    sb.append(count);
                    sb.append(curStr.charAt(j-1));
                    count = 0;
                }
            }
            sb.append(count);
            sb.append(curStr.charAt(curStr.length()-1));
            curStr = sb.toString();
        }
        return curStr;
    }
}
