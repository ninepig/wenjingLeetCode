package wenjing.LeetCodeString;

/**
 * Created by yamengwenjing on 2017-04-13.
 */
public class implementStrStr {

    public int strStr(String haystack, String needle) {
            if(haystack==null||needle==null||needle.length()==0){
                return 0;
            }
            int lengthA = haystack.length();
            int lengthB =needle.length();
            if(lengthA<lengthB){
                return -1;
            }
            if(lengthB==0){
                return 0;
            }
//            int pointerA = 0;
//            int pointerB= 0;

            for(int i = 0 ; i<lengthA-lengthB;i++){
                boolean ifContain= true;
                for(int j = 0; j<lengthB;j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        ifContain = false;
                        break;
                    }
                }
                if(ifContain){
                    return i;
                }
            }

            return -1;
    }



}
