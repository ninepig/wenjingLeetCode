package wenjing.LeetCodeString;

/**
 * Created by yamengwenjing on 2017-02-28.
 */
public class validAnagram {
    //计算char代表和的方法居然超时了，这个方法也不对。
    public boolean isAnagramSum(String s, String t) {
        if(s==null||t==null){
            return false;
        }
        if(s==null&&t==null){
            return  true;
        }
        int sumofS=0,sumofT=0;
        for(int i = 0; i<s.length();i++){
            sumofS += s.charAt(i)-'a';
        }
        for(int i=0;i<t.length();i++){
            sumofT +=t.charAt(i)-'a';
        }
        return sumofS==sumofT;
    }

    public boolean isAnagram(String s, String t) {
        if(s==null||t==null){
            return false;
        }
        if(s==null&&t==null){
            return  true;
        }
        if(s.length()!=t.length()){
            return false;
        }
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        int[] showingChar = new int[26];
        for(int i = 0; i<sChar.length;i++){
            showingChar[sChar[i]-'a']++;
        }
        for(int j = 0 ;j<tChar.length;j++){
            if(showingChar[tChar[j]-'a']>0){
                showingChar[tChar[j]-'a']--;
            }else{
                return false;
            }
        }
        return true;

    }
}
