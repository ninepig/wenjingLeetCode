package jiuzhang.permutationTemplate.practise;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangw on 2017/6/10.
 */
public class letterCombine {
    public List<String> letterCombinations(String digits) {
        List<String> result  = new ArrayList<>();
        if(digits.length() ==0||digits==null){
            return result;
        }
        StringBuffer currentList = new StringBuffer();
        String[] map = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        helper(result,currentList,map,digits,0);


        return  result;
    }

    private void helper(List<String> result, StringBuffer currentList, String[] map, String digits, int position) {
        if(currentList.length()==digits.length()){
            result.add(currentList.toString());
        }else {
            String currentMap = map[Character.getNumericValue(digits.charAt(position))];
            for(char a:currentMap.toCharArray()){
                currentList.append(a);
                helper(result,currentList,map,digits,position+1);
                currentList.deleteCharAt(currentList.length()-1);
            }


        }

    }
}
