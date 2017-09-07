package leetcodeFromEasyTm.StringOps;

/**
 * Created by yangw on 2017/9/1.
 */
public class DetectCapitcal {
    public boolean detectCapitalUse(String word) {

        if(word.length()==1){
            return true;
        }

        char firstChar = word.charAt(0);
        char secondChar = word.charAt(1);
//         boolean[] result = new boolean[word.length()-1];

         // if fisrt is upper
        if(detectCatpical(firstChar)){
            //if second is upper
            if (detectCatpical(secondChar)){
                //once there is a lower
                for (int i = 2 ; i < word.length() ; i++){
                    if(!detectCatpical(word.charAt(i))){
                        return false;
                    }
                }
                return true;
            }else {
                //once there is a  upper
                for (int i = 2 ; i < word.length() ; i++){
                    if(detectCatpical(word.charAt(i))){
                        return false;
                    }
                }
                return true;
            }
        }else {
            //once there is a upper
            for (int i = 2 ; i < word.length() ; i++){
                if(detectCatpical(word.charAt(i))){
                    return false;
                }
            }
            return true;
        }


    }

    public boolean detectCatpical(char thisChar){

        return (thisChar>='A') && (thisChar<='Z');
    }


    public boolean detectCapitalUse2(String word) {
        int numUpper = 0;
        for (int i=0;i<word.length();i++)
            if (Character.isUpperCase(word.charAt(i))) numUpper++;
        if (numUpper == 1) return Character.isUpperCase(word.charAt(0));
        return numUpper == 0 || numUpper == word.length();
    }
}
