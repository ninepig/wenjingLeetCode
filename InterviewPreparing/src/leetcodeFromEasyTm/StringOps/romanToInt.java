package leetcodeFromEasyTm.StringOps;

/**
 * Created by yangw on 2017/9/4.
 */
public class romanToInt {
    public int romanToInt(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
        int result = 0 ;
        char[] charString = s.toCharArray();

        for(int i=0; i<s.length();i++){

            switch(s.charAt(i)){

                case'I':
                    if(i<s.length()-1&&(s.charAt(i+1)=='V'||s.charAt(i+1)=='X')){
                        result = result-1;
                    }else{
                        result = result+1;
                    }
                    break;
                case'V':
                    result = result+5;
                    break;
                case'X':
                    if(i<s.length()-1&&(s.charAt(i+1)=='L'||s.charAt(i+1)=='C')){
                        result = result -10;
                    }else{
                        result = result +10;
                    }
                    break;
                case'L':
                    result = result+50;
                    break;
                case'C':
                    if(i<s.length()-1&&(s.charAt(i+1)=='D'||s.charAt(i+1)=='M')){
                        result = result -100;
                    }else{
                        result = result +100;
                    }
                    break;
                case'D':
                    result = result+500;
                    break;
                case'M':
                    result = result+1000;
                    break;
                default:
                    break;


            }

        }

        return result;

    }
}
