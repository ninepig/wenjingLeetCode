package wenjing.LeetCodeString;

import java.util.LinkedList;

/**
 * Created by yamengwenjing on 2017-04-06.
 */
public class validParenthese {
    public boolean isValid(String s) {
        if(s==null||s.length()==0){
            return true;
        }
        LinkedList<Character> helperStack = new LinkedList<Character>();

        for(int i = 0;i<s.length();i++){
            char thisChar = s.charAt(i);

            switch (thisChar){
                case '(':
                case '[':
                case '{':
                    helperStack.push(thisChar);
                    break;
                case ')':
                    if(helperStack.isEmpty()||(helperStack.pop() !=('('))){
                    return false;
                    }
                case ']':
                    if(helperStack.isEmpty()||(helperStack.pop() !=('['))){
                        return false;
                    }
                case '}':
                    if(helperStack.isEmpty()||(helperStack.pop() !=('{'))){
                        return false;
                    }
                default:
                    break;
            }
        }
        if(helperStack.isEmpty()){
            return true;
        }

        return false;


    }
}
