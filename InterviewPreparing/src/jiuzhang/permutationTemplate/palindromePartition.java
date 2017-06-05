package jiuzhang.permutationTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangw on 2017/5/29.
 */
public class palindromePartition {

    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        if(s==null||s.length()==0){
            return result;
        }
        List<String> currentList = new ArrayList<>();
        partitionHelper(result,currentList,s,0);


        return result;
    }

    private void partitionHelper(List<List<String>> result, List<String> currentList, String s, int start) {
    //keypoint : ending condition
    //when there i equals s 's length , meaning it go through all the substring
        if(start==s.length()){
            result.add(new ArrayList<>(currentList));
        }else {
            for(int i = start;i<s.length();i++){
                    //对于当前循环，我们考虑i怎么样才能加入currentlist， 这里面就是如果start到i是回文的才可以加入
                    //第一层循环表示必须是 a aa aba 这样的 从i 开始  i---i+1/i---i+2 的substring 都是回文才可以
                    if(isParlndrome(s,start,i)){
                        currentList.add(s.substring(start,i+1));
                        //从n-->n+1 表示 从i+1开始 i+1的所有substring也必须都是回文
                        partitionHelper(result,currentList,s,i+1);
                        currentList.remove(currentList.size()-1);
                    }
            }
        }

    }

    private boolean isParlndrome(String s, int low, int high) {
        while(low < high)
            if(s.charAt(low++) != s.charAt(high--)) return false;
        return true;

    }

}
