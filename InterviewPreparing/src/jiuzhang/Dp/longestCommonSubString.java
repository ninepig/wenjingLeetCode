package jiuzhang.Dp;

/**
 * Created by yangw on 2017/8/14.
 */
public class longestCommonSubString {
    public int longestCommonSubsStrings(String A, String B) {
        // write your code here
        if(A==null||A.length()==0||B==null||B.length()==0){
            return 0;
        }
        // state
        int[][] state = new int[A.length()+1][B.length()+1];
        //means the length of lcs  of ith index of a and j th index of B.
        //initial state not nessessry to do this
//        for(int i = 0 ; i < A.length()+1;i++){
//            state[i][0] = 0;
//        }
//        for(int i = 0 ; i < B.length()+1;i++){
//            state[0][i] = 0;
//        }
        //state transfer
        for(int i = 1 ; i <=A.length();i++){
            for(int j = 1; j<=B.length();j++){

                if(A.charAt(i-1)==B.charAt(j-1)){
                    state[i][j]= state[i-1][j-1]+1;
                }else {
                    //if not equal, we reset to 0
                    state[i][j]= 0 ;
                }
            }
        }
        int max = 0;
        for(int i = 0 ; i <=A.length();i++){
            for(int j = 0 ; j <= B.length();j++){
                max = Math.max(max,state[i][j]);
            }
        }

        return max;
    }
}
