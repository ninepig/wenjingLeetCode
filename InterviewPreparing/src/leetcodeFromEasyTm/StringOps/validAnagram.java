package leetcodeFromEasyTm.StringOps;

/**
 * Created by yangw on 2017/9/4.
 */
public class validAnagram {
    public boolean isAnagram(String s, String t) {
            if (s==null&t==null){
                return true;
            }
            if (s==null||t==null){
                return false;
            }

            int[] judge = new int[26];

            for(char c :s.toCharArray()){
                judge[c-'a']++;
            }

            for (char c:t.toCharArray()){
                judge[c-'a']--;
            }
            for(int i = 0 ;i<26;i++){
                if(judge[i]!=0){
                    return false;
                }
            }
            return  true;


    }
}
