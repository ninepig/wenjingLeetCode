package wenjing.LeetCodeString;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by yamengwenjing on 2016-11-15.
 * Write a function that takes a string as input and reverse only the vowels of a string.
 */
public class ReverseVowelsOfString {

    public static void main(String[] args){
        String test ="hello";
        String result = reverseVowels(test);
        System.out.print(result);
    }

    // 循环过一次字符串，如果是元音，则保存到一个队列里(push),在循环一次，如果还是元音，则把队列pop出来一个放进来，相当于翻转了。
    public static String reverseVowels(String s) {
        if(s==null||s.length()==0){
            return s;
        }
        char[] targetString = s.toCharArray();
        LinkedList<Character> vowelsList = new LinkedList<>();
        for(int i =0 ; i < targetString.length;i++){
            if(ifVowels(targetString[i])){
                //push是放在头部，add是放在尾部 切记
                vowelsList.push(targetString[i]);
            }
        }
        for(int j = 0; j<targetString.length;j++){
            if (ifVowels(targetString[j])){
                targetString[j]=vowelsList.pop();
            }
        }
        return String.valueOf(targetString);
        
        
        
    }

    private static boolean ifVowels(char c) {
        switch (c){
            case 'a':
                    return true;
            case  'o':
                    return true;
            case 'e':
                    return true;
            case 'i':
                    return true;
            case 'u':
                    return true;
            case 'A':
                return true;
            case  'O':
                return true;
            case 'E':
                return true;
            case 'I':
                return true;
            case 'U':
                return true;
            default:
                    break;

        }
        return false;
    }
    //快慢指针！以前没写过脑子就不好使了
    public String reverseVowels2(String s){
        if(s==null||s.length()==0){
            return s;
        }
        char[] CHARaRRAY = s.toCharArray();
        int i = 0 ;
        int j = s.length();
        while(i<j){
            while(i<j&&!ifVowels(CHARaRRAY[i])){
                i++;
            }
            while(i<j&&!ifVowels(CHARaRRAY[j])){
                j--;
            }
            if(i<j){
                char temp = CHARaRRAY[i];
                CHARaRRAY[i]= CHARaRRAY[j];
                CHARaRRAY[j] = temp;
                i++;
                j--;
            }
        }
        return String.valueOf(CHARaRRAY);
    }

}
