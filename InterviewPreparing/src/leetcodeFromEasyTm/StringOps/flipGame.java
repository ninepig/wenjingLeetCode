package leetcodeFromEasyTm.StringOps;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangw on 2017/8/31.
 */
public class flipGame {

    public List<String> getFlipResult(String s1){
            if(s1==null||s1.length()==0){
                return new ArrayList<>();
            }
            ArrayList<String> resultList = new ArrayList<>();
            for(int i = 0 ; i< s1.length();i++){
                if(s1.charAt(i)=='+'&&s1.charAt(i+1)=='+'){
                   char[] temp = new char[s1.length()];
                   //copy string to temp!
                   System.arraycopy(s1,0,temp,0,s1.length());
                   temp[i]=temp[i+1]='-';
                    resultList.add(new String(temp));
                }

            }
        return resultList;

    }
}
