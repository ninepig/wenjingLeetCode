package secondTime;

/**
 * Created by yamengwenjing on 2017-05-01.
 */
public class longestPalindrome {

    public int longestPalindrome(String s) {
//        if(s==null||s.length()==0){
//            return 0;
//        }
//        int[] showingTimes = new int[128];
//        int result =0;
//        for(char thisChar: s.toCharArray()){
//            showingTimes[thisChar-'a']++;
//        }
//
//        for(int number:showingTimes){
//            result += number/2*2;
//        }
//
//        return result+1;
        if(s==null||s.length()==0){
            return 0;
        }

        int[] showingTimes = new int['z'-'A'+1];
        int result =0;
        for(char thisChar: s.toCharArray()){
            showingTimes[thisChar-'A']++;
        }

        for(int number:showingTimes){
            result += number/2*2;
        }

        if(result<s.length())
            result++;

        return result;

    }
}
