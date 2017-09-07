package leetcodeFromEasyTm.StringOps;

/**
 * Created by yangw on 2017/9/4.
 */
public class longestPalindrome {
    public int longestPalindrome(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
        int[] charA = new int['z'-'A'+1];
        boolean addOne = false;
        int result = 0;

        for(char c: s.toCharArray()){
            charA[c-'A']++;
        }
        for(int i = 0 ; i<charA.length ; i++){
            if(charA[i]%2==0){
                result += charA[i];
            }else{
                addOne = true;
                if(charA[i]/2!=0){
                    result+=charA[i]/2*2;
                }
            }
        }
        if(addOne){
            result+=1;
        }
        return result;
    }
}
