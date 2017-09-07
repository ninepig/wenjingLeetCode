package leetcodeFromEasyTm.StringOps;

/**
 * Created by yangw on 2017/9/1.
 * leetcode 243
 * lock
 */
public class shortestDistanceTwoWord {
    public int shortestDistance(String[] words, String word1, String word2) {
        int index1 = -1;
        int index2 = -1;
        int min = Integer.MAX_VALUE;

        for ( int i = 0 ; i<words.length;i++){
            if(words[i].equals(word1)){
                if(index2!=-1){
                    min = Math.min(min,i-index2);
                }
                index1 = i;

            }
            if(words[i].equals(word2)){
                if(index1 != -1){
                    min = Math.min(min,i-index1);
                }
                index2 = i;
              }
        }
        return min;
    }
}
