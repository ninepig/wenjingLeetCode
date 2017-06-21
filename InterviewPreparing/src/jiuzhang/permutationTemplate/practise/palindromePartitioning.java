package jiuzhang.permutationTemplate.practise;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangw on 2017/6/10.
 * Given a string s, partition s such that every substring of the partition is a palindrome.

 Return all possible palindrome partitioning of s.

 For example, given s = "aab",
 Return

 [
 ["aa","b"],
 ["a","a","b"]
 ]
 */
public class palindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        if(s.length()==0||s==null){
            return result;
        }
        List<String> currenlist= new ArrayList<>();
        helper(result,currenlist,s,0);

        return result;



    }

    private void helper(List<List<String>> result, List<String> currenlist, String s, int start) {
            if(s.length()==start){
                result.add(new ArrayList<>(currenlist));
            }else {
                for(int i = start;i<s.length();i++){

                    if(isParlndrome(s,start,i)){
                        currenlist.add(s.substring(start,i+1));
                        helper(result,currenlist,s,i+1);
                        currenlist.remove(currenlist.size()-1);
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
