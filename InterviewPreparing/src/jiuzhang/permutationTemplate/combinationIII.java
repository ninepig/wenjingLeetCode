package jiuzhang.permutationTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangw on 2017/8/16.
 *
 * Find all possible combinations of k numbers that add up to a number n, given that only numbers from 1 to 9 can be used and each combination should be a unique set of numbers/
 */
public class combinationIII {
    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentList = new ArrayList<>();

        combinationHelper(result,currentList,k,1,n);

        return result;
    }

    private void combinationHelper(List<List<Integer>> result, List<Integer> currentList, int k, int start, int remain) {
        //结束条件
        if(currentList.size()==k && remain==0){
            result.add(new ArrayList<>(currentList));
            return;
        }else {
            // 从1加到9，不重复，如果重复的话 下一轮就是 i 而不是i+1；
            for (int i=start;i<=9;i++ ){
                currentList.add(i);
                combinationHelper(result,currentList,k,i+1,remain-i);
                currentList.remove(currentList.size()-1);
            }

        }
    }
}
